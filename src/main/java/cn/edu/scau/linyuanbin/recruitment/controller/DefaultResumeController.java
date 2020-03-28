package cn.edu.scau.linyuanbin.recruitment.controller;

import cn.edu.scau.linyuanbin.recruitment.domain.DefaultResume;
import cn.edu.scau.linyuanbin.recruitment.domain.ResponseObject;
import cn.edu.scau.linyuanbin.recruitment.service.service.DefaultResumeService;
import cn.edu.scau.linyuanbin.recruitment.service.service.PersonService;
import cn.edu.scau.linyuanbin.recruitment.service.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:29 2020/3/25
 */
@RestController
@RequestMapping("/defaultResume")
public class DefaultResumeController {
    @Autowired
    DefaultResumeService service;

    @Autowired
    PersonService personService;

    @Autowired
    ResumeService resumeService;

    /*
     *根据defaultResumeId查找对象
     * @Param Integer defaultResumeId
     * */
    @RequestMapping("/get")
    @ResponseBody
    public ResponseObject get(@RequestParam("defaultResumeId")Integer defaultResumeId){
        DefaultResume defaultResume = service.getDefaultResumeBydefaultResumeId(defaultResumeId);
        if (defaultResume == null){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",defaultResume);
    }

    /*
     *根据personId查找对象，注意判断对应person是否存在，在判断对应defaultResume是否存在，如果不不存在则新建对象返回
     * @Param Integer personId
     * */
    @RequestMapping("/getByPersonId")
    @ResponseBody
    public ResponseObject getByPersonId(@RequestParam("personId")Integer personId){
        if (personService.getPersonBypersonId(personId) == null){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        DefaultResume defaultResume = service.getDefaultResumeBypersonId(personId);
        if (defaultResume == null){
            defaultResume = new DefaultResume();
            defaultResume.setPersonId(personId);
            defaultResume.setResumeId(resumeService.getResumeBypersonId(personId).getResumeId());
            service.insertDefaultResume(defaultResume);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",defaultResume);
    }

    /*
     *更新对象
     * @Param DefaultResume defaultResume
     * */
    @RequestMapping("/update")
    @ResponseBody
    public ResponseObject update(@RequestBody DefaultResume defaultResume){
        service.updateDefaultResume(defaultResume);
        return new ResponseObject(ResponseObject.OK,"更新成功！",defaultResume);
    }

    /*
     *新增对象，注意判断对应person是否存在，再判断对应defaultResume是否存在
     * 且默认简历初始默认为在线简历resume，即需要查找对应person的对应resumeId，如果没有则置空
     * @Param DefaultResume defaultResume
     * @Param Integer personId
     * */
    @RequestMapping("/insert")
    @ResponseBody
    public ResponseObject insert(@RequestBody DefaultResume defaultResume,@RequestParam("personId")Integer personId){
        if (personService.getPersonBypersonId(personId) == null || service.getDefaultResumeBypersonId(personId)!=null){
            return new ResponseObject(ResponseObject.ERROR,"新增失败！",null);
        }
        defaultResume.setPersonId(personId);
        defaultResume.setResumeId(resumeService.getResumeBypersonId(personId).getResumeId());
        service.insertDefaultResume(defaultResume);
        return new ResponseObject(ResponseObject.OK,"新增成功！",defaultResume);
    }
}
