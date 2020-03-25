package cn.edu.scau.linyuanbin.recruitment.service.service;

import cn.edu.scau.linyuanbin.recruitment.domain.ExpectJob;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:17 2020/3/25
 */
public interface ExpectJobService {
    /*
     *根据expectJobId获得对象
     * */
    public ExpectJob getExpectJobByexpectJobId(Integer expectJobId);

    /*
     *根据resumeId获得对象
     * */
    public ExpectJob getExpectJobByresumeId(Integer resumeId);

    /*
     *新增对象
     * */
    public int insertExpectJob(ExpectJob expectJob);

    /*
     *更新对象
     * */
    public void updateExpectJob(ExpectJob expectJob);
}
