package cn.edu.scau.linyuanbin.recruitment.service.service;

import cn.edu.scau.linyuanbin.recruitment.domain.AttachMentResume;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:18 2020/3/25
 */
public interface AttachmentResumeService {
    /*
     * 通过attachmentResumeId获取attachmentResume
     * */
    public AttachMentResume getAttachMentResumeByAttachmentResumeId(int attachMentResumeId);

    /*
     * 通过personId获取attachmentResumeList
     * */
    public List<AttachMentResume> getAttachMentResumeListByPersonId(Integer personId);

    /*
     * 通过attachmentResumeId删除attachmentResume
     * */
    public void deleteAttachMentResumeByAttachmentResumeId(Integer attachmentResumeId);

    /*
     * 插入一个attachmentResume
     * */
    public int insertAttachMentResume(AttachMentResume attachMentResume);
}
