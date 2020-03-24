package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.AttachMentResume;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 23:57 2020/3/23
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@Rollback
class AttachmentResumeMapperTest {
    @Autowired
    AttachmentResumeMapper attachmentResumeMapper;

    @Test
    void insertAttachMentResume() {
        AttachMentResume attachMentResume = new AttachMentResume(0,1,15,"testInsert.png",null);
        attachmentResumeMapper.insertAttachMentResume(attachMentResume);
        System.out.println(attachMentResume.toString());
    }

    @Test
    void getAttachMentResumeByAttachmentResumeId() {
        AttachMentResume tmp = attachmentResumeMapper.getAttachMentResumeByAttachmentResumeId(2);
        System.out.println(tmp);
    }

    @Test
    void getAttachMentResumeListByPersonId() {
          List<AttachMentResume> tmp = attachmentResumeMapper.getAttachMentResumeListByPersonId(null);
          System.out.println(tmp.toString());
    }

    @Test
    void deleteAttachMentResumeByAttachmentResumeId() {
        attachmentResumeMapper.deleteAttachMentResumeByAttachmentResumeId(new Integer(1));
    }

    @Test
    void insertAttachMentResume1() {
    }
}