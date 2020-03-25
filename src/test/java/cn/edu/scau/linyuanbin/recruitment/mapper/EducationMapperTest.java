package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.Education;
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
class EducationMapperTest {
    @Autowired
    EducationMapper mapper;

    @Test
    void getEducationByeducationId() {
        System.out.println(mapper.getEducationByeducationId(1));
    }

    @Test
    void getEducationListByresumeId() {
        System.out.println(mapper.getEducationListByresumeId(2));
    }

    @Test
    void insertEducation() {
        Education tmp = new Education(0,1,"test520","test520","test520","test520","test520","test520");
        mapper.insertEducation(tmp);
    }

    @Test
    void deleteEducationByeducationId() {
        mapper.deleteEducationByeducationId(3);
    }

    @Test
    void updateEducation() {
        Education tmp = mapper.getEducationByeducationId(4);
        tmp.setSchoole("test");
        mapper.updateEducation(tmp);
    }
}