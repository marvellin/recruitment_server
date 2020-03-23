package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyLabel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 *  公司标签mapper
 *  1.根据companyDetailId获取多个对象
 *  2.根据companyLabelId获取单个对象
 *  3.根据companyLabelId删除一个对象
 *  4.保存一个对象
 *  5.保存对个对象
 * @Date: Created in 23:34 2020/3/22
 */
@Mapper
public interface CompanyLabelMapper {
    /*
    *根据companyDetailId获取多个对象
    * */
    public List<CompanyLabel> getLabelListByCompanyDetailId(@Param("companyDetailId")Integer companyDetailId);

    /*
     *根据companyLabelId获取单个对象
     * */
    public CompanyLabel getLabelByCompanyDetailId(@Param("companyLabelId")Integer companyLabelId);

    /*
     *根据companyLabelId删除一个对象
     * */
    public void deleteByCompanyLabelId(@Param("companyLabelId")Integer companyLabelId);

    /*
     *保存一个对象
     * */
    public int insertCompanyLabel(@Param("companyLabel")CompanyLabel companyLabel);

    /*
     *保存对个对象
     * */
    public void insertCompanyLabelList(List<CompanyLabel> companyLabelList);
}
