package cn.edu.scau.linyuanbin.recruitment.service.impl;

import cn.edu.scau.linyuanbin.recruitment.domain.*;
import cn.edu.scau.linyuanbin.recruitment.mapper.*;
import cn.edu.scau.linyuanbin.recruitment.service.service.UserService;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:23 2020/3/25
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper mapper;

    @Autowired
    CompanyMapper companyMapper;

    @Autowired
    PersonMapper personMapper;

    @Autowired
    CompanyDetailMapper companyDetailMapper;

    @Autowired
    PersonDetailMapper personDetailMapper;

    @Override
    public int insertUser(User user, String role)
    {
        int result = mapper.insertUser(user);
        if (role.equals(User.Person)) {
            Person person = new Person();
            person.setUserId(user.getUserId());
            personMapper.insertPerson(person);

            PersonDetail personDetail = new PersonDetail();
            personDetail.setPersonId(person.getPersonId());
            personDetailMapper.insertPersonDetail(personDetail);
        }
        else  if (role.equals(User.Company)){
            Company company = new Company();
            company.setUserId(user.getUserId());
            companyMapper.insertCompany(company);

            CompanyDetail companyDetail = new CompanyDetail();
            companyDetail.setCompanyId(company.getCompanyId());
            companyDetailMapper.insertCompanyDetail(companyDetail);
        }
        return result;
    }

    @Override
    public void updateUser(User user) {
        mapper.updateUser(user);
    }

    @Override
    public User getUserByuserId(Integer userId) {
        return mapper.getUserByuserId(userId);
    }

    @Override
    public User getUserByemail(String email) {
        return mapper.getUserByemail(email);
    }
}
