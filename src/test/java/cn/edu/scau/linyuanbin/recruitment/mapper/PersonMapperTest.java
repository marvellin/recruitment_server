package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.Person;
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
class PersonMapperTest {
    @Autowired
    PersonMapper mapper;

    @Test
    void getPersonBypersonId() {
        System.out.println(mapper.getPersonBypersonId(1));
    }

    @Test
    void getPersonByuserId() {
        System.out.println(mapper.getPersonByuserId(2));
    }

    @Test
    void insertPerson() {
        Person tmp = new Person();
        tmp.setUserId(23);
        mapper.insertPerson(tmp);
    }
}