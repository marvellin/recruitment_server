package cn.edu.scau.linyuanbin.recruitment.service.impl;

import cn.edu.scau.linyuanbin.recruitment.domain.DefaultResume;
import cn.edu.scau.linyuanbin.recruitment.mapper.DefaultResumeMapper;
import cn.edu.scau.linyuanbin.recruitment.service.service.DefaultResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:23 2020/3/25
 */
@Service("defaultResumeService")
public class DefaultResumeServiceImpl implements DefaultResumeService {
    @Autowired
    DefaultResumeMapper mapper;

    @Override
    public DefaultResume getDefaultResumeBydefaultResumeId(Integer defaultResumeId) {
        return mapper.getDefaultResumeBydefaultResumeId(defaultResumeId);
    }

    @Override
    public DefaultResume getDefaultResumeBypersonId(Integer personId) {
        return mapper.getDefaultResumeBypersonId(personId);
    }

    @Override
    public void updateDefaultResume(DefaultResume defaultResume) {
        mapper.updateDefaultResume(defaultResume);
    }

    @Override
    public int insertDefaultResume(DefaultResume defaultResume) {
        return mapper.insertDefaultResume(defaultResume);
    }
}
