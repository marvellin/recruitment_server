package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:13 2020/3/25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class UserMapperTest {
    @Autowired
    UserMapper mapper;

    @Test
    void insertUser() {
        User tmp = new User(0,"10214768667@qq.com","root","admin");
        mapper.insertUser(tmp);
    }

    @Test
    void updateUser() {
        User tmp = mapper.getUserByuserId(1);
        tmp.setPassword("123456");
        mapper.updateUser(tmp);
    }

    @Test
    void getUserByuserId() {
        System.out.println(mapper.getUserByuserId(1));
    }

    @Test
    void getUserByemail() {
        System.out.println(mapper.getUserByemail(null));
        System.out.println(mapper.getUserByemail("1021478620@qq.com"));
    }
}