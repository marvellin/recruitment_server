package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.WorkExperience;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * 工作经历对象mapper
 * 1.根据workExperienceId获得单个对象
 * 2.根据resumeId获得多个对象
 * 3.新增对象
 * 4.更新对象
 * 5.根据workExperienceId删除对象
 * @Date: Created in 23:27 2020/3/22
 */
@Mapper
public interface WorkExperienceMapper {
    /*
    *根据workExperienceId获得单个对象
    * */
    public WorkExperience getWorkExperienceByworkExperienceId(@Param("workExperienceId")Integer workExperienceId);

    /*
     *根据resumeId获得多个对象
     * */
    public List<WorkExperience> getWorkExperienceListByresumeId(@Param("resumeId")Integer resumeId);

    /*
     *新增对象
     * */
    public int insertWorkExperience(@Param("workExperience")WorkExperience workExperience);

    /*
     *更新对象
     * */
    public void updateWorkExperience(@Param("workExperience")WorkExperience workExperience);

    /*
     *根据workExperienceId删除对象
     * */
    public void deleteByworkExperienceId(@Param("workExperienceId")Integer workExperienceId);
}
