package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.DefaultResume;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: linyuanbin
 * @Description:
 * 默认简历对象mapper
 * 1.根据defaultResumeId查找对象
 * 2.根据personId查找对象
 * 3.更新对象
 * 4.新增对象
 * @Date: Created in 23:28 2020/3/22
 */
@Mapper
public interface DefaultResumeMapper {
    /*
    *根据defaultResumeId查找对象
    * */
    public DefaultResume getDefaultResumeBydefaultResumeId(@Param("defaultResumeId")Integer defaultResumeId);

    /*
     *根据personId查找对象
     * */
    public DefaultResume getDefaultResumeBypersonId(@Param("personId")Integer personId);

    /*
     *更新对象
     * */
    public void updateDefaultResume(@Param("defaultResume")DefaultResume defaultResume);

    /*
     *新增对象
     * */
    public int insertDefaultResume(@Param("defaultResume")DefaultResume defaultResume);
}
