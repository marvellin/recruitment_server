package cn.edu.scau.linyuanbin.recruitment.controller;

import cn.edu.scau.linyuanbin.recruitment.domain.ResponseObject;
import cn.edu.scau.linyuanbin.recruitment.domain.WorkExperience;
import cn.edu.scau.linyuanbin.recruitment.service.service.WorkExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: linyuanbin
 * @Description:
 * done
 * @Date: Created in 19:29 2020/3/25
 */
@RestController
@RequestMapping("/workExperience")
public class WorkExperienceController {
    @Autowired
    WorkExperienceService service;

    /*
    * 修改一个工作经历
    * @RequestBody WorkExperience workExperience
    * */
    @RequestMapping("/update")
    @ResponseBody
    public ResponseObject update(@RequestBody WorkExperience workExperience){
        service.updateWorkExperience(workExperience);
        return new ResponseObject(ResponseObject.OK,"更新成功！",workExperience);
    }

    /*
    * 删除一个工作经历
    * @RequestBody WorkExperience workExperience
    * */
    @RequestMapping("/delete")
    @ResponseBody
    public ResponseObject delete(@RequestBody WorkExperience workExperience){
        service.deleteByworkExperienceId(workExperience.getWorkExperienceId());
        return new ResponseObject(ResponseObject.OK,"删除成功！",null);
    }

    /*
    * 新增一个工作经历
    * @RequestBody WorkExperience workExperience
    * */
    @RequestMapping("/insert")
    @ResponseBody
    public ResponseObject insert(@RequestBody WorkExperience workExperience){
        service.insertWorkExperience(workExperience);
        return new ResponseObject(ResponseObject.OK,"新增成功！",workExperience);
    }
}
