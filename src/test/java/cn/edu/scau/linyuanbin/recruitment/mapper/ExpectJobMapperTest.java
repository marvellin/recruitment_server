package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.ExpectJob;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:11 2020/3/25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class ExpectJobMapperTest {
    @Autowired
    ExpectJobMapper mapper;

    @Test
    void getExpectJobByexpectJobId() {
        System.out.println(mapper.getExpectJobByexpectJobId(1));
    }

    @Test
    void getExpectJobByresumeId() {
        System.out.println(mapper.getExpectJobByresumeId(2));
    }

    @Test
    void insertExpectJob() {
        ExpectJob tmp = new ExpectJob(0,13,"test520","实习","test520","test520");
        mapper.insertExpectJob(tmp);
    }

    @Test
    void updateExpectJob() {
        ExpectJob tmp = mapper.getExpectJobByexpectJobId(3);
        tmp.setCity("佛山");
        mapper.updateExpectJob(tmp);
    }
}