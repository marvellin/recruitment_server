/*
package cn.edu.scau.linyuanbin.recruitment.controller;

import cn.edu.scau.linyuanbin.recruitment.domain.ResponseObject;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

*/
/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 22:08 2020/3/26
 *//*

@RequestMapping("/test")
public class ShiroTestController {
    @RequestMapping("/ajaxLogin")
    @ResponseBody
    public ResponseObject ajaxLogin(@RequestParam("email")String email,@RequestParam("password")String password){
        ResponseObject responseObject = new ResponseObject();
        UsernamePasswordToken token = new UsernamePasswordToken(email,password);
        Subject subject = SecurityUtils.getSubject();
        try{
            subject.login(token);
            responseObject.setCode(ResponseObject.OK);
            responseObject.setMsg("登陆成功");
        }catch (IncorrectCredentialsException e){
            responseObject.setCode(ResponseObject.ERROR);
            responseObject.setMsg("密码错误");
        }catch (AuthenticationException e){
            responseObject.setCode(ResponseObject.ERROR);
            responseObject.setMsg("该用户不存在");
        }
        return responseObject;
    }
}
*/
