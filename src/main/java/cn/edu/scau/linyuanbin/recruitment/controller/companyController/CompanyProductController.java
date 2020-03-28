package cn.edu.scau.linyuanbin.recruitment.controller.companyController;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyProduct;
import cn.edu.scau.linyuanbin.recruitment.domain.ResponseObject;
import cn.edu.scau.linyuanbin.recruitment.service.service.CompanyProductService;
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
@RequestMapping("/companyProduct")
public class CompanyProductController {
    @Autowired
    CompanyProductService service;

    @Autowired
    CompanyService companyService;

    /*
     * 根据companyProductId获得单个对象
     * @Param Integer companyProductId
     * */
    @RequestMapping("/get")
    @ResponseBody
    public ResponseObject get(@RequestParam("companyProductId")Integer companyProductId){
        CompanyProduct companyProduct = service.getCompanyProductBycompanyProductId(companyProductId);
        if (companyProduct == null){
            return new ResponseObject(ResponseObject.ERROR,"获取失败!",null);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",companyProduct);
    }

    /*
     *根据companyId获得对个对象list
     * @Param Integer companyId
     * */
    @RequestMapping("/getByCompanyId")
    @ResponseBody
    public ResponseObject getByCompanyId(@RequestParam("companyId") Integer companyId){
        if (companyService.getCompanyByCompanyId(companyId) == null){
            return new ResponseObject(ResponseObject.ERROR,"获取失败!",null);
        }
        List<CompanyProduct> productList = service.getCompanyProductListBycompanyId(companyId);
        if (productList == null || productList.size() == 0){
            return new ResponseObject(ResponseObject.ERROR,"获取失败!",null);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",productList);
    }

    /*
     *新增对象
     * @Param CompanyProduct companyProduct
     * @Param Integer companyId
     * */
    @RequestMapping("/insert")
    @ResponseBody
    public ResponseObject insert(@RequestBody CompanyProduct companyProduct, @RequestParam("companyId")Integer companyId){
        if (companyService.getCompanyByCompanyId(companyId)==null){
            return new ResponseObject(ResponseObject.ERROR,"新增失败!",null);
        }
        companyProduct.setCompanyId(companyId);
        service.insertCompanyProduct(companyProduct);
        return new ResponseObject(ResponseObject.OK,"新增成功！",companyProduct);
    }

    /*
     *更新对象
     * @Param CompanyProduct companyProduct
     * */
    @RequestMapping("/update")
    @ResponseBody
    public ResponseObject update(@RequestBody CompanyProduct companyProduct){
        service.updateCompanyProduct(companyProduct);
        return new ResponseObject(ResponseObject.OK,"更新成功！",companyProduct);
    }

    /*
     *根据companyProductId删除对象
     * @Param Integer companyProductId
     * */
    @RequestMapping("/delete")
    @ResponseBody
    public ResponseObject delete(@RequestParam("companyProductId") Integer companyProductId){
        service.deleteBycompanyProductId(companyProductId);
        return new ResponseObject(ResponseObject.OK,"删除成功！",null);
    }
}
