package cn.edu.scau.linyuanbin.recruitment.service.impl;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyMember;
import cn.edu.scau.linyuanbin.recruitment.mapper.CompanyMemberMapper;
import cn.edu.scau.linyuanbin.recruitment.service.service.CompanyMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:23 2020/3/25
 */
@Service("companyMemberService")
public class CompanyMemberServiceImpl implements CompanyMemberService {
    @Autowired
    CompanyMemberMapper mapper;

    @Override
    public CompanyMember getCompanyMemberBycompanyMemberId(Integer companyMemberId) {
        return mapper.getCompanyMemberBycompanyMemberId(companyMemberId);
    }

    @Override
    public CompanyMember getCompanyMemberBycompanyId(Integer companyId) {
        return mapper.getCompanyMemberBycompanyId(companyId);
    }

    @Override
    public int insertCompanyMember(CompanyMember companyMember) {
        return mapper.insertCompanyMember(companyMember);
    }

    @Override
    public void updateCompanyMember(CompanyMember companyMember) {
        mapper.updateCompanyMember(companyMember);
    }

    @Override
    public void deleteBycompanyMemberId(Integer companyMemberId) {
        mapper.deleteBycompanyMemberId(companyMemberId);
    }
}
