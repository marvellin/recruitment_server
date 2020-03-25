package cn.edu.scau.linyuanbin.recruitment.service.service;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyProduct;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:21 2020/3/25
 */
public interface CompanyProductService {
    /*
     * 根据companyProductId获得单个对象
     * */
    public CompanyProduct getCompanyProductBycompanyProductId(Integer companyProductId);

    /*
     *根据companyId获得对个对象
     * */
    public List<CompanyProduct> getCompanyProductListBycompanyId(Integer companyId);

    /*
     *新增对象
     * */
    public int insertCompanyProduct(CompanyProduct companyProduct);

    /*
     *更新对象
     * */
    public void updateCompanyProduct(CompanyProduct companyProduct);

    /*
     *根据companyProductId删除对象
     * */
    public void deleteBycompanyProductId(Integer companyProductId);
}
