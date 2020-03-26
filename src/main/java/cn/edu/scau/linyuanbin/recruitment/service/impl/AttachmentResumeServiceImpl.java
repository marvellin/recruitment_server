package cn.edu.scau.linyuanbin.recruitment.service.impl;

import cn.edu.scau.linyuanbin.recruitment.domain.AttachMentResume;
import cn.edu.scau.linyuanbin.recruitment.mapper.AttachmentResumeMapper;
import cn.edu.scau.linyuanbin.recruitment.service.service.AttachmentResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:23 2020/3/25
 */
@Service("attachmentResumeService")
public class AttachmentResumeServiceImpl implements AttachmentResumeService {
    @Autowired
    AttachmentResumeMapper mapper;

    @Override
    public AttachMentResume getAttachMentResumeByAttachmentResumeId(int attachMentResumeId) {
        return mapper.getAttachMentResumeByAttachmentResumeId(attachMentResumeId);
    }

    @Override
    public List<AttachMentResume> getAttachMentResumeListByPersonId(Integer personId) {
        return mapper.getAttachMentResumeListByPersonId(personId);
    }

    @Override
    public void deleteAttachMentResumeByAttachmentResumeId(Integer attachmentResumeId) {
        mapper.deleteAttachMentResumeByAttachmentResumeId(attachmentResumeId);
    }

    @Override
    public int insertAttachMentResume(AttachMentResume attachMentResume) {
        return mapper.insertAttachMentResume(attachMentResume);
    }
}
