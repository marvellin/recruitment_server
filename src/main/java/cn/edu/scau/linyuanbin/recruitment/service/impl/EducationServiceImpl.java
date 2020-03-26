package cn.edu.scau.linyuanbin.recruitment.service.impl;

import cn.edu.scau.linyuanbin.recruitment.domain.Education;
import cn.edu.scau.linyuanbin.recruitment.mapper.EducationMapper;
import cn.edu.scau.linyuanbin.recruitment.service.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:23 2020/3/25
 */
@Service("educationService")
public class EducationServiceImpl implements EducationService {
    @Autowired
    EducationMapper mapper;


    @Override
    public Education getEducationByeducationId(Integer educationId) {
        return mapper.getEducationByeducationId(educationId);
    }

    @Override
    public List<Education> getEducationListByresumeId(Integer resumeId) {
        return mapper.getEducationListByresumeId(resumeId);
    }

    @Override
    public int insertEducation(Education education) {
        return mapper.insertEducation(education);
    }

    @Override
    public void deleteEducationByeducationId(Integer educationId) {
        mapper.deleteEducationByeducationId(educationId);
    }

    @Override
    public void updateEducation(Education education) {
        mapper.updateEducation(education);
    }
}
