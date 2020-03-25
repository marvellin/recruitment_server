package cn.edu.scau.linyuanbin.recruitment.service.service;

import cn.edu.scau.linyuanbin.recruitment.domain.Education;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:18 2020/3/25
 */
public interface EducationService {
    /*
     * 根据educationId获得单个对象
     * */
    public Education getEducationByeducationId(Integer educationId);

    /*
     *根据resumeId获得多个对象
     * */
    public List<Education> getEducationListByresumeId(Integer resumeId);

    /*
     *新增对象
     * */
    public int insertEducation(Education education);

    /*
     *根据educationId删除对象
     * */
    public void deleteEducationByeducationId(Integer educationId);

    /*
     *更新对象
     * */
    public void updateEducation(Education education);
}
