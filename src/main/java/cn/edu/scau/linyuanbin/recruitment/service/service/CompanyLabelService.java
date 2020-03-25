package cn.edu.scau.linyuanbin.recruitment.service.service;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyLabel;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:20 2020/3/25
 */
public interface CompanyLabelService {
    /*
     *根据companyDetailId获取多个对象
     * */
    public List<CompanyLabel> getLabelListByCompanyDetailId(Integer companyDetailId);

    /*
     *根据companyLabelId获取单个对象
     * */
    public CompanyLabel getLabelByCompanyLabelId(Integer companyLabelId);

    /*
     *根据companyLabelId删除一个对象
     * */
    public void deleteByCompanyLabelId(Integer companyLabelId);

    /*
     *保存一个对象
     * */
    public int insertCompanyLabel(CompanyLabel companyLabel);

    /*
     *保存对个对象
     * */
    public void insertCompanyLabelList(List<CompanyLabel> companyLabelList);
}
