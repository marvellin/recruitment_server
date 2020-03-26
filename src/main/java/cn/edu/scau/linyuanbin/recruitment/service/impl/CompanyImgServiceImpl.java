package cn.edu.scau.linyuanbin.recruitment.service.impl;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyImg;
import cn.edu.scau.linyuanbin.recruitment.mapper.CompanyImgMapper;
import cn.edu.scau.linyuanbin.recruitment.service.service.CompanyImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:23 2020/3/25
 */
@Service("companyImgService")
public class CompanyImgServiceImpl implements CompanyImgService {
    @Autowired
    CompanyImgMapper mapper;

    @Override
    public CompanyImg getCompanyImgByCompanyImgId(Integer companyImgId) {
        return getCompanyImgByCompanyImgId(companyImgId);
    }

    @Override
    public CompanyImg getCompanyImgByCompanyDetailId(Integer companyDetailId) {
        return mapper.getCompanyImgByCompanyDetailId(companyDetailId);
    }

    @Override
    public int insertCompanyImg(CompanyImg companyImg) {
        return mapper.insertCompanyImg(companyImg);
    }

    @Override
    public void updateCompanyImg(CompanyImg companyImg) {
        mapper.updateCompanyImg(companyImg);
    }
}
