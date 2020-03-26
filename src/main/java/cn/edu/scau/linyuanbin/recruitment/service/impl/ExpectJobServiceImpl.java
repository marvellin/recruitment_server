package cn.edu.scau.linyuanbin.recruitment.service.impl;

import cn.edu.scau.linyuanbin.recruitment.domain.ExpectJob;
import cn.edu.scau.linyuanbin.recruitment.mapper.ExpectJobMapper;
import cn.edu.scau.linyuanbin.recruitment.service.service.ExpectJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:23 2020/3/25
 */
@Service("expectJobService")
public class ExpectJobServiceImpl implements ExpectJobService {
    @Autowired
    ExpectJobMapper mapper;

    @Override
    public ExpectJob getExpectJobByexpectJobId(Integer expectJobId) {
        return mapper.getExpectJobByexpectJobId(expectJobId);
    }

    @Override
    public ExpectJob getExpectJobByresumeId(Integer resumeId) {
        return mapper.getExpectJobByresumeId(resumeId);
    }

    @Override
    public int insertExpectJob(ExpectJob expectJob) {
        return mapper.insertExpectJob(expectJob);
    }

    @Override
    public void updateExpectJob(ExpectJob expectJob) {
        mapper.updateExpectJob(expectJob);
    }
}
