package cn.edu.scau.linyuanbin.recruitment.service.impl;

import cn.edu.scau.linyuanbin.recruitment.domain.Company;
import cn.edu.scau.linyuanbin.recruitment.mapper.CompanyMapper;
import cn.edu.scau.linyuanbin.recruitment.service.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:23 2020/3/25
 */
@Service("companyService")
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    CompanyMapper mapper;

    @Override
    public List<Company> getCompanyListBycompanyIdList(List<Integer> companyIdList) {
        return mapper.getCompanyListBycompanyIdList(companyIdList);
    }

    @Override
    public Company getCompanyByCompanyId(Integer companyId) {
        return mapper.getCompanyByCompanyId(companyId);
    }

    @Override
    public Company getCompanyByUserId(Integer userId) {
        return mapper.getCompanyByUserId(userId);
    }

    @Override
    public void updateCompany(Company company) {
        mapper.updateCompany(company);
    }

    @Override
    public int insertCompany(Company company) {
        return mapper.insertCompany(company);
    }
}
