package cn.edu.scau.linyuanbin.recruitment.service.service;

import cn.edu.scau.linyuanbin.recruitment.domain.ProjectExperience;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:17 2020/3/25
 */
public interface ProjectExperienceService {
    /*
     * 根据projectExperienceId获得单个对象
     * */
    public ProjectExperience getProjectExperienceByprojectExperienceId(Integer projectExperienceId);

    /*
     *根据resumeId获得多个对象
     * */
    public List<ProjectExperience> getProjectExperienceListByresumeId(Integer resumeId);

    /*
     *新增对象
     * */
    public int insertProjectExperience(ProjectExperience projectExperience);

    /*
     *更新对象
     * */
    public void updateProjectExperience(ProjectExperience projectExperience);

    /*
     *根据projectExperienceId删除对象
     * */
    public void deleteByprojectExperienceId(Integer projectExperienceId);
}
