package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.PersonImg;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:12 2020/3/25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class PersonImgMapperTest {
    @Autowired
    PersonImgMapper mapper;

    @Test
    void getPersonImgBypersonImgId() {
        System.out.println(mapper.getPersonImgBypersonImgId(1));
    }

    @Test
    void getPersonImgBypersonDetailId() {
        System.out.println(mapper.getPersonImgBypersonDetailId(3));
    }

    @Test
    void insertPersonImg() {
        PersonImg tmp = new PersonImg(0,12,12,null);
        mapper.insertPersonImg(tmp);
    }

    @Test
    void updatePersonImg() {
        PersonImg tmp = mapper.getPersonImgBypersonImgId(4);
        tmp.setOssId(11);
        mapper.updatePersonImg(tmp);
    }
}