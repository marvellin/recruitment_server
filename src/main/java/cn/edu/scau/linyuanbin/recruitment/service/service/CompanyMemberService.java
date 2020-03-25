package cn.edu.scau.linyuanbin.recruitment.service.service;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyMember;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:19 2020/3/25
 */
public interface CompanyMemberService {
    /*
     *根据companyMemberId获得单个对象
     * */
    public CompanyMember getCompanyMemberBycompanyMemberId(Integer companyMemberId);

    /*
     *根据companyId获得单个对象
     * */
    public CompanyMember getCompanyMemberBycompanyId(Integer companyId);

    /*
     *新增对象
     * */
    public int insertCompanyMember(CompanyMember companyMember);

    /*
     *更新对象
     * */
    public void updateCompanyMember(CompanyMember companyMember);

    /*
     *根据companyMemberId删除对象
     * */
    public void deleteBycompanyMemberId(Integer companyMemberId);
}
