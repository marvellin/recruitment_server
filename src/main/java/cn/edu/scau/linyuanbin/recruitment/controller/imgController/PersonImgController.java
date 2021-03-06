package cn.edu.scau.linyuanbin.recruitment.controller.imgController;

import cn.edu.scau.linyuanbin.recruitment.domain.*;
import cn.edu.scau.linyuanbin.recruitment.service.service.OSSFileService;
import cn.edu.scau.linyuanbin.recruitment.service.service.PersonDetailService;
import cn.edu.scau.linyuanbin.recruitment.service.service.PersonImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: linyuanbin
 * @Description:
 * test done
 * @Date: Created in 19:29 2020/3/25
 */
@RestController
@RequestMapping("/personImg")
public class PersonImgController {
    @Autowired
    PersonImgService service;

    @Autowired
    PersonDetailService personDetailService;

    @Autowired
    OSSFileService ossFileService;

    /*
     * 根据personDetailId获得文件，下载返回给前台
     * */
    @RequestMapping("/download")
    public void download(HttpServletResponse response,@RequestParam("personDetailId")Integer personDetailId) throws IOException {
        PersonImg personImg = service.getPersonImgBypersonDetailId(personDetailId);
        if (personImg == null || personImg.getOssFile()==null){
//            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
            return;
        }
        OSSFile ossFile = personImg.getOssFile();
        if (ossFile.getFileUrl()==null){
            return;
        }
        ossFileService.down(ossFile.getFileUrl(),response.getOutputStream());
//        return new ResponseObject(ResponseObject.OK,"下载成功!",null);
    }

    /*
     * 上传个人图片，先判断是否有对应personDetail，再判断是否有personImg对象，如果有则更新，没有则插入
     * @Param MultipartFile file文件目标
     * @Param Integer personDetailId对应个人基本信息
     * @Param Integer userId对应用户（用于文件保存路径的生成）
     * */
    @RequestMapping("/upload")
    @ResponseBody
    public void upload(@RequestParam("file") MultipartFile file, @RequestParam("personDetailId")Integer personDetailId, @RequestParam("userId")Integer userId, HttpServletResponse response) throws IOException {
        if (personDetailService.getPersonDetailBypersonDetailId(personDetailId) == null){
//            return new ResponseObject(ResponseObject.ERROR,"上传失败！",null);
            return;
        }
        OSSFile ossFile =  ossFileService.upload(file,userId,"个人照片",response.getOutputStream());

        PersonImg personImg = service.getPersonImgBypersonDetailId(personDetailId);
        if(personImg != null){
            personImg.setOssId(ossFile.getOssId());
            service.updatePersonImg(personImg);
        }
        else {
            personImg = new PersonImg();
            personImg.setPersonDetailId(personDetailId);
            personImg.setOssId(ossFile.getOssId());
            service.insertPersonImg(personImg);
        }
//        return new ResponseObject(ResponseObject.OK,"上传成功！",personImg);
    }
}
