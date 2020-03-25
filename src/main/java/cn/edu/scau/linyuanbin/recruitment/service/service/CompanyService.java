package cn.edu.scau.linyuanbin.recruitment.service.service;

import cn.edu.scau.linyuanbin.recruitment.domain.Company;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:16 2020/3/25
 */
public interface CompanyService {
    /*
     *根据companyId获得单个对象
     * */
    public Company getCompanyByCompanyId(Integer companyId);

    /*
     *根据userId获得单个对象
     * */
    public Company getCompanyByUserId(Integer userId);

    /*
     *更新对象
     * */
    public void updateCompany(Company company);

    /*
     *新增对象
     * */
    public int insertCompany(Company company);
}
