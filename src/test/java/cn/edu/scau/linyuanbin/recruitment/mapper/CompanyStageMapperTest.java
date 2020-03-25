package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyStage;
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
class CompanyStageMapperTest {
    @Autowired
    CompanyStageMapper mapper;

    @Test
    void getCompanyStageBycompanyStageId() {
        System.out.println(mapper.getCompanyStageBycompanyStageId(1));
    }

    @Test
    void getCompanyStageBycompanyId() {
        System.out.println(mapper.getCompanyStageBycompanyId(2));
    }

    @Test
    void insertCompanyStage() {
        CompanyStage tmp = new CompanyStage(0,11,"test520","test520");
        mapper.insertCompanyStage(tmp);
    }

    @Test
    void updateCompanyStage() {
        CompanyStage tmp = mapper.getCompanyStageBycompanyStageId(3);
        tmp.setOrg("test");
        mapper.updateCompanyStage(tmp);
    }
}