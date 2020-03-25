package cn.edu.scau.linyuanbin.recruitment.service.service;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyImg;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:20 2020/3/25
 */
public interface CompanyImgService {
    /*
     * 根据companyImgId查找对象
     * */
    public CompanyImg getCompanyImgByCompanyImgId(Integer companyImgId);

    /*
     *根据companyDetailId查找对象
     * */
    public CompanyImg getCompanyImgByCompanyDetailId(Integer companyDetailId);

    /*
     *保存一个对象
     * */
    public int insertCompanyImg(CompanyImg companyImg);

    /*
     *更新一个对象
     * */
    public void updateCompanyImg(CompanyImg companyImg);
}
