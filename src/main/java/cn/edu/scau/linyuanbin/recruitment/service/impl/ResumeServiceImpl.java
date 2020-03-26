package cn.edu.scau.linyuanbin.recruitment.service.impl;

import cn.edu.scau.linyuanbin.recruitment.domain.Resume;
import cn.edu.scau.linyuanbin.recruitment.mapper.ResumeMapper;
import cn.edu.scau.linyuanbin.recruitment.service.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:23 2020/3/25
 */
@Service("resumeService")
public class ResumeServiceImpl implements ResumeService {
    @Autowired
    ResumeMapper mapper;

    @Override
    public Resume getResumeByresumeId(Integer resumeId) {
        return mapper.getResumeByresumeId(resumeId);
    }

    @Override
    public Resume getResumeBypersonId(Integer personId) {
        return mapper.getResumeBypersonId(personId);
    }

    @Override
    public int insertResume(Resume resume) {
        return mapper.insertResume(resume);
    }

    @Override
    public void updateResume(Resume resume) {
        mapper.updateResume(resume);
    }
}
