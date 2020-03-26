package cn.edu.scau.linyuanbin.recruitment.service.impl;

import cn.edu.scau.linyuanbin.recruitment.domain.ProjectExperience;
import cn.edu.scau.linyuanbin.recruitment.mapper.ProjectExperienceMapper;
import cn.edu.scau.linyuanbin.recruitment.service.service.ProjectExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:23 2020/3/25
 */
@Service("projectExperienceService")
public class ProjectExperienceServiceImpl implements ProjectExperienceService {
    @Autowired
    ProjectExperienceMapper mapper;

    @Override
    public ProjectExperience getProjectExperienceByprojectExperienceId(Integer projectExperienceId) {
        return mapper.getProjectExperienceByprojectExperienceId(projectExperienceId);
    }

    @Override
    public List<ProjectExperience> getProjectExperienceListByresumeId(Integer resumeId) {
        return mapper.getProjectExperienceListByresumeId(resumeId);
    }

    @Override
    public int insertProjectExperience(ProjectExperience projectExperience) {
        return mapper.insertProjectExperience(projectExperience);
    }

    @Override
    public void updateProjectExperience(ProjectExperience projectExperience) {
        mapper.updateProjectExperience(projectExperience);
    }

    @Override
    public void deleteByprojectExperienceId(Integer projectExperienceId) {
        mapper.deleteByprojectExperienceId(projectExperienceId);
    }
}
