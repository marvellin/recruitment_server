package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.ProjectExperience;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * 项目经历对象mapper
 * 1.根据projectExperienceId获得单个对象
 * 2.根据resumeId获得多个对象
 * 3.新增对象
 * 4.更新对象
 * 5.根据projectExperienceId删除对象
 * @Date: Created in 23:28 2020/3/22
 */
@Mapper
public interface ProjectExperienceMapper {
    /*
    * 根据projectExperienceId获得单个对象
    * */
    public ProjectExperience getProjectExperienceByprojectExperienceId(@Param("projectExperienceId")Integer projectExperienceId);

    /*
     *根据resumeId获得多个对象
     * */
    public List<ProjectExperience> getProjectExperienceListByresumeId(@Param("resumeId")Integer resumeId);

    /*
     *新增对象
     * */
    public int insertProjectExperience(@Param("projectExperience")ProjectExperience projectExperience);

    /*
     *更新对象
     * */
    public void updateProjectExperience(@Param("projectExperience")ProjectExperience projectExperience);

    /*
     *根据projectExperienceId删除对象
     * */
    public void deleteByprojectExperienceId(@Param("projectExperienceId")Integer projectExperienceId);
}
