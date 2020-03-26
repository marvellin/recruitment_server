package cn.edu.scau.linyuanbin.recruitment.service.impl;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyProduct;
import cn.edu.scau.linyuanbin.recruitment.mapper.CompanyProductMapper;
import cn.edu.scau.linyuanbin.recruitment.service.service.CompanyProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:23 2020/3/25
 */
@Service("companyProductService")
public class CompanyProductServiceImpl implements CompanyProductService {
    @Autowired
    CompanyProductMapper mapper;

    @Override
    public CompanyProduct getCompanyProductBycompanyProductId(Integer companyProductId) {
        return mapper.getCompanyProductBycompanyProductId(companyProductId);
    }

    @Override
    public List<CompanyProduct> getCompanyProductListBycompanyId(Integer companyId) {
        return mapper.getCompanyProductListBycompanyId(companyId);
    }

    @Override
    public int insertCompanyProduct(CompanyProduct companyProduct) {
        return mapper.insertCompanyProduct(companyProduct);
    }

    @Override
    public void updateCompanyProduct(CompanyProduct companyProduct) {
        mapper.updateCompanyProduct(companyProduct);
    }

    @Override
    public void deleteBycompanyProductId(Integer companyProductId) {
        mapper.deleteBycompanyProductId(companyProductId);
    }
}
