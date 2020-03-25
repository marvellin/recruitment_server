package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.FeedBack;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.INTERNAL;
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
class FeedBackMapperTest {
    @Autowired
    FeedBackMapper mapper;

    @Test
    void getFeedBackByfeedBackId() {
        System.out.println(mapper.getFeedBackByfeedBackId(1));
    }

    @Test
    void getFeedBackBydeliveryId() {
        System.out.println(mapper.getFeedBackBydeliveryId(2));
    }

    @Test
    void insertFeedBack() {
        FeedBack tmp = new FeedBack(0,14,"test520","不合适",null);
        mapper.insertFeedBack(tmp);
    }

    @Test
    void updateFeedBack() {
        FeedBack tmp = mapper.getFeedBackByfeedBackId(3);
        tmp.setFeedBackTime("test");
        mapper.updateFeedBack(tmp);
    }

    @Test
    void updateFeedBackList() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        /*FeedBack tmp1 = mapper.getFeedBackByfeedBackId(5);
        FeedBack tmp2 = mapper.getFeedBackByfeedBackId(6);
        list.add(tmp1);
        list.add(tmp2);*/
        mapper.updateFeedBackList(list,"邀请面试");
    }

    @Test
    void insertFeedBackList() {
        FeedBack tmp1 = new FeedBack(0,15,"test521","不合适",null);
        FeedBack tmp2 = new FeedBack(0,16,"test522","不合适",null);
        List<FeedBack> list = new ArrayList<>();
        list.add(tmp1);
        list.add(tmp2);
        mapper.insertFeedBackList(list);
    }
}