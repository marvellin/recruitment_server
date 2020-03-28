package cn.edu.scau.linyuanbin.recruitment.controller;

import cn.edu.scau.linyuanbin.recruitment.domain.PersonDetail;
import cn.edu.scau.linyuanbin.recruitment.domain.ResponseObject;
import cn.edu.scau.linyuanbin.recruitment.domain.Resume;
import cn.edu.scau.linyuanbin.recruitment.service.service.PersonDetailService;
import cn.edu.scau.linyuanbin.recruitment.service.service.PersonService;
import cn.edu.scau.linyuanbin.recruitment.service.service.ResumeService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: linyuanbin
 * @Description:
 * done
 * @Date: Created in 19:29 2020/3/25
 */
@RestController
@RequestMapping("/resume")
public class ResumeController {
    @Autowired
    ResumeService service;

    @Autowired
    PersonService personService;

    @Autowired
    PersonDetailService personDetailService;

    /*
    * 根据personId获取一个resume，如果没有则新建一个返回，并且将新建的resumeid赋给personDetail
    * @Param int personId
    * */
    @RequestMapping("/get")
    @ResponseBody
    public ResponseObject get(@RequestParam("personId")Integer personId){
        if(personService.getPersonBypersonId(personId) == null){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        Resume resume = service.getResumeBypersonId(personId);
        if(resume == null){
            PersonDetail personDetail = personDetailService.getPersonDetailBypersonId(personId);

            resume = new Resume();
            resume.setPersonId(personId);
            service.insertResume(resume);
            personDetail.setResumeId(resume.getResumeId());
            personDetailService.updatePersonDetail(personDetail);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",resume);
    }

    /*
    * 更新一个resume（主要为selfdescription和resumename的更新）
    * @Param Resume resume
    * */
    @RequestMapping("/update")
    @ResponseBody
    public ResponseObject get(@RequestBody Resume resume){
        service.updateResume(resume);
        return new ResponseObject(ResponseObject.OK,"更新成功！",resume);
    }
}
