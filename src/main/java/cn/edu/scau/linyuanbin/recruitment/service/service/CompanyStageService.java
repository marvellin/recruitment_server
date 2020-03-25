package cn.edu.scau.linyuanbin.recruitment.service.service;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyStage;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:19 2020/3/25
 */
public interface CompanyStageService {
    /*
     *根据companyStageId获取对象
     * */
    public CompanyStage getCompanyStageBycompanyStageId(Integer companyStageId);

    /*
     *根据companyId获取对象
     * */
    public CompanyStage getCompanyStageBycompanyId(Integer companyId);

    /*
     *新增对象
     * */
    public int insertCompanyStage(CompanyStage companyStage);

    /*
     *更新对象
     * */
    public void updateCompanyStage(CompanyStage companyStage);
}
