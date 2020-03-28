package cn.edu.scau.linyuanbin.recruitment.controller.imgController;

import cn.edu.scau.linyuanbin.recruitment.domain.OSSFile;
import cn.edu.scau.linyuanbin.recruitment.domain.ProductImg;
import cn.edu.scau.linyuanbin.recruitment.domain.ResponseObject;
import cn.edu.scau.linyuanbin.recruitment.service.service.CompanyProductService;
import cn.edu.scau.linyuanbin.recruitment.service.service.OSSFileService;
import cn.edu.scau.linyuanbin.recruitment.service.service.ProductImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: linyuanbin
 * @Description:
 * test done
 * @Date: Created in 19:29 2020/3/25
 */
@RestController
@RequestMapping("/productImg")
public class ProductImgController {
    @Autowired
    ProductImgService service;

    @Autowired
    OSSFileService ossFileService;

    @Autowired
    CompanyProductService companyProductService;

    /*
    * 上传产品图片，先判断是否有对应companyProduct，再判断是否有productImg对象，如果有则更新，没有则插入
    * @Param MultipartFile file文件目标
    * @Param Integer companyProductId对应产品
    * @Param Integer userId对应用户（用于文件保存路径的生成）
    * */
    @RequestMapping("/upload")
    @ResponseBody
    public ResponseObject upload(@RequestParam("file")MultipartFile file, @RequestParam("companyProductId")Integer companyProductId,@RequestParam("userId")Integer userId, HttpServletResponse response) throws IOException {
        if (companyProductService.getCompanyProductBycompanyProductId(companyProductId) == null){
            return new ResponseObject(ResponseObject.ERROR,"上传失败！",null);
        }
        OSSFile ossFile =  ossFileService.upload(file,userId,"产品图片",response.getOutputStream());

        ProductImg productImg = service.getProductImgBycompanyProductId(companyProductId);
        if(productImg != null){
            productImg.setOssId(ossFile.getOssId());
            service.updateProductImg(productImg);
        }
        else {
            productImg = new ProductImg();
            productImg.setCompanyProductId(companyProductId);
            productImg.setOssId(ossFile.getOssId());
            service.insertProductImg(productImg);
        }
        return new ResponseObject(ResponseObject.OK,"上传成功！",productImg);
    }
}
