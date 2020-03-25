package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.AttachMentResume;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:09 2020/3/25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class AttachmentResumeMapperTest {
    @Autowired
    AttachmentResumeMapper mapper;

    @Test
    void getAttachMentResumeByAttachmentResumeId() {
        System.out.println(mapper.getAttachMentResumeByAttachmentResumeId(10));
    }

    @Test
    void getAttachMentResumeListByPersonId() {
        System.out.println(mapper.getAttachMentResumeListByPersonId(9));
    }

    @Test
    void deleteAttachMentResumeByAttachmentResumeId() {
        mapper.deleteAttachMentResumeByAttachmentResumeId(6);
    }

    @Test
    void insertAttachMentResume() {
        AttachMentResume tmp = new AttachMentResume(0,11,12,"test520",null);
        mapper.insertAttachMentResume(tmp);
    }
}