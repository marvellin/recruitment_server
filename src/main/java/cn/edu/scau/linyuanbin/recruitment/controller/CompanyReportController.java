package cn.edu.scau.linyuanbin.recruitment.controller;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyReport;
import cn.edu.scau.linyuanbin.recruitment.domain.ResponseObject;
import cn.edu.scau.linyuanbin.recruitment.service.service.CompanyReportService;
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
@RequestMapping("/companyReport")
public class CompanyReportController {
    @Autowired
    CompanyReportService service;

    @Autowired
    CompanyService companyService;

    /*
     *根据companyReportId获取单个对象
     * @Param Integer companyReportId
     * */
    @RequestMapping("/get")
    @ResponseBody
    public ResponseObject get(@RequestParam("companyReportId") Integer companyReportId){
        CompanyReport companyReport = service.getCompanyReportBycompanyReportId(companyReportId);
        if (companyReport == null){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",companyReport);
    }

    /*
     *根据companyId获取多个对象list，注意先判断对应company是否存在
     * @Param Integer companyId
     * */
    @RequestMapping("/getByCompanyId")
    @ResponseBody
    public ResponseObject getByCompanyId(@RequestParam("companyId")Integer companyId){
        if (companyService.getCompanyByCompanyId(companyId)==null){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        List<CompanyReport> reportList = service.getCompanyReportListBycompanyId(companyId);
        if (reportList == null || reportList.size() == 0){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",reportList);
    }

    /*
     *新增对象，注意判断对应company是否存在
     * @Param CompanyReport companyReport
     * @Param Integer companyId
     * */
    @RequestMapping("/insert")
    @ResponseBody
    public ResponseObject insert(@RequestBody CompanyReport companyReport,@RequestParam("companyId")Integer companyId){
        if (companyService.getCompanyByCompanyId(companyId) == null){
            return new ResponseObject(ResponseObject.ERROR,"新增失败！",null);
        }
        companyReport.setCompanyId(companyId);
        service.insertCompanyReport(companyReport);
        return new ResponseObject(ResponseObject.OK,"新增成功！",companyReport);
    }

    /*
     *根据companyReportId删除对象
     * @Param Integer companyReportId
     * */
    @RequestMapping("/delete")
    @ResponseBody
    public ResponseObject delete(@RequestParam("companyReportId")Integer companyReportId){
        service.deleteBycompanyReportId(companyReportId);
        return new ResponseObject(ResponseObject.OK,"删除成功！",null);
    }

    /*
     *更新对象
     * @Param CompanyReport companyReport
     * */
    @RequestMapping("/update")
    @ResponseBody
    public ResponseObject update(@RequestBody CompanyReport companyReport){
        service.updateCompanyReport(companyReport);
        return new ResponseObject(ResponseObject.OK,"更新成功！",companyReport);
    }
}
