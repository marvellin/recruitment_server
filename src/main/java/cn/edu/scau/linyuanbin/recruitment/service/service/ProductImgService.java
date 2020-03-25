package cn.edu.scau.linyuanbin.recruitment.service.service;

import cn.edu.scau.linyuanbin.recruitment.domain.ProductImg;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:21 2020/3/25
 */
public interface ProductImgService {
    /*
     *根据productImgId查找对象
     * */
    public ProductImg getProductImgByproductImgId(Integer productImgId);

    /*
     *根据companyProductId查找对象
     * */
    public ProductImg getProductImgBycompanyProductId(Integer companyProductId);

    /*
     *新增对象
     * */
    public int insertProductImg(ProductImg productImg);

    /*
     *更新对象
     * */
    public void updateProductImg(ProductImg productImg);
}
