package cn.edu.scau.linyuanbin.recruitment.controller.companyController;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyLabel;
import cn.edu.scau.linyuanbin.recruitment.domain.ResponseObject;
import cn.edu.scau.linyuanbin.recruitment.service.service.CompanyDetailService;
import cn.edu.scau.linyuanbin.recruitment.service.service.CompanyLabelService;
import cn.edu.scau.linyuanbin.recruitment.service.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * test done
 * @Date: Created in 19:29 2020/3/25
 */
@RestController
@RequestMapping("/companyLabel")
public class CompanyLabelController {
    @Autowired
    CompanyLabelService service;

    @Autowired
    CompanyDetailService companyDetailService;

    /*
     *根据companyDetailId获取多个对象list
     * @Param Integer companyDetailId
     * */
    @RequestMapping("/getByCompanyDetailId")
    @ResponseBody
    public ResponseObject getByCompanyDetailId(@RequestParam("companyDetailId")Integer companyDetailId){
        if (companyDetailService.getCompantDetailByCompanyDetailId(companyDetailId)==null){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        List<CompanyLabel> labelList = service.getLabelListByCompanyDetailId(companyDetailId);
        if (labelList == null || labelList.size() == 0){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",labelList);
    }

    /*
     *根据companyLabelId获取单个对象
     * @Param Integer companyLabelId
     * */
    @RequestMapping("/get")
    @ResponseBody
    public ResponseObject get(@RequestParam("companyLabelId")Integer companyLabelId){
        CompanyLabel companyLabel = service.getLabelByCompanyLabelId(companyLabelId);
        if (companyLabel == null){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",companyLabel);
    }

    /*
     *根据companyLabelId删除一个对象
     * @Param Integer companyLabelId
     * */
    @RequestMapping("/delete")
    @ResponseBody
    public ResponseObject delete(@RequestParam("companyLabelId")Integer companyLabelId){
        service.deleteByCompanyLabelId(companyLabelId);
        return new ResponseObject(ResponseObject.OK,"删除成功！",null);
    }

    /*
     *保存一个对象
     * @Param CompanyLabel companyLabel
     * @Param Integer companyDetailId
     * */
    @RequestMapping("/insert")
    @ResponseBody
    public ResponseObject insert(@RequestBody CompanyLabel companyLabel, @RequestParam("companyDetailId")Integer companyDetailId){
//        System.out.println(companyLabel.toString());
        if(companyDetailService.getCompantDetailByCompanyDetailId(companyDetailId)==null){
            return new ResponseObject(ResponseObject.ERROR,"新增失败！",null);
        }
        companyLabel.setCompanyDetailId(companyDetailId);
        service.insertCompanyLabel(companyLabel);
        return new ResponseObject(ResponseObject.OK,"新增成功！",companyLabel);
    }

    /*
     *保存对个对象
     * @Param List<CompanyLabel> companyLabelList
     * @Param Integer companyDetailId
     * */
    @RequestMapping("/insertList")
    @ResponseBody
    public ResponseObject insertList(@RequestBody List<CompanyLabel> companyLabelList, @RequestParam("companyDetailId") Integer companyDetailId){
        if(companyDetailService.getCompantDetailByCompanyDetailId(companyDetailId)==null){
            return new ResponseObject(ResponseObject.ERROR,"新增失败！",null);
        }
        for (CompanyLabel companyLabel:companyLabelList){
            companyLabel.setCompanyDetailId(companyDetailId);
        }
        service.insertCompanyLabelList(companyLabelList);
        return new ResponseObject(ResponseObject.OK,"新增成功！",companyLabelList);
    }
}
