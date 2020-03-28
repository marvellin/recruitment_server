package cn.edu.scau.linyuanbin.recruitment.service.impl;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyLabel;
import cn.edu.scau.linyuanbin.recruitment.mapper.CompanyLabelMapper;
import cn.edu.scau.linyuanbin.recruitment.service.service.CompanyLabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:23 2020/3/25
 */
@Service("companyLabelService")
public class CompanyLabelServiceImpl implements CompanyLabelService {
    @Autowired
    CompanyLabelMapper mapper;

    @Override
    public List<CompanyLabel> getLabelListByCompanyDetailId(Integer companyDetailId) {
        return mapper.getLabelListByCompanyDetailId(companyDetailId);
    }

    @Override
    public CompanyLabel getLabelByCompanyLabelId(Integer companyLabelId) {
        return mapper.getLabelByCompanyLabelId(companyLabelId);
    }

    @Override
    public void deleteByCompanyLabelId(Integer companyLabelId) {
        mapper.deleteByCompanyLabelId(companyLabelId);
    }

    @Override
    public int insertCompanyLabel(CompanyLabel companyLabel) {
        return mapper.insertCompanyLabel(companyLabel);
    }

    @Override
    public void insertCompanyLabelList(List<CompanyLabel> companyLabelList) {
        mapper.insertCompanyLabelList(companyLabelList);
    }
}
