package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.Person;
import cn.edu.scau.linyuanbin.recruitment.domain.PersonDetail;
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
class PersonDetailMapperTest {
    @Autowired
    PersonDetailMapper mapper;

    @Test
    void getPersonDetailBypersonDetailId() {
        System.out.println(mapper.getPersonDetailBypersonDetailId(1));
    }

    @Test
    void getPersonDetailBypersonId() {
        System.out.println(mapper.getPersonDetailBypersonId(2));
    }

    @Test
    void getPersonDetailByresumeId() {
        System.out.println(mapper.getPersonDetailByresumeId(3));
    }

    @Test
    void insertPersonDetail() {
        PersonDetail tmp = new PersonDetail(0,11,13,"test520","test520","test520","男","test520","test520","test520",null);
        mapper.insertPersonDetail(tmp);
    }

    @Test
    void updatePersonDetail() {
        PersonDetail tmp = mapper.getPersonDetailBypersonDetailId(4);
        tmp.setUsername("test");
        mapper.updatePersonDetail(tmp);
    }
}