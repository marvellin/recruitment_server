package cn.edu.scau.linyuanbin.recruitment.service.impl;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyStage;
import cn.edu.scau.linyuanbin.recruitment.mapper.CompanyStageMapper;
import cn.edu.scau.linyuanbin.recruitment.service.service.CompanyStageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:23 2020/3/25
 */
@Service("companyStageService")
public class CompanyStageServiceImpl implements CompanyStageService {
    @Autowired
    CompanyStageMapper mapper;

    @Override
    public CompanyStage getCompanyStageBycompanyStageId(Integer companyStageId) {
        return mapper.getCompanyStageBycompanyStageId(companyStageId);
    }

    @Override
    public CompanyStage getCompanyStageBycompanyId(Integer companyId) {
        return mapper.getCompanyStageBycompanyId(companyId);
    }

    @Override
    public int insertCompanyStage(CompanyStage companyStage) {
        return mapper.insertCompanyStage(companyStage);
    }

    @Override
    public void updateCompanyStage(CompanyStage companyStage) {
        mapper.updateCompanyStage(companyStage);
    }
}
