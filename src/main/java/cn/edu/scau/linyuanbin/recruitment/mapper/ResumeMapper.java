package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.Resume;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: linyuanbin
 * @Description:
 * 简历对象mapper
 * 1.根据resumeId获得对象
 * 2.根据personId获得对象
 * 3.新增对象
 * 4.更新对象
 * @Date: Created in 23:26 2020/3/22
 */
@Mapper
public interface ResumeMapper {
    /*
    *根据resumeId获得对象
    * */
    public Resume getResumeByresumeId(@Param("resumeId")Integer resumeId);

    /*
     *根据personId获得对象
     * */
    public Resume getResumeBypersonId(@Param("personId")Integer personId);

    /*
     *新增对象
     * */
    public int insertResume(@Param("resume")Resume resume);

    /*
     *更新对象
     * */
    public void updateResume(@Param("resume")Resume resume);
}
