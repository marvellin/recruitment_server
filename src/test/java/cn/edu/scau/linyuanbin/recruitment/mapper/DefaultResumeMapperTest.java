package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.DefaultResume;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:10 2020/3/25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class DefaultResumeMapperTest {
    @Autowired
    DefaultResumeMapper mapper;

    @Test
    void getDefaultResumeBydefaultResumeId() {
        System.out.println(mapper.getDefaultResumeBydefaultResumeId(1));
    }

    @Test
    void getDefaultResumeBypersonId() {
        System.out.println(mapper.getDefaultResumeBypersonId(2));
    }

    @Test
    void updateDefaultResume() {
        DefaultResume tmp = mapper.getDefaultResumeBydefaultResumeId(3);
        tmp.setAttachmentResumeId(3);
        mapper.updateDefaultResume(tmp);
    }

    @Test
    void insertDefaultResume() {
        DefaultResume tmp = new DefaultResume(0,11,13,11,null,null);
        mapper.insertDefaultResume(tmp);
    }
}