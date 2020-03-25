package cn.edu.scau.linyuanbin.recruitment.service.service;

import cn.edu.scau.linyuanbin.recruitment.domain.WorkExperience;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:17 2020/3/25
 */
public interface WorkExperienceService {
    /*
     *根据workExperienceId获得单个对象
     * */
    public WorkExperience getWorkExperienceByworkExperienceId(Integer workExperienceId);

    /*
     *根据resumeId获得多个对象
     * */
    public List<WorkExperience> getWorkExperienceListByresumeId(Integer resumeId);

    /*
     *新增对象
     * */
    public int insertWorkExperience(WorkExperience workExperience);

    /*
     *更新对象
     * */
    public void updateWorkExperience(WorkExperience workExperience);

    /*
     *根据workExperienceId删除对象
     * */
    public void deleteByworkExperienceId(Integer workExperienceId);
}
