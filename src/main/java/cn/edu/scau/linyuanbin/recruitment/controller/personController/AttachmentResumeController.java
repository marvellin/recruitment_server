package cn.edu.scau.linyuanbin.recruitment.controller.personController;

import cn.edu.scau.linyuanbin.recruitment.domain.*;
import cn.edu.scau.linyuanbin.recruitment.service.service.AttachmentResumeService;
import cn.edu.scau.linyuanbin.recruitment.service.service.DefaultResumeService;
import cn.edu.scau.linyuanbin.recruitment.service.service.OSSFileService;
import cn.edu.scau.linyuanbin.recruitment.service.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * test done
 * @Date: Created in 19:29 2020/3/25
 */
@RestController
@RequestMapping("/attachmentResume")
public class AttachmentResumeController {
    @Autowired
    AttachmentResumeService service;

    @Autowired
    OSSFileService ossFileService;

    @Autowired
    PersonService personService;

    @Autowired
    DefaultResumeService defaultResumeService;

    /*
     * 根据attachmentId获得单个文件，下载返回给前台
     * */
    @RequestMapping("/download")
    public ResponseObject download(HttpServletResponse response,@RequestParam("attachmentResumeId")Integer attachmentResumeId) throws IOException {
        AttachMentResume attachMentResume = service.getAttachMentResumeByAttachmentResumeId(attachmentResumeId);
        if (attachMentResume==null || attachMentResume.getOssFile()==null){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        OSSFile ossFile = attachMentResume.getOssFile();
        ossFileService.down(ossFile.getFileUrl(),response.getOutputStream());
        return new ResponseObject(ResponseObject.OK,"下载成功!",null);
    }

    /*
    * 根据personId获取简历附件list
    * @Param Integer personId
    * */
    @RequestMapping("/getByPersonId")
    @ResponseBody
    public ResponseObject getByPersonId(@RequestParam("personId")Integer personId){
        if (personService.getPersonBypersonId(personId)==null){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        List<AttachMentResume> attachMentResumeList = service.getAttachMentResumeListByPersonId(personId);
        return new ResponseObject(ResponseObject.OK,"获取成功！",attachMentResumeList);
    }

    /*
    * 上传简历附件，新建attachmentresume对象和ossfile对象，注意先判断对应person是否存在
    * @Param MultipartFile file 简历附件
    * @Param Integer userId用户id
    * */
    @RequestMapping("/upload")
    @ResponseBody
    public ResponseObject upload(@RequestParam("file")MultipartFile file, @RequestParam("userId")Integer userId,HttpServletResponse response) throws IOException {
        Person person = personService.getPersonByuserId(userId);
        if (person == null){
            return new ResponseObject(ResponseObject.ERROR,"上传失败！",null);
        }
        OSSFile ossFile = ossFileService.upload(file,userId,"个人简历附件",response.getOutputStream());

        AttachMentResume attachMentResume = new AttachMentResume();
        attachMentResume.setPersonId(person.getPersonId());
        attachMentResume.setOssId(ossFile.getOssId());
        attachMentResume.setName(file.getOriginalFilename());

        service.insertAttachMentResume(attachMentResume);
        return new ResponseObject(ResponseObject.OK,"上传成功！",attachMentResume);
    }

    /*
    * 下载简历附件，查询ossFile获取下载路径进行下载，注意判断对应ossFile是否存在
    * @Param Integer ossId 目标文件的ossFile对象id
    * @Param HttpServletResponse response 文件流返回对象
    * */
    /*@RequestMapping("/download")
    @ResponseBody
    public ResponseObject download(@RequestParam("ossId")Integer ossId, HttpServletResponse response) throws IOException {
        if (ossFileService.getOSSFileByossId(ossId) == null){
            return new  ResponseObject(ResponseObject.ERROR,"下载失败！",null);
        }
        ossFileService.down(ossFileService.getOSSFileByossId(ossId).getFileUrl(),response.getOutputStream());
        return new  ResponseObject(ResponseObject.OK,"下载成功！",null);
    }*/

    /*
    * 删除简历附件,注意先判断对应person是否存在，删除之前检查是否为默认简历，若是默认简历，则先修改默认简历为在线简历再删除
    * @Param Integer attachmentResumeId 目标简历附件对象id
    * @Param Integer personId
    * */
    @RequestMapping("/delete")
    @ResponseBody
    public ResponseObject delete(@RequestParam("attachmentResumeId")Integer attachmentResumeId, @RequestParam("personId")Integer personId){
        if (personService.getPersonBypersonId(personId) == null){
            return new ResponseObject(ResponseObject.ERROR,"删除失败！",null);
        }
        DefaultResume defaultResume =  defaultResumeService.getDefaultResumeBypersonId(personId);
        if (defaultResume.getAttachmentResumeId() == attachmentResumeId){
            defaultResume.setAttachmentResumeId(null);
            defaultResume.setResumeId(personService.getPersonBypersonId(personId).getResume().getResumeId());
            defaultResumeService.updateDefaultResume(defaultResume);
        }
        service.deleteAttachMentResumeByAttachmentResumeId(attachmentResumeId);
        return new ResponseObject(ResponseObject.OK,"删除成功！",null);
    }
}
