package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyStage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: linyuanbin
 * @Description:
 *  公司融资情况对象mapper
 *  1.根据companyStageId获取对象
 *  2.根据companyId获取对象
 *  3.新增对象
 *  4.更新对象
 * @Date: Created in 23:30 2020/3/22
 */
@Mapper
public interface CompanyStageMapper {
    /*
    *根据companyStageId获取对象
    * */
    public CompanyStage getCompanyStageBycompanyStageId(@Param("companyStageId")Integer companyStageId);

    /*
     *根据companyId获取对象
     * */
    public CompanyStage getCompanyStageBycompanyId(@Param("companyId")Integer companyId);

    /*
     *新增对象
     * */
    public int insertCompanyStage(@Param("companyStage")CompanyStage companyStage);

    /*
     *更新对象
     * */
    public void updateCompanyStage(@Param("companyStage")CompanyStage companyStage);
}
