package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.Company;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: linyuanbin
 * @Description:
 *  公司对象mapper
 *  1.根据companyId获得单个对象
 *  2.根据userId获得单个对象
 *  3.更新对象
 *  4.新增对象
 * @Date: Created in 23:26 2020/3/22
 */
@Mapper
public interface CompanyMapper {
    /*
    *根据companyId获得单个对象
    * */
    public Company getCompanyByCompanyId(@Param("companyId")Integer companyId);

    /*
     *根据userId获得单个对象
     * */
    public Company getCompanyByUserId(@Param("userId")Integer userId);

    /*
     *更新对象
     * */
    public void updateCompany(@Param("company")Company company);

    /*
     *新增对象
     * */
    public int insertCompany(@Param("company")Company company);
}
