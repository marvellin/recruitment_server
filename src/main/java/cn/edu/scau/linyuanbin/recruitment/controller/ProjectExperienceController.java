package cn.edu.scau.linyuanbin.recruitment.controller;

import cn.edu.scau.linyuanbin.recruitment.domain.ProjectExperience;
import cn.edu.scau.linyuanbin.recruitment.domain.ResponseObject;
import cn.edu.scau.linyuanbin.recruitment.domain.WorkExperience;
import cn.edu.scau.linyuanbin.recruitment.service.service.ProjectExperienceService;
import cn.edu.scau.linyuanbin.recruitment.service.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: linyuanbin
 * @Description:
 * done
 * @Date: Created in 19:29 2020/3/25
 */
@RestController
@RequestMapping("/projectExperience")
public class ProjectExperienceController {
    @Autowired
    ProjectExperienceService service;

    @Autowired
    ResumeService resumeService;

    /*
     * 修改一个项目经历
     * @RequestBody ProjectExperience projectExperience
     * */
    @RequestMapping("/update")
    @ResponseBody
    public ResponseObject update(@RequestBody ProjectExperience projectExperience){
        service.updateProjectExperience(projectExperience);
        return new ResponseObject(ResponseObject.OK,"更新成功！",projectExperience);
    }

    /*
     * 删除一个项目经历
     * @RequestBody ProjectExperience projectExperience
     * */
    @RequestMapping("/delete")
    @ResponseBody
    public ResponseObject delete(@RequestBody ProjectExperience projectExperience){
        service.deleteByprojectExperienceId(projectExperience.getProjectExperienceId());
        return new ResponseObject(ResponseObject.OK,"删除成功！",null);
    }

    /*
     * 新增一个项目经历
     * @RequestBody ProjectExperience projectExperience
     * */
    @RequestMapping("/insert")
    @ResponseBody
    public ResponseObject insert(@RequestBody ProjectExperience projectExperience, @RequestParam("resumeId")Integer resumeId){
        if(resumeService.getResumeByresumeId(resumeId) == null){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        projectExperience.setResumeId(resumeId);
        service.insertProjectExperience(projectExperience);
        return new ResponseObject(ResponseObject.OK,"新增成功！",projectExperience);
    }
}
