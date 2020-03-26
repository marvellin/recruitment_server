package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyDetail;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:09 2020/3/25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class CompanyDetailMapperTest {
    @Autowired
    CompanyDetailMapper mapper;

    static CompanyDetail tmp = null;

    @Test
    void getCompantDetailByCompanyDetailId() {
        tmp = mapper.getCompantDetailByCompanyDetailId(10);
        System.out.println(tmp);
    }

    @Test
    void getCompantDetailBycompanyId() {
        System.out.println(mapper.getCompantDetailBycompanyId(9));
    }

    @Test
    void insertCompanyDetail() {
        CompanyDetail tmp = new CompanyDetail(0,11,"test520","test520","test520","test520","test520","test520","test520",null,null);
        mapper.insertCompanyDetail(tmp);
    }

    @Test
    void updateCompanyDetail() {
        CompanyDetail tmp = null;
        /*tmp = mapper.getCompantDetailByCompanyDetailId(10);
        tmp.setFullName("更新全名测试");
        tmp.setShortname("简称更新测试");*/
        mapper.updateCompanyDetail(tmp);
    }

    @Test
    void getCompanyIdByFuzzyQuery() {
        System.out.println(mapper.getCompanyIdByFuzzyQuery("6厂"));
    }
}