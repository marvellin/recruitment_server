package cn.edu.scau.linyuanbin.recruitment;

import cn.edu.scau.linyuanbin.recruitment.domain.AttachMentResume;
import cn.edu.scau.linyuanbin.recruitment.domain.OSSFile;
import cn.edu.scau.linyuanbin.recruitment.mapper.AttachmentResumeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RecruitmentApplicationTests {
    @Autowired
    AttachmentResumeMapper attachmentResumeMapper;

    @Test
    void TestAttachMentResumeMapper(){
        AttachMentResume attachMentResume = new AttachMentResume(0,1,1,"testInsert.png",null);
        attachmentResumeMapper.insertAttachMentResume(attachMentResume);
    }

    /*@Test
    void contextLoads() {
    }*/

}
