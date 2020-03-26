package cn.edu.scau.linyuanbin.recruitment.service.impl;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyReport;
import cn.edu.scau.linyuanbin.recruitment.mapper.CompanyReportMapper;
import cn.edu.scau.linyuanbin.recruitment.service.service.CompanyReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:23 2020/3/25
 */
@Service("companyReportService")
public class CompanyReportServiceImpl implements CompanyReportService {
    @Autowired
    CompanyReportMapper mapper;


    @Override
    public CompanyReport getCompanyReportBycompanyReportId(Integer companyReportId) {
        return mapper.getCompanyReportBycompanyReportId(companyReportId);
    }

    @Override
    public List<CompanyReport> getCompanyReportListBycompanyId(Integer companyId) {
        return mapper.getCompanyReportListBycompanyId(companyId);
    }

    @Override
    public int insertCompanyReport(CompanyReport companyReport) {
        return mapper.insertCompanyReport(companyReport);
    }

    @Override
    public void deleteBycompanyReportId(Integer companyReportId) {
        mapper.deleteBycompanyReportId(companyReportId);
    }

    @Override
    public void updateCompanyReport(CompanyReport companyReport) {
        mapper.updateCompanyReport(companyReport);
    }
}
