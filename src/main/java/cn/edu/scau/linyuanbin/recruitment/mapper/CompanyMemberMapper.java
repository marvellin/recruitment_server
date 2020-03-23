package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyMember;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: linyuanbin
 * @Description:
 *  公司负责人对象mapper
 *  1.根据companyMemberId获得单个对象
 *  2.根据companyId获得单个对象
 *  3.新增对象
 *  4.更新对象
 *  5.根据companyMemberId删除对象
 * @Date: Created in 23:30 2020/3/22
 */
@Mapper
public interface CompanyMemberMapper {
    /*
    *根据companyMemberId获得单个对象
    * */
    public CompanyMember getCompanyMemberBycompanyMemberId(@Param("companyMemberId")Integer companyMemberId);

    /*
     *根据companyId获得单个对象
     * */
    public CompanyMember getCompanyMemberBycompanyId(@Param("companyId")Integer companyId);

    /*
     *新增对象
     * */
    public int insertCompanyMember(@Param("companyMember")CompanyMember companyMember);

    /*
     *更新对象
     * */
    public void updateCompanyMember(@Param("companyMember")CompanyMember companyMember);

    /*
     *根据companyMemberId删除对象
     * */
    public void deleteBycompanyMemberId(@Param("companyMemberId")Integer companyMemberId);
}
