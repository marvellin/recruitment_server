package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.MemberImg;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:11 2020/3/25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class MemberImgMapperTest {
    @Autowired
    MemberImgMapper mapper;

    @Test
    void getMemberImgBymemberImgId() {
        System.out.println(mapper.getMemberImgBymemberImgId(1));
    }

    @Test
    void getMemberImgBycompanyMemberId() {
        System.out.println(mapper.getMemberImgBycompanyMemberId(2));
    }

    @Test
    void updateMemberImg() {
        MemberImg tmp = mapper.getMemberImgBymemberImgId(3);
        tmp.setOssId(11);
        mapper.updateMemberImg(tmp);
    }

    @Test
    void insertMemberImg() {
        MemberImg tmp = new MemberImg(0,11,12,null);
        mapper.insertMemberImg(tmp);
    }
}