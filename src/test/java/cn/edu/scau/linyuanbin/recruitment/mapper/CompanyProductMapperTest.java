package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyProduct;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:10 2020/3/25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class CompanyProductMapperTest {
    @Autowired
    CompanyProductMapper mapper;

    @Test
    void getCompanyProductBycompanyProductId() {
        System.out.println(mapper.getCompanyProductBycompanyProductId(1));
    }

    @Test
    void getCompanyProductListBycompanyId() {
        System.out.println(mapper.getCompanyProductListBycompanyId(2));
    }

    @Test
    void insertCompanyProduct() {
        CompanyProduct tmp = new CompanyProduct(0,11,"test520","test520",null);
        mapper.insertCompanyProduct(tmp);
    }

    @Test
    void updateCompanyProduct() {
        CompanyProduct tmp = mapper.getCompanyProductBycompanyProductId(3);
        tmp.setName("更新测试");
        mapper.updateCompanyProduct(tmp);
    }

    @Test
    void deleteBycompanyProductId() {
        mapper.deleteBycompanyProductId(4);
    }
}