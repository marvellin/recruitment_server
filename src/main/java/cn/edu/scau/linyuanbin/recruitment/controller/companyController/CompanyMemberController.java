package cn.edu.scau.linyuanbin.recruitment.controller.companyController;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyMember;
import cn.edu.scau.linyuanbin.recruitment.domain.ResponseObject;
import cn.edu.scau.linyuanbin.recruitment.service.service.CompanyMemberService;
import cn.edu.scau.linyuanbin.recruitment.service.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: linyuanbin
 * @Description:
 * test done
 * @Date: Created in 19:29 2020/3/25
 */
@RestController
@RequestMapping("/companyMember")
public class CompanyMemberController {
    @Autowired
    CompanyMemberService service;

    @Autowired
    CompanyService companyService;

    /*
     *根据companyMemberId获得单个对象
     * @Param Integer companyMemberId
     * */
    @RequestMapping("/get")
    @ResponseBody
    public ResponseObject getCompanyMemberBycompanyMemberId(@RequestParam("companyMemberId") Integer companyMemberId){
        CompanyMember companyMember = service.getCompanyMemberBycompanyMemberId(companyMemberId);
        if (companyMember == null){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",companyMember);
    }

    /*
     *根据companyId获得单个对象
     * @Param Integer companyId
     * */
    @RequestMapping("/getByCompanyId")
    @ResponseBody
    public ResponseObject getCompanyMemberBycompanyId(@RequestParam("companyId") Integer companyId){
        if (companyService.getCompanyByCompanyId(companyId) == null){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        CompanyMember companyMember = service.getCompanyMemberBycompanyId(companyId);
        if (companyMember == null){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",companyMember);
    }

    /*
     *新增对象，注意先判断对应company是否存在，再判断对应member是否存在
     * @Param CompanyMember companyMember
     * @Param Integer companyId
     * */
    @RequestMapping("/insert")
    @ResponseBody
    public ResponseObject insertCompanyMember(@RequestBody CompanyMember companyMember, @RequestParam("companyId") Integer companyId){
        if (companyService.getCompanyByCompanyId(companyId) == null){
            return new ResponseObject(ResponseObject.ERROR,"新增失败！",null);
        }
        else if(service.getCompanyMemberBycompanyId(companyId)!=null){
            service.updateCompanyMember(companyMember);
            return new ResponseObject(ResponseObject.OK,"新增成功！",companyMember);
        }
        companyMember.setCompanyId(companyId);
        service.insertCompanyMember(companyMember);
        return new ResponseObject(ResponseObject.OK,"新增成功！",companyMember);
    }

    /*
     *更新对象
     * @Param CompanyMember companyMember
     * */
    @RequestMapping("/update")
    @ResponseBody
    public ResponseObject updateCompanyMember(@RequestBody CompanyMember companyMember){
        service.updateCompanyMember(companyMember);
        return new ResponseObject(ResponseObject.OK,"更新成功！",companyMember);
    }

    /*
     *根据companyMemberId删除对象
     * @Param Integer companyMemberId
     * */
    @RequestMapping("/delete")
    @ResponseBody
    public ResponseObject deleteBycompanyMemberId(@RequestParam("companyMemberId") Integer companyMemberId){
        service.deleteBycompanyMemberId(companyMemberId);
        return new ResponseObject(ResponseObject.OK,"删除成功！",null);
    }
}
