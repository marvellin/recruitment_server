package cn.edu.scau.linyuanbin.recruitment.service.impl;

import cn.edu.scau.linyuanbin.recruitment.domain.FeedBack;
import cn.edu.scau.linyuanbin.recruitment.mapper.FeedBackMapper;
import cn.edu.scau.linyuanbin.recruitment.service.service.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:23 2020/3/25
 */
@Service("feedBackService")
public class FeedBackServiceImpl implements FeedBackService {
    @Autowired
    FeedBackMapper mapper;

    @Override
    public FeedBack getFeedBackByfeedBackId(Integer feedBackId) {
        return mapper.getFeedBackByfeedBackId(feedBackId);
    }

    @Override
    public FeedBack getFeedBackBydeliveryId(Integer deliveryId) {
        return mapper.getFeedBackBydeliveryId(deliveryId);
    }

    @Override
    public int insertFeedBack(FeedBack feedBack) {
        return mapper.insertFeedBack(feedBack);
    }

    @Override
    public void updateFeedBack(FeedBack feedBack) {
        mapper.updateFeedBack(feedBack);

    }

    @Override
    public void updateFeedBackList(List<Integer> feedBackIdList, String feedBack,String feedBackTime) {
        mapper.updateFeedBackList(feedBackIdList,feedBack,feedBackTime);
    }

    @Override
    public int insertFeedBackList(List<FeedBack> feedBackList) {
        return mapper.insertFeedBackList(feedBackList);
    }
}
