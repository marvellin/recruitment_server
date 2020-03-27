package cn.edu.scau.linyuanbin.recruitment.controller;

import cn.edu.scau.linyuanbin.recruitment.domain.ResponseObject;
import cn.edu.scau.linyuanbin.recruitment.service.service.AttachmentResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:29 2020/3/25
 */
@RestController
@RequestMapping("/attachmentResume")
public class AttachmentResumeController {
    @Autowired
    AttachmentResumeService service;

    /*
    * 上传简历附件，新建attachmentresume对象和ossfile对象
    * @Param MultipartFile file 简历附件
    * @Param int personId 个人用户id
    * */
    @RequestMapping("/upload")
    @ResponseBody
    public ResponseObject upload(@RequestParam("file")MultipartFile file, @RequestParam("personId")int personId){
        return null;
    }

    /*
    * 下载简历附件，查询ossFile获取下载路径进行下载
    * @Param int ossId 目标文件的ossFile对象id
    * @Param HttpServletResponse response 文件流返回对象
    * */
    @RequestMapping("/download")
    @ResponseBody
    public ResponseObject download(@RequestParam("ossId")int ossId, HttpServletResponse response){
        return null;
    }

    /*
    * 删除简历附件,删除之前检查是否为默认简历，若是默认简历，则先修改默认简历为在线简历再删除
    * @Param int ossId 目标文件ossFile对象id
    * */
    @RequestMapping("/delete")
    @ResponseBody
    public ResponseObject delete(@RequestParam("ossId")int ossId){
        return null;
    }
}
