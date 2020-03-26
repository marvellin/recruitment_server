package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.Company;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:09 2020/3/25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class CompanyMapperTest {
    @Autowired
    CompanyMapper mapper;

    @Autowired
    CompanyDetailMapper mapper2;

    @Test
    void getCompanyByCompanyId() {
        System.out.println(mapper.getCompanyByCompanyId(1));
    }

    @Test
    void getCompanyByUserId() {
        System.out.println(mapper.getCompanyByUserId(12));
    }

    @Test
    void updateCompany() {
        Company tmp = mapper.getCompanyByCompanyId(3);
        tmp.setIntro("更新测试");
//        System.out.println(tmp);
        mapper.updateCompany(tmp);
    }

    @Test
    void insertCompany() {
        Company tmp = new Company();
        tmp.setUserId(24);
        tmp.setIntro("test520");
        mapper.insertCompany(tmp);
    }

    @Test
    void getCompanyListBycompanyIdList() {
        List<Company> list = mapper.getCompanyListBycompanyIdList(mapper2.getCompanyIdByFuzzyQuery("厂"));
        for (Company tmp:list){
            System.out.println(tmp.toString());
        }
    }
}