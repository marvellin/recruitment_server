package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyImg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: linyuanbin
 * @Description:
 *  公司logo对象mapper
 *   1.根据companyImgId查找对象
 *   2.根据companyDetailId查找对象
 *   3.保存一个对象
 *   4.更新一个对象
 * @Date: Created in 23:34 2020/3/22
 */
@Mapper
public interface CompanyImgMapper {
    /*
    * 根据companyImgId查找对象
    * */
    public CompanyImg getCompanyImgByCompanyImgId(@Param("companyImgId")Integer companyImgId);

    /*
     *根据companyDetailId查找对象
     * */
    public CompanyImg getCompanyImgByCompanyDetailId(@Param("companyDetailId") Integer companyDetailId);

    /*
     *保存一个对象
     * */
    public int insertCompanyImg(@Param("companyImg")CompanyImg companyImg);

    /*
     *更新一个对象
     * */
    public void updateCompanyImg(@Param("companyImg")CompanyImg companyImg);
}
