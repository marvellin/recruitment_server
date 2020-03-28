package cn.edu.scau.linyuanbin.recruitment.controller;

import cn.edu.scau.linyuanbin.recruitment.domain.ResponseObject;
import cn.edu.scau.linyuanbin.recruitment.domain.WorkExperience;
import cn.edu.scau.linyuanbin.recruitment.service.service.ResumeService;
import cn.edu.scau.linyuanbin.recruitment.service.service.WorkExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    ResumeService resumeService;

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
    * 新增一个工作经历，先判断对应简历是否存在
    * @RequestBody WorkExperience workExperience
    * @Param Integer resumeId
    * */
    @RequestMapping("/insert")
    @ResponseBody
    public ResponseObject insert(@RequestBody WorkExperience workExperience, @RequestParam("resumeId")Integer resumeId){
        if(resumeService.getResumeByresumeId(resumeId) == null){
            return new ResponseObject(ResponseObject.ERROR,"新增失败!",null);
        }
        workExperience.setResumeId(resumeId);
        service.insertWorkExperience(workExperience);
        return new ResponseObject(ResponseObject.OK,"新增成功！",workExperience);
    }
}
