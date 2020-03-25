package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyLabel;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:09 2020/3/25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class CompanyLabelMapperTest {
    @Autowired
    CompanyLabelMapper mapper;

    @Test
    void getLabelListByCompanyDetailId() {
        System.out.println(mapper.getLabelListByCompanyDetailId(1));
    }

    @Test
    void getLabelByCompanyLabelId() {
        System.out.println(mapper.getLabelByCompanyLabelId(2));
    }

    @Test
    void deleteByCompanyLabelId() {
        mapper.deleteByCompanyLabelId(15);
    }

    @Test
    void insertCompanyLabel() {
        CompanyLabel tmp = new CompanyLabel(1,0,"test520");
        mapper.insertCompanyLabel(tmp);
    }

    @Test
    void insertCompanyLabelList() {
        CompanyLabel tmp1 = new CompanyLabel(1,0,"test5201");
        CompanyLabel tmp2 = new CompanyLabel(1,0,"test5202");
        List<CompanyLabel> list = new ArrayList<>();
        list.add(tmp1);
        list.add(tmp2);
        mapper.insertCompanyLabelList(list);
    }
}