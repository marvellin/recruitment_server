package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.ProductImg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: linyuanbin
 * @Description:
 * 公司产品图片对象mapper
 * 1.根据productImgId查找对象
 * 2.根据companyProductId查找对象
 * 3.新增对象
 * 4.更新对象
 * @Date: Created in 23:35 2020/3/22
 */
@Mapper
public interface ProductImgMapper {
    /*
    *根据productImgId查找对象
    * */
    public ProductImg getProductImgByproductImgId(@Param("productImgId")Integer productImgId);

    /*
     *根据companyProductId查找对象
     * */
    public ProductImg getProductImgBycompanyProductId(@Param("companyProductId")Integer companyProductId);

    /*
     *新增对象
     * */
    public int insertProductImg(@Param("productImg")ProductImg productImg);

    /*
     *更新对象
     * */
    public void updateProductImg(@Param("productImg")ProductImg productImg);
}
