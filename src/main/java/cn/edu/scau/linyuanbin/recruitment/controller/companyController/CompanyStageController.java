package cn.edu.scau.linyuanbin.recruitment.controller.companyController;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyStage;
import cn.edu.scau.linyuanbin.recruitment.domain.ResponseObject;
import cn.edu.scau.linyuanbin.recruitment.service.service.CompanyService;
import cn.edu.scau.linyuanbin.recruitment.service.service.CompanyStageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: linyuanbin
 * @Description:
 * test done
 * @Date: Created in 19:29 2020/3/25
 */
@RestController
@RequestMapping("/companyStage")
public class CompanyStageController {
    @Autowired
    CompanyStageService service;

    @Autowired
    CompanyService companyService;

    /*
     *根据companyStageId获取对象
     * @Param Integer companyStageId
     * */
    @RequestMapping("/get")
    @ResponseBody
    public ResponseObject get(@RequestParam("companyStageId") Integer companyStageId){
        CompanyStage companyStage = service.getCompanyStageBycompanyStageId(companyStageId);
        if (companyStage == null){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",companyStage);
    }

    /*
     *根据companyId获取对象，先判断对应company是否存在，在判断对应companystage是否存在
     * 如不存在则新建对象返回
     * @Param Integer companyId
     * */
    @RequestMapping("/getByCompanyId")
    @ResponseBody
    public ResponseObject getByCompanyId(@RequestParam("companyId")Integer companyId){
        if (companyService.getCompanyByCompanyId(companyId) == null){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        CompanyStage companyStage = service.getCompanyStageBycompanyId(companyId);
        if (companyStage == null){
            companyStage = new CompanyStage();
            companyStage.setCompanyId(companyId);
            service.insertCompanyStage(companyStage);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",companyStage);
    }

    /*
     *新增对象，注意先判断对应company是否存在，再判断对应companystage是否存在
     * @Param CompanyStage companyStage
     * @Param Integer companyId
     * */
    @RequestMapping("/insert")
    @ResponseBody
    public ResponseObject insert(@RequestBody CompanyStage companyStage, @RequestParam("companyId")Integer companyId){
        if (companyService.getCompanyByCompanyId(companyId) == null){
            return new ResponseObject(ResponseObject.ERROR,"新增失败！",null);
        }
        else if (service.getCompanyStageBycompanyId(companyId) != null){
            service.updateCompanyStage(companyStage);
            return new ResponseObject(ResponseObject.OK,"新增成功！",companyStage);
        }
        companyStage.setCompanyId(companyId);
        service.insertCompanyStage(companyStage);
        return new ResponseObject(ResponseObject.OK,"新增成功！",companyStage);
    }

    /*
     *更新对象
     * @Param CompanyStage companyStage
     * */
    @RequestMapping("/update")
    @ResponseBody
    public ResponseObject update(@RequestBody CompanyStage companyStage){
        service.updateCompanyStage(companyStage);
        return new ResponseObject(ResponseObject.OK,"更新成功！",companyStage);
    }
}
