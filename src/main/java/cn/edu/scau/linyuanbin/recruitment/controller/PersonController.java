package cn.edu.scau.linyuanbin.recruitment.controller;

import cn.edu.scau.linyuanbin.recruitment.domain.Person;
import cn.edu.scau.linyuanbin.recruitment.domain.ResponseObject;
import cn.edu.scau.linyuanbin.recruitment.domain.User;
import cn.edu.scau.linyuanbin.recruitment.service.service.PersonService;
import cn.edu.scau.linyuanbin.recruitment.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:29 2020/3/25
 */
@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    PersonService service;

    @Autowired
    UserService userService;

    /*
     *根据personId查找对象
     * @Param Integer personId
     * */
    @RequestMapping("/get")
    @ResponseBody
    public ResponseObject get(@RequestParam("personId")Integer personId){
        Person person = service.getPersonBypersonId(personId);
        if(person == null){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",person);
    }

    /*
     *根据userId查找对象,先判断对应user是否存在，再判断对应user的role是否是person，再判断对应person是否存在
     * 如果不存在则返回新建对象
     * @Param Integer userId
     * */
    @RequestMapping("/getByUserId")
    @ResponseBody
    public ResponseObject getbyUserId(@RequestParam("userId")Integer userId){
        if (userService.getUserByuserId(userId) == null || !userService.getUserByuserId(userId).getRole().equals(User.Person)){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        Person person = service.getPersonByuserId(userId);
        if (person == null){
            person = new Person();
            person.setUserId(userId);
            service.insertPerson(person);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",person);
    }

    /*
     *新增对象
     * @Param Person person
     * @Param Integer userId
     * */
    @RequestMapping("/insert")
    @ResponseBody
    public ResponseObject insert(@RequestBody Person person,@RequestParam("userId")Integer userId){
        if(userService.getUserByuserId(userId) == null || service.getPersonByuserId(userId)!=null){
            return new ResponseObject(ResponseObject.ERROR,"新增失败！",null);
        }
        person.setUserId(userId);
        service.insertPerson(person);
        return new ResponseObject(ResponseObject.OK,"新增成功！",person);
    }
}
