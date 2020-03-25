package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.ProjectExperience;
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
class ProjectExperienceMapperTest {
    @Autowired
    ProjectExperienceMapper mapper;

    @Test
    void getProjectExperienceByprojectExperienceId() {
        System.out.println(mapper.getProjectExperienceByprojectExperienceId(1));
    }

    @Test
    void getProjectExperienceListByresumeId() {
        System.out.println(mapper.getProjectExperienceListByresumeId(10).get(0) + "\n" + mapper.getProjectExperienceListByresumeId(10).get(1));
    }

    @Test
    void insertProjectExperience() {
        ProjectExperience tmp = new ProjectExperience(0,1,"test520","test520","test520","test520","test520");
        mapper.insertProjectExperience(tmp);
    }

    @Test
    void updateProjectExperience() {
        ProjectExperience tmp = mapper.getProjectExperienceByprojectExperienceId(2);
        tmp.setIntro("tes");
        mapper.updateProjectExperience(tmp);
    }

    @Test
    void deleteByprojectExperienceId() {
        mapper.deleteByprojectExperienceId(3);
    }
}