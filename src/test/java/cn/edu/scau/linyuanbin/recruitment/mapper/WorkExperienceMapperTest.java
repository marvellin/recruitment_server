package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.WorkExperience;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 23:24 2020/3/25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class WorkExperienceMapperTest {
    @Autowired
    WorkExperienceMapper mapper;

    @Test
    void getWorkExperienceByworkExperienceId() {
        System.out.println(mapper.getWorkExperienceByworkExperienceId(1));
    }

    @Test
    void getWorkExperienceListByresumeId() {
        System.out.println(mapper.getWorkExperienceListByresumeId(2));
    }

    @Test
    void insertWorkExperience() {
        WorkExperience tmp = new WorkExperience(0,1,"test520","test520","test520","test520");
        mapper.insertWorkExperience(tmp);
    }

    @Test
    void updateWorkExperience() {
        WorkExperience tmp = mapper.getWorkExperienceByworkExperienceId(3);
        tmp.setComname("test");
        mapper.updateWorkExperience(tmp);
    }

    @Test
    void deleteByworkExperienceId() {
        mapper.deleteByworkExperienceId(4);
    }
}