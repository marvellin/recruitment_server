package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.Position;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:12 2020/3/25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class PositionMapperTest {
    @Autowired
    PositionMapper mapper;

    @Test
    void getPositionBypositionId() {
        System.out.println(mapper.getPositionBypositionId(1));
    }

    @Test
    void getPositionListBycompanyId() {
        System.out.println(mapper.getPositionListBycompanyId(10));
    }

    @Test
    void insertPosition() {
        Position tmp = new Position(0,11,5,20,"test520","test520","test520","实习","test520","test520","test520","test520","test520","test520","1");
        mapper.insertPosition(tmp);
    }

    @Test
    void deleteBypositionId() {
        mapper.deleteBypositionId(2);
    }

    @Test
    void updatePosition() {
        Position tmp = mapper.getPositionBypositionId(3);
        tmp.setName("test");
        mapper.updatePosition(tmp);
    }

    @Test
    void getOnlinePositionListByCompanyId() {
        System.out.println(mapper.getOnlinePositionListByCompanyId(4));
    }

    @Test
    void getOfflinePositionListByCompanyId() {
        System.out.println(mapper.getOfflinePositionListByCompanyId(4));
    }

    @Test
    void updatePositionStatusTo1BypositionId() {
        mapper.updatePositionStatusTo1BypositionId(6);
    }

    @Test
    void updatePositionStatusTo0BypositionId() {
        mapper.updatePositionStatusTo0BypositionId(7);
    }
}