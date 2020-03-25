package cn.edu.scau.linyuanbin.recruitment.service.service;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyReport;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:19 2020/3/25
 */
public interface CompanyReportService {
    /*
     *根据companyReportId获取单个对象
     * */
    public CompanyReport getCompanyReportBycompanyReportId(Integer companyReportId);

    /*
     *根据companyId获取多个对象
     * */
    public List<CompanyReport> getCompanyReportListBycompanyId(Integer companyId);

    /*
     *新增对象
     * */
    public int insertCompanyReport(CompanyReport companyReport);

    /*
     *根据companyReportId删除对象
     * */
    public void deleteBycompanyReportId(Integer companyReportId);

    /*
     *更新对象
     * */
    public void updateCompanyReport(CompanyReport companyReport);
}
