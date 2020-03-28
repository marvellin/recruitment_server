package cn.edu.scau.linyuanbin.recruitment.controller;

import cn.edu.scau.linyuanbin.recruitment.domain.Company;
import cn.edu.scau.linyuanbin.recruitment.domain.CompanyDetail;
import cn.edu.scau.linyuanbin.recruitment.domain.ResponseObject;
import cn.edu.scau.linyuanbin.recruitment.service.service.CompanyDetailService;
import cn.edu.scau.linyuanbin.recruitment.service.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:29 2020/3/25
 */
@RestController
@RequestMapping("/companyDetail")
public class CompanyDetailController {
    @Autowired
    CompanyDetailService service;

    @Autowired
    CompanyService companyService;

    /*
     *根据关键字模糊查询公司名匹配的公司idList
     * @Param String companyName
     * */
    @RequestMapping("/getCompanyIdList")
    @ResponseBody
    public ResponseObject getCompanyIdList(@RequestParam("companyName") String companyName){
        List<Integer> companyIdList = service.getCompanyIdByFuzzyQuery(companyName);
        if (companyIdList == null || companyIdList.size() == 0){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",companyIdList);
    }

    /*
     * 根据companyDetailId获取单个对象
     * @Param Integer companyDetailId
     * */
    @RequestMapping("/get")
    @ResponseBody
    public ResponseObject get(@RequestParam("companyDetailId") Integer companyDetailId){
        CompanyDetail companyDetail = service.getCompantDetailByCompanyDetailId(companyDetailId);
        if (companyDetail == null){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",companyDetail);
    }

    /*
     * 根据companyId获取单个对象
     * @Param Integer companyId
     * */
    @RequestMapping("/getByCompanyId")
    @ResponseBody
    public ResponseObject getByCompanyId(@RequestParam("companyId")Integer companyId){
        if (companyService.getCompanyByCompanyId(companyId) == null){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        CompanyDetail companyDetail = service.getCompantDetailBycompanyId(companyId);
        if (companyDetail == null){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",companyDetail);
    }

    /*
     * 保存一个对象，先判断对应company是否存在，再判断对应companyDetail是否存在
     * @Param CompanyDetail companyDetail
     * @Param Integer companyId
     * */
    @RequestMapping("/insert")
    @ResponseBody
    public ResponseObject insert(@RequestBody CompanyDetail companyDetail, @RequestParam("companyId") Integer companyId){
        if (companyService.getCompanyByCompanyId(companyId) == null || service.getCompantDetailBycompanyId(companyId) != null){
            return new ResponseObject(ResponseObject.ERROR,"新增失败！",null);
        }
        companyDetail.setCompanyId(companyId);
        service.insertCompanyDetail(companyDetail);
        return new ResponseObject(ResponseObject.OK,"新增成功！",companyDetail);
    }

    /*
     * 更新一个对象
     * @Param CompanyDetail companyDetail
     * */
    @RequestMapping("/update")
    @ResponseBody
    public ResponseObject update(@RequestBody CompanyDetail companyDetail){
        service.updateCompanyDetail(companyDetail);
        return new ResponseObject(ResponseObject.OK,"更新成功！",companyDetail);
    }
}
