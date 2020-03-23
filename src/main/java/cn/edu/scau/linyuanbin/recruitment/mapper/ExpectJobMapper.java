package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.ExpectJob;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: linyuanbin
 * @Description:
 * 期望工作对象mapper
 * 1.根据expectJobId获得对象
 * 2.根据resumeId获得对象
 * 3.新增对象
 * 4.更新对象
 * @Date: Created in 23:27 2020/3/22
 */
@Mapper
public interface ExpectJobMapper {
    /*
    *根据expectJobId获得对象
    * */
    public ExpectJob getExpectJobByexpectJobId(@Param("expectJobId")Integer expectJobId);

    /*
     *根据resumeId获得对象
     * */
    public ExpectJob getExpectJobByresumeId(@Param("resumeId")Integer resumeId);

    /*
     *新增对象
     * */
    public int insertExpectJob(@Param("expectJob")ExpectJob expectJob);

    /*
     *更新对象
     * */
    public void updateExpectJob(@Param("expectJob")ExpectJob expectJob);
}
