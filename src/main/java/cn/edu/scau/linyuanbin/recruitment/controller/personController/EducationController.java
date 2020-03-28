package cn.edu.scau.linyuanbin.recruitment.controller.personController;

import cn.edu.scau.linyuanbin.recruitment.domain.Education;
import cn.edu.scau.linyuanbin.recruitment.domain.ResponseObject;
import cn.edu.scau.linyuanbin.recruitment.service.service.EducationService;
import cn.edu.scau.linyuanbin.recruitment.service.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * test done
 * @Date: Created in 19:29 2020/3/25
 */
@RestController
@RequestMapping("/education")
public class EducationController {
    @Autowired
    EducationService service;

    @Autowired
    ResumeService resumeService;

    /*
     * 根据educationId获得单个对象
     * @Param Integer educationId
     * */
    @RequestMapping("/get")
    @ResponseBody
    public ResponseObject get(@RequestParam("educationId")Integer educationId){
        Education education = service.getEducationByeducationId(educationId);
        if (education == null){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",education);
    }

    /*
     *根据resumeId获得多个对象
     * @Param Integer resumeId
     * */
    @RequestMapping("/getListByResumeId")
    @ResponseBody
    public ResponseObject getByResumeId(@RequestParam("resumeId")Integer resumeId){
        List<Education> educationList = service.getEducationListByresumeId(resumeId);
        if (educationList == null || educationList.size() == 0){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",educationList);
    }

    /*
     *新增对象，注意判断对应resume是否存在，如不存在则返回错误信息
     * @Param Education education
     * @Param Integer resumeId
     * */
    @RequestMapping("/insert")
    @ResponseBody
    public ResponseObject insert(@RequestParam("resumeId")Integer resumeId, @RequestBody Education education){
        if (resumeService.getResumeByresumeId(resumeId) == null){
            return new ResponseObject(ResponseObject.ERROR,"新增失败！",null);
        }

        education.setResumeId(resumeId);
        service.insertEducation(education);
        return new ResponseObject(ResponseObject.OK,"新增成功！",education);
    }

    /*
     *根据educationId删除对象
     * @Param Integer educationId
     * */
    @RequestMapping("/delete")
    @ResponseBody
    public ResponseObject delete(@RequestParam("educationId")Integer educationId){
        service.deleteEducationByeducationId(educationId);
        return new ResponseObject(ResponseObject.OK,"删除成功！",null);
    }

    /*
     *更新对象
     * @Param Education education
     * */
    @RequestMapping("/update")
    @ResponseBody
    public ResponseObject update(@RequestBody Education education){
        service.updateEducation(education);
        return new ResponseObject(ResponseObject.OK,"更新成功！",education);
    }
}
