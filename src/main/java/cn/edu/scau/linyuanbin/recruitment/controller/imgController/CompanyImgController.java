package cn.edu.scau.linyuanbin.recruitment.controller.imgController;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyImg;
import cn.edu.scau.linyuanbin.recruitment.domain.OSSFile;
import cn.edu.scau.linyuanbin.recruitment.domain.PersonImg;
import cn.edu.scau.linyuanbin.recruitment.domain.ResponseObject;
import cn.edu.scau.linyuanbin.recruitment.service.service.CompanyDetailService;
import cn.edu.scau.linyuanbin.recruitment.service.service.CompanyImgService;
import cn.edu.scau.linyuanbin.recruitment.service.service.OSSFileService;
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
@RequestMapping("/companyImg")
public class CompanyImgController {
    @Autowired
    CompanyImgService service;

    @Autowired
    OSSFileService ossFileService;

    @Autowired
    CompanyDetailService companyDetailService;

    /*
    * 根据companyDetailId获得文件，下载返回给前台
    * */
    @RequestMapping("/download")
    public void download(HttpServletResponse response,@RequestParam("companyDetailId")Integer companyDetailId) throws IOException {
        System.out.println("enter download "+companyDetailId);
        CompanyImg companyImg = service.getCompanyImgByCompanyDetailId(companyDetailId);
        if (companyImg == null || companyImg.getOssFile()==null){
//            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
            return;
        }
        OSSFile ossFile = companyImg.getOssFile();
        if(ossFile.getFileUrl()==null){
//            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
            return;
        }
        ossFileService.down(ossFile.getFileUrl(),response.getOutputStream());
//        return new ResponseObject(ResponseObject.OK,"下载成功!",null);
    }

    /*
     * 上传公司图标，先判断是否有对应companyDetail，再判断是否有companyImg对象，如果有则更新，没有则插入
     * @Param MultipartFile file文件目标
     * @Param Integer companyDetailId对应个人基本信息
     * @Param Integer userId对应用户（用于文件保存路径的生成）
     * */
    @RequestMapping("/upload")
    @ResponseBody
    public void upload(@RequestParam("file") MultipartFile file, @RequestParam("companyDetailId")Integer companyDetailId, @RequestParam("userId")Integer userId, HttpServletResponse response) throws IOException {
        if (companyDetailService.getCompantDetailByCompanyDetailId(companyDetailId) == null){
//            return new ResponseObject(ResponseObject.ERROR,"上传失败！",null);
            return;
        }
        OSSFile ossFile =  ossFileService.upload(file,userId,"公司图标",response.getOutputStream());

        CompanyImg companyImg = service.getCompanyImgByCompanyDetailId(companyDetailId);
        if(companyImg != null){
            companyImg.setOssId(ossFile.getOssId());
            service.updateCompanyImg(companyImg);
        }
        else {
            companyImg = new CompanyImg();
            companyImg.setCompanyDetailId(companyDetailId);
            companyImg.setOssId(ossFile.getOssId());
            service.insertCompanyImg(companyImg);
        }
//        return new ResponseObject(ResponseObject.OK,"上传成功！",companyImg);
    }
}
