package cn.edu.scau.linyuanbin.recruitment.service.service;

import cn.edu.scau.linyuanbin.recruitment.domain.Resume;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:16 2020/3/25
 */
public interface ResumeService {
    /*
     *根据resumeId获得对象
     * */
    public Resume getResumeByresumeId(Integer resumeId);

    /*
     *根据personId获得对象
     * */
    public Resume getResumeBypersonId(Integer personId);

    /*
     *新增对象
     * */
    public int insertResume(Resume resume);

    /*
     *更新对象
     * */
    public void updateResume(Resume resume);
}
