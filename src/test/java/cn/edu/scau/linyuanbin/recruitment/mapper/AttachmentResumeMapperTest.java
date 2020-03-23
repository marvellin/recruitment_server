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
 * @Date: Created in 23:57 2020/3/23
 */

@RunWith(SpringRunner.class)
@SpringBootTest
class AttachmentResumeMapperTest {
    @Autowired
    AttachmentResumeMapper attachmentResumeMapper;

    @Test
    void insertAttachMentResume() {
        AttachMentResume attachMentResume = new AttachMentResume(0,1,1,"testInsert.png",null);
        attachmentResumeMapper.insertAttachMentResume(attachMentResume);
    }
}