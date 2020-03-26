package cn.edu.scau.linyuanbin.recruitment.service.impl;

import cn.edu.scau.linyuanbin.recruitment.domain.Person;
import cn.edu.scau.linyuanbin.recruitment.mapper.PersonMapper;
import cn.edu.scau.linyuanbin.recruitment.service.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:23 2020/3/25
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonMapper mapper;

    @Override
    public Person getPersonBypersonId(Integer personId) {
        return mapper.getPersonBypersonId(personId);
    }

    @Override
    public Person getPersonByuserId(Integer userId) {
        return mapper.getPersonByuserId(userId);
    }

    @Override
    public int insertPerson(Person person) {
        return mapper.insertPerson(person);
    }
}
