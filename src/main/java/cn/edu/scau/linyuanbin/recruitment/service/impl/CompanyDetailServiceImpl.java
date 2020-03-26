package cn.edu.scau.linyuanbin.recruitment.service.impl;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyDetail;
import cn.edu.scau.linyuanbin.recruitment.mapper.CompanyDetailMapper;
import cn.edu.scau.linyuanbin.recruitment.service.service.CompanyDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:23 2020/3/25
 */
@Service("companyDetailService")
public class CompanyDetailServiceImpl implements CompanyDetailService {
    @Autowired
    CompanyDetailMapper mapper;


    @Override
    public List<Integer> getCompanyIdByFuzzyQuery(String companyName) {
        return mapper.getCompanyIdByFuzzyQuery(companyName);
    }

    @Override
    public CompanyDetail getCompantDetailByCompanyDetailId(Integer companyDetailId) {
        return mapper.getCompantDetailByCompanyDetailId(companyDetailId);
    }

    @Override
    public CompanyDetail getCompantDetailBycompanyId(Integer companyId) {
        return mapper.getCompantDetailBycompanyId(companyId);
    }

    @Override
    public int insertCompanyDetail(CompanyDetail companyDetail) {
        return mapper.insertCompanyDetail(companyDetail);
    }

    @Override
    public void updateCompanyDetail(CompanyDetail companyDetail) {
        mapper.updateCompanyDetail(companyDetail);
    }
}
