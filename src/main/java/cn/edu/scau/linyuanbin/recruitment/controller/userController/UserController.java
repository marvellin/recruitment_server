package cn.edu.scau.linyuanbin.recruitment.controller.userController;

import cn.edu.scau.linyuanbin.recruitment.domain.ResponseObject;
import cn.edu.scau.linyuanbin.recruitment.domain.User;
import cn.edu.scau.linyuanbin.recruitment.service.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding;

/**
 * @Author: linyuanbin
 * @Description:
 * test done
 * @Date: Created in 19:29 2020/3/25
 */
@RestController
//@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService service;

    /*
    * 注册,先判断是否已注册了该email，是则返回错误信息，否则新建user
    * @Param String email
    * @Param String password
    * */
    @RequestMapping("/register")
    @ResponseBody
    public ResponseObject register(@RequestParam("email")String email, @RequestParam("password")String password, @RequestParam("type")String type){
        if (service.getUserByemail(email) != null){
            return new ResponseObject(ResponseObject.ERROR,"该账号已被注册！",null);
        }
        else {
            String role = type.equals("true")?User.Person:User.Company;
            User user = new User(0,email,password,role);
            service.insertUser(user,role);
            return new ResponseObject(ResponseObject.OK,"注册成功！",null);
        }
    }

    /*
    * 登陆，先判断是否已注册，否则返回错误信息，是则判断密码是否正确，密码正确则正常返回user对象，否则返回错误信息
    * @Param String email
    * @Param String password
    */
    @RequestMapping("/login")
    @ResponseBody
    public ResponseObject login(@RequestParam("email")String email, @RequestParam("password")String password){
        User user = service.getUserByemail(email);
        if (user == null){
            return new ResponseObject(ResponseObject.ERROR,"此账号未注册！",null);
        }
        else {
            String myPassword = user.getPassword();
            if(!password.equals(myPassword)){
                return new ResponseObject(ResponseObject.ERROR,"密码错误！",null);
            }
            else {
                return new ResponseObject(ResponseObject.OK,"欢迎您！",user);
            }
        }
    }
}
