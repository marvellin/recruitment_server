package cn.edu.scau.linyuanbin.recruitment.service.impl;

import cn.edu.scau.linyuanbin.recruitment.domain.ProductImg;
import cn.edu.scau.linyuanbin.recruitment.mapper.ProductImgMapper;
import cn.edu.scau.linyuanbin.recruitment.service.service.ProductImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:23 2020/3/25
 */
@Service("productImgService")
public class ProductImgServiceImpl implements ProductImgService {
    @Autowired
    ProductImgMapper mapper;


    @Override
    public ProductImg getProductImgByproductImgId(Integer productImgId) {
        return mapper.getProductImgByproductImgId(productImgId);
    }

    @Override
    public ProductImg getProductImgBycompanyProductId(Integer companyProductId) {
        return mapper.getProductImgBycompanyProductId(companyProductId);
    }

    @Override
    public int insertProductImg(ProductImg productImg) {
        return mapper.insertProductImg(productImg);
    }

    @Override
    public void updateProductImg(ProductImg productImg) {
        mapper.updateProductImg(productImg);
    }
}
