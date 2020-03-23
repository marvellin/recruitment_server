package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyProduct;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 *  公司产品对象mapper
 *  1.根据companyProductId获得单个对象
 *  2.根据companyId获得对个对象
 *  3.新增对象
 *  4.更新对象
 *  5.根据companyProductId删除对象
 * @Date: Created in 23:35 2020/3/22
 */
@Mapper
public interface CompanyProductMapper {
    /*
    * 根据companyProductId获得单个对象
    * */
    public CompanyProduct getCompanyProductBycompanyProductId(@Param("companyProductId")Integer companyProductId);

    /*
     *根据companyId获得对个对象
     * */
    public List<CompanyProduct> getCompanyProductListBycompanyId(@Param("companyId")Integer companyId);

    /*
     *新增对象
     * */
    public int insertCompanyProduct(@Param("companyProduct")CompanyProduct companyProduct);

    /*
     *更新对象
     * */
    public void updateCompanyProduct(@Param("companyProduct")CompanyProduct companyProduct);

    /*
     *根据companyProductId删除对象
     * */
    public void deleteBycompanyProductId(@Param("companyProductId")Integer companyProductId);
}
