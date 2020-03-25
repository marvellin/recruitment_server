package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.FeedBackDetail;
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
class FeedBackDetailMapperTest {
    @Autowired
    FeedBackDetailMapper mapper;

    @Test
    void getFeedBackDetailByfeedBackDetailId() {
        System.out.println(mapper.getFeedBackDetailByfeedBackDetailId(1));
    }

    @Test
    void getFeedBackDetailByfeedBackId() {
        System.out.println(mapper.getFeedBackDetailByfeedBackId(2));
    }

    @Test
    void insertFeedBackDetail() {
        FeedBackDetail tmp = new FeedBackDetail(0,16,"test520","test520","test520");
        mapper.insertFeedBackDetail(tmp);
    }

    @Test
    void insertFeedBackDetailList() {
        FeedBackDetail tmp1 = new FeedBackDetail(0,17,"test520","test520","test520");
        FeedBackDetail tmp2 = new FeedBackDetail(0,18,"test520","test520","test520");
        List<FeedBackDetail> list = new ArrayList<>();
        list.add(tmp1);
        list.add(tmp2);
        mapper.insertFeedBackDetailList(list);
    }
}