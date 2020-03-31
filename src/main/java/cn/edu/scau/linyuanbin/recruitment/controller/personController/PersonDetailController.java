package cn.edu.scau.linyuanbin.recruitment.controller.personController;

import cn.edu.scau.linyuanbin.recruitment.domain.PersonDetail;
import cn.edu.scau.linyuanbin.recruitment.domain.ResponseObject;
import cn.edu.scau.linyuanbin.recruitment.service.service.PersonDetailService;
import cn.edu.scau.linyuanbin.recruitment.service.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: linyuanbin
 * @Description:
 * test done
 * @Date: Created in 19:29 2020/3/25
 */
@RestController
@RequestMapping("/personDetail")
public class PersonDetailController {
    @Autowired
    PersonDetailService service;

    @Autowired
    PersonService personService;

    /*
     *根据personDetailId查找对象
     *@Param Integer personDetailId
     * */
    @RequestMapping("get")
    @ResponseBody
    public ResponseObject get(@RequestParam("personDetailId")Integer personDetailId){
        PersonDetail personDetail = service.getPersonDetailBypersonDetailId(personDetailId);
        if (personDetail == null){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",personDetail);
    }

    /*
     *根据personId查找对象，先判断对应person是否存在，再判断对应personDetail是否存在，没有则返回一个新建对象
     * @Param Integer personId
     * */
    @RequestMapping("getByPersonId")
    @ResponseBody
    public ResponseObject getByPersonId(@RequestParam("personId")Integer personId){
        if(personService.getPersonBypersonId(personId) == null){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }

        PersonDetail personDetail = service.getPersonDetailBypersonId(personId);
        if(personDetail == null){
            personDetail = new PersonDetail();
            personDetail.setPersonId(personId);
            service.insertPersonDetail(personDetail);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",personDetail);
    }

    /*
     *根据resumeId查找对象
     * @Param Integer resumeId
     * */
    @RequestMapping("getByresumeId")
    @ResponseBody
    public ResponseObject getByresumeId(@RequestParam("resumeId")Integer resumeId){
        PersonDetail personDetail = service.getPersonDetailByresumeId(resumeId);
        return new ResponseObject(ResponseObject.OK,"获取成功！",personDetail);
    }


    /*
     *根据personId新增对象，注意判断email和特里是否唯一，数据库有唯一约束
     * @Param Integer personId
     * @RequestBody PersonDetail personDetail
     * */
    @RequestMapping("/insert")
    @ResponseBody
    public ResponseObject insert(@RequestBody PersonDetail personDetail,@RequestParam("personId")Integer personId){
        if (personService.getPersonBypersonId(personId) == null || service.getPersonDetailBypersonId(personId) != null){
            return new ResponseObject(ResponseObject.ERROR,"新增失败！",null);
        }
        if (service.getPersonDetailByEmail(personDetail.getEmail())!=null){
            return new ResponseObject(ResponseObject.ERROR,"该邮箱已被使用！",null);
        }
        if(service.getPersonDetailByTel(personDetail.getTel())!=null){
            return new ResponseObject(ResponseObject.ERROR,"该手机号码已被使用！",null);
        }
        personDetail.setPersonId(personId);
        service.insertPersonDetail(personDetail);
        return new ResponseObject(ResponseObject.OK,"新增成功！",personDetail);
    }


    /*
     *更新对象,注意判断email和特里是否唯一，数据库有唯一约束
     * @Param PersonDetail personDetail
     * */
    @RequestMapping("update")
    @ResponseBody
    public ResponseObject update(@RequestBody PersonDetail personDetail){
        if (service.getPersonDetailByEmail(personDetail.getEmail()).getPersonDetailId()!=personDetail.getPersonDetailId()){
            return new ResponseObject(ResponseObject.ERROR,"该邮箱已被使用！",null);
        }
        if(service.getPersonDetailByTel(personDetail.getTel()).getPersonDetailId()!=personDetail.getPersonDetailId()){
            return new ResponseObject(ResponseObject.ERROR,"该手机号码已被使用！",null);
        }
        service.updatePersonDetail(personDetail);
        return new ResponseObject(ResponseObject.OK,"更新成功！",personDetail);
    }

}
