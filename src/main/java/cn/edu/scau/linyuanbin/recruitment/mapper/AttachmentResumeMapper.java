package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.AttachMentResume;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 *  简历附件对象的mapper
 *  1.根据attachmentResumeId获取单个对象
 *  2.根据personId获取多个对象
 *  3.保存一个对象
 *  4.根据attachmentResumeId删除一个对象
 * @Date: Created in 23:29 2020/3/22
 */

@Mapper
public interface AttachmentResumeMapper {
    /*
    * 通过attachmentResumeId获取attachmentResume
    * */
    public AttachMentResume getAttachMentResumeByAttachmentResumeId(@Param("attachmentResumeId") Integer attachmentResumeId);

    /*
    * 通过personId获取attachmentResumeList
    * */
    public List<AttachMentResume> getAttachMentResumeListByPersonId(@Param("personId") Integer personId);

    /*
    * 通过attachmentResumeId删除attachmentResume
    * */
    public void deleteAttachMentResumeByAttachmentResumeId(@Param("attachmentResumeId") Integer attachmentResumeId);

    /*
    * 插入一个attachmentResume
    * */
    public int insertAttachMentResume(@Param("attachMentResume") AttachMentResume attachMentResume);
}
