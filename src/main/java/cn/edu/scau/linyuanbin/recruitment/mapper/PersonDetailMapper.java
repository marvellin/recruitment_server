package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.PersonDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: linyuanbin
 * @Description:
 * 个人基本信息对象mapper
 * 1.根据personDetailId查找对象
 * 2.根据personId查找对象
 * 3.根据resumeId查找对象
 * 4.新增对象
 * 5.更新对象
 * @Date: Created in 23:26 2020/3/22
 */
@Mapper
public interface PersonDetailMapper {
    /*
    *根据personDetailId查找对象
    * */
    public PersonDetail getPersonDetailBypersonDetailId(@Param("personDetailId")Integer personDetailId);

    /*
     *根据personId查找对象
     * */
    public PersonDetail getPersonDetailBypersonId(@Param("personId")Integer personId);

    /*
     *根据resumeId查找对象
     * */
    public PersonDetail getPersonDetailByresumeId(@Param("resumeId")Integer resumeId);

    /*
     *新增对象
     * */
    public int insertPersonDetail(@Param("personDetail")PersonDetail personDetail);

    /*
     *更新对象
     * */
    public void updatePersonDetail(@Param("personDetail")PersonDetail personDetail);
}
