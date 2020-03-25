package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyReport;
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
class CompanyReportMapperTest {
    @Autowired
    CompanyReportMapper mapper;

    @Test
    void getCompanyReportBycompanyReportId() {
        System.out.println(mapper.getCompanyReportBycompanyReportId(1));
    }

    @Test
    void getCompanyReportListBycompanyId() {
        System.out.println(mapper.getCompanyReportListBycompanyId(2));
    }

    @Test
    void insertCompanyReport() {
        CompanyReport tmp = new CompanyReport(0,11,"test520","test520");
        mapper.insertCompanyReport(tmp);
    }

    @Test
    void deleteBycompanyReportId() {
        mapper.deleteBycompanyReportId(4);
    }

    @Test
    void updateCompanyReport() {
        CompanyReport tmp = mapper.getCompanyReportBycompanyReportId(3);
        tmp.setRepotitle("test");
        mapper.updateCompanyReport(tmp);
    }
}