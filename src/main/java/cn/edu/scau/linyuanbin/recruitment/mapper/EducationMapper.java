package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.Education;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * 教育经历对象mapper
 * 1.根据educationId获得单个对象
 * 2.根据resumeId获得多个对象
 * 3.新增对象
 * 4.根据educationId删除对象
 * 5.更新对象
 * @Date: Created in 23:28 2020/3/22
 */
@Mapper
public interface EducationMapper {
    /*
    * 根据educationId获得单个对象
    * */
    public Education getEducationByeducationId(@Param("educationId")Integer educationId);

    /*
     *根据resumeId获得多个对象
     * */
    public List<Education> getEducationListByresumeId(@Param("resumeId")Integer resumeId);

    /*
     *新增对象
     * */
    public int insertEducation(@Param("education")Education education);

    /*
     *根据educationId删除对象
     * */
    public void deleteEducationByeducationId(@Param("educationId")Integer educationId);

    /*
     *更新对象
     * */
    public void updateEducation(@Param("education")Education education);
}
