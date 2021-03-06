package cn.edu.scau.linyuanbin.recruitment.service.service;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyDetail;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:20 2020/3/25
 */
public interface CompanyDetailService {
    /*
     *根据关键字模糊查询公司名匹配的公司idList
     * */
    public List<Integer> getCompanyIdByFuzzyQuery(String companyName);

    /*
     * 根据companyDetailId获取单个对象
     * */
    public CompanyDetail getCompantDetailByCompanyDetailId(Integer companyDetailId);

    /*
     * 根据companyId获取单个对象
     * */
    public CompanyDetail getCompantDetailBycompanyId(Integer companyId);

    /*
     * 保存一个对象
     * */
    public int insertCompanyDetail(CompanyDetail companyDetail);

    /*
     * 更新一个对象
     * */
    public void updateCompanyDetail(CompanyDetail companyDetail);
}
