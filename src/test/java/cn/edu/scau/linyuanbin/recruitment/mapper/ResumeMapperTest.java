package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.Resume;
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
class ResumeMapperTest {
    @Autowired
    ResumeMapper mapper;

    @Test
    void getResumeByresumeId() {
        System.out.println(mapper.getResumeByresumeId(1));
    }

    @Test
    void getResumeBypersonId() {
        System.out.println(mapper.getResumeBypersonId(2));
    }

    @Test
    void insertResume() {
        Resume tmp = new Resume();
        tmp.setPersonId(11);
        tmp.setResumename("test520");
        tmp.setSelfdescription("test520");
        mapper.insertResume(tmp);
    }

    @Test
    void updateResume() {
        Resume tmp = mapper.getResumeByresumeId(3);
        tmp.setSelfdescription("test");
        mapper.updateResume(tmp);
    }
}