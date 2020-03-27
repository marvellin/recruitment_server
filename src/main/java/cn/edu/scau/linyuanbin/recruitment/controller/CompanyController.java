package cn.edu.scau.linyuanbin.recruitment.controller;

import cn.edu.scau.linyuanbin.recruitment.domain.ResponseObject;
import cn.edu.scau.linyuanbin.recruitment.service.service.CompanyService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:29 2020/3/25
 */
@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    CompanyService service;

    /*
    * 根据userId获取company对象
    * @Param int userId 用户id
    */
    @RequestMapping("/get")
    @ResponseBody
    public ResponseObject getCompany(@Param("userId")int userId){
        return null;
    }
}
