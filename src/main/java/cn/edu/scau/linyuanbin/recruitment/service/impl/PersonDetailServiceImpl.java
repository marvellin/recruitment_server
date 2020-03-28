package cn.edu.scau.linyuanbin.recruitment.service.impl;

import cn.edu.scau.linyuanbin.recruitment.domain.PersonDetail;
import cn.edu.scau.linyuanbin.recruitment.mapper.PersonDetailMapper;
import cn.edu.scau.linyuanbin.recruitment.service.service.PersonDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:23 2020/3/25
 */
@Service("personDetailService")
public class PersonDetailServiceImpl implements PersonDetailService {
    @Autowired
    PersonDetailMapper mapper;

    @Override
    public PersonDetail getPersonDetailBypersonDetailId(Integer personDetailId) {
        return mapper.getPersonDetailBypersonDetailId(personDetailId);
    }

    @Override
    public PersonDetail getPersonDetailBypersonId(Integer personId) {
        return mapper.getPersonDetailBypersonId(personId);
    }

    @Override
    public PersonDetail getPersonDetailByresumeId(Integer resumeId) {
        return mapper.getPersonDetailByresumeId(resumeId);
    }

    @Override
    public int insertPersonDetail(PersonDetail personDetail) {
        return mapper.insertPersonDetail(personDetail);
    }

    @Override
    public void updatePersonDetail(PersonDetail personDetail) {
        mapper.updatePersonDetail(personDetail);
    }

    @Override
    public PersonDetail getPersonDetailByEmail(String email) {
        return mapper.getPersonDetailByEmail(email);
    }

    @Override
    public PersonDetail getPersonDetailByTel(String tel) {
        return mapper.getPersonDetailByTel(tel);
    }
}
