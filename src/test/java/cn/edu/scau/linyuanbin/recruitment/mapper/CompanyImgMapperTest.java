package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyImg;
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
class CompanyImgMapperTest {
    @Autowired
    CompanyImgMapper mapper;

    @Test
    void getCompanyImgByCompanyImgId() {
        System.out.println(mapper.getCompanyImgByCompanyImgId(1));
    }

    @Test
    void getCompanyImgByCompanyDetailId() {
        System.out.println(mapper.getCompanyImgByCompanyDetailId(2));
    }

    @Test
    void insertCompanyImg() {
        CompanyImg tmp = new CompanyImg(0,11,12,null);
        mapper.insertCompanyImg(tmp);
    }

    @Test
    void updateCompanyImg() {
        CompanyImg tmp = mapper.getCompanyImgByCompanyDetailId(3);
        tmp.setOssId(11);
        mapper.updateCompanyImg(tmp);
    }
}