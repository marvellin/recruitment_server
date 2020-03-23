package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: linyuanbin
 * @Description:
 *  公司基本信息的mapper
 *  1.根据companyDetailId获取单个对象
 *  2.根据companyId获取单个对象
 *  3.保存一个对象
 *  4.更新一个对象
 * @Date: Created in 23:34 2020/3/22
 */
@Mapper
public interface CompanyDetailMapper {

    /*
    * 根据companyDetailId获取单个对象
    * */
    public CompanyDetail getCompantDetailByCompanyDetailId(@Param("companyDetailId")Integer companyDetailId);

    /*
    * 根据companyId获取单个对象
    * */
    public CompanyDetail getCompantDetailByPersonId(@Param("psersonId")Integer personId);

    /*
    * 保存一个对象
    * */
    public int insertCompanyDetail(@Param("companyDetail")CompanyDetail companyDetail);

    /*
    * 根据companyDetailId更新一个对象
    * */
    public void updateCompanyDetail(@Param("companyDetail")CompanyDetail companyDetail);
}
