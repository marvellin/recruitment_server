package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.CompanyMember;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:10 2020/3/25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class CompanyMemberMapperTest {
    @Autowired
    CompanyMemberMapper mapper;

    @Test
    void getCompanyMemberBycompanyMemberId() {
        System.out.println(mapper.getCompanyMemberBycompanyMemberId(1));
    }

    @Test
    void getCompanyMemberBycompanyId() {
        System.out.println(mapper.getCompanyMemberBycompanyId(2));
    }

    @Test
    void insertCompanyMember() {
        CompanyMember tmp = new CompanyMember(0,11,"test520","test520","test520",null);
        mapper.insertCompanyMember(tmp);
    }

    @Test
    void updateCompanyMember() {
        CompanyMember tmp = mapper.getCompanyMemberBycompanyMemberId(3);
        tmp.setName("更新测试");
        mapper.updateCompanyMember(tmp);
    }

    @Test
    void deleteBycompanyMemberId() {
        mapper.deleteBycompanyMemberId(4);
    }
}