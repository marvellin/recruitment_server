package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.Delivery;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:11 2020/3/25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class DeliveryMapperTest {
    @Autowired
    DeliveryMapper mapper;

    @Test
    void getDeliveryBydeliveryId() {
        System.out.println(mapper.getDeliveryBydeliveryId(2));
    }

    @Test
    void getDeliveryListBypositionId() {
        System.out.println(mapper.getDeliveryListBypositionId(1));
    }

    @Test
    void getDeliveryListBypersonId() {
        System.out.println(mapper.getDeliveryListBypersonId(3));
    }

    @Test
    void insertDelivery() {
        Delivery tmp = new Delivery(0,11,11,"test520",1,null,null,null,null);
        mapper.insertDelivery(tmp);
    }

    @Test
    void updateDelivary() {
        Delivery tmp = mapper.getDeliveryBydeliveryId(10);
        tmp.setStatus(3);
        mapper.updateDelivary(tmp);
    }

    @Test
    void updatePersonIdBydeliveryId() {
        /*List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);*/
        mapper.updatePersonIdBydeliveryId(1);
    }

    @Test
    void updatePositionIdBydeliveryId() {
        mapper.updatePositionIdBydeliveryId(2);
    }

    @Test
    void updatePositionIdBydeliveryIdList() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        mapper.updatePositionIdBydeliveryIdList(list);
    }

    @Test
    void getDeliveryBypositionIdList() {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(8);
        System.out.println(mapper.getDeliveryBypositionIdList(list).get(0) + "\n" + mapper.getDeliveryBypositionIdList(list).get(1));
    }

    @Test
    void deleteBydeliveryId() {
        mapper.deleteBydeliveryId(12);
    }
}