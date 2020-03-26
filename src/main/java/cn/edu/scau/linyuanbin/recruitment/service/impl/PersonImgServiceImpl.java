package cn.edu.scau.linyuanbin.recruitment.service.impl;

import cn.edu.scau.linyuanbin.recruitment.domain.PersonImg;
import cn.edu.scau.linyuanbin.recruitment.mapper.PersonImgMapper;
import cn.edu.scau.linyuanbin.recruitment.service.service.PersonImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:23 2020/3/25
 */
@Service("personImgService")
public class PersonImgServiceImpl implements PersonImgService {
    @Autowired
    PersonImgMapper mapper;

    @Override
    public PersonImg getPersonImgBypersonImgId(Integer personImgId) {
        return mapper.getPersonImgBypersonImgId(personImgId);
    }

    @Override
    public PersonImg getPersonImgBypersonDetailId(Integer personDetailId) {
        return mapper.getPersonImgBypersonDetailId(personDetailId);
    }

    @Override
    public int insertPersonImg(PersonImg personImg) {
        return mapper.insertPersonImg(personImg);
    }

    @Override
    public void updatePersonImg(PersonImg personImg) {
        mapper.updatePersonImg(personImg);
    }
}
