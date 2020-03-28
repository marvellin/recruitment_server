package cn.edu.scau.linyuanbin.recruitment.controller;

import cn.edu.scau.linyuanbin.recruitment.domain.Company;
import cn.edu.scau.linyuanbin.recruitment.domain.ResponseObject;
import cn.edu.scau.linyuanbin.recruitment.domain.User;
import cn.edu.scau.linyuanbin.recruitment.service.service.CompanyService;
import cn.edu.scau.linyuanbin.recruitment.service.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @Autowired
    UserService userService;

    /*
     * 根据companyIdList查找公司list
     * @Param List<Integer> companyIdList
     * */
    @RequestMapping("/getByCompanyIdList")
    @ResponseBody
    public ResponseObject getCompanyListBycompanyIdList(@RequestParam("companyIdList")List<Integer> companyIdList){
        List<Company> companyList = service.getCompanyListBycompanyIdList(companyIdList);
        if (companyList == null || companyList.size() == 0){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",companyList);
    }

    /*
     *根据companyId获得单个对象
     * @Param Integer companyId
     * */
    @RequestMapping("/get")
    @ResponseBody
    public ResponseObject getCompanyByCompanyId(@RequestParam("companyId")Integer companyId){
        Company company = service.getCompanyByCompanyId(companyId);
        if (company == null){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",company);
    }

    /*
     *根据userId获得单个对象，注意判断对应user是否存在，在判断对应user的role是否是company，再判断对应company是否存在
     * 如果不存在则返回新建对象
     * @Param Integer userId
     * */
    @RequestMapping("/getByUserId")
    @ResponseBody
    public ResponseObject getByUserId(@RequestParam("userId")Integer userId){
        if (userService.getUserByuserId(userId) == null || !userService.getUserByuserId(userId).getRole().equals(User.Company)){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        Company company = service.getCompanyByUserId(userId);
        if (company == null){
            company = new Company();
            company.setUserId(userId);
            service.insertCompany(company);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",company);
    }

    /*
     *更新对象
     * @Param Company company
     * */
    @RequestMapping("/update")
    @ResponseBody
    public ResponseObject update(@RequestBody Company company){
        service.updateCompany(company);
        return new ResponseObject(ResponseObject.OK,"更新成功！",company);
    }

    /*
     *新增对象，注意先判断对应user是否存在，再判断对应company是否存在
     * @Param Company company
     * @Param Integer userId
     * */
    @RequestMapping("/insert")
    @ResponseBody
    public ResponseObject insert(@RequestBody Company company, @RequestParam("userId") Integer userId){
        if (userService.getUserByuserId(userId) == null || service.getCompanyByUserId(userId)!=null){
            return new ResponseObject(ResponseObject.ERROR,"新增失败！",null);
        }
        company.setUserId(userId);
        service.insertCompany(company);
        return new ResponseObject(ResponseObject.OK,"新增成功！",company);
    }
}
