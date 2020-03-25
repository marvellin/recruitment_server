package cn.edu.scau.linyuanbin.recruitment.service.service;

import cn.edu.scau.linyuanbin.recruitment.domain.DefaultResume;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:18 2020/3/25
 */
public interface DefaultResumeService {
    /*
     *根据defaultResumeId查找对象
     * */
    public DefaultResume getDefaultResumeBydefaultResumeId(Integer defaultResumeId);

    /*
     *根据personId查找对象
     * */
    public DefaultResume getDefaultResumeBypersonId(Integer personId);

    /*
     *更新对象
     * */
    public void updateDefaultResume(DefaultResume defaultResume);

    /*
     *新增对象
     * */
    public int insertDefaultResume(DefaultResume defaultResume);
}
