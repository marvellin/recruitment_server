package cn.edu.scau.linyuanbin.recruitment.service.impl;

import cn.edu.scau.linyuanbin.recruitment.domain.WorkExperience;
import cn.edu.scau.linyuanbin.recruitment.mapper.WorkExperienceMapper;
import cn.edu.scau.linyuanbin.recruitment.service.service.WorkExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:23 2020/3/25
 */
@Service("workExperienceService")
public class WorkExperienceServiceImpl implements WorkExperienceService {
    @Autowired
    WorkExperienceMapper mapper;

    @Override
    public WorkExperience getWorkExperienceByworkExperienceId(Integer workExperienceId) {
        return mapper.getWorkExperienceByworkExperienceId(workExperienceId);
    }

    @Override
    public List<WorkExperience> getWorkExperienceListByresumeId(Integer resumeId) {
        return mapper.getWorkExperienceListByresumeId(resumeId);
    }

    @Override
    public int insertWorkExperience(WorkExperience workExperience) {
        return mapper.insertWorkExperience(workExperience);
    }

    @Override
    public void updateWorkExperience(WorkExperience workExperience) {
        mapper.updateWorkExperience(workExperience);
    }

    @Override
    public void deleteByworkExperienceId(Integer workExperienceId) {
        mapper.deleteByworkExperienceId(workExperienceId);
    }
}
