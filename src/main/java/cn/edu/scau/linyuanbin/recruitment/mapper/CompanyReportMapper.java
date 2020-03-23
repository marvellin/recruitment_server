package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyReport;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 *  公司新闻报道对象mapper
 *  1.根据companyReportId获取单个对象
 *  2.根据companyId获取多个对象
 *  3.新增对象
 *  4.根据companyReportId删除对象
 *  5.更新对象
 * @Date: Created in 23:29 2020/3/22
 */
@Mapper
public interface CompanyReportMapper {
    /*
    *根据companyReportId获取单个对象
    * */
    public CompanyReport getCompanyReportBycompanyReportId(@Param("companyReportId")Integer companyReportId);

    /*
     *根据companyId获取多个对象
     * */
    public List<CompanyReport> getCompanyReportListBycompanyId(@Param("companyId")Integer companyId);

    /*
     *新增对象
     * */
    public int insertCompanyReport(@Param("companyReport")CompanyReport companyReport);

    /*
     *根据companyReportId删除对象
     * */
    public void deleteBycompanyReportId(@Param("companyReportId")Integer companyReportId);

    /*
     *更新对象
     * */
    public void updateCompanyReport(@Param("companyReport")CompanyReport companyReport);
}
