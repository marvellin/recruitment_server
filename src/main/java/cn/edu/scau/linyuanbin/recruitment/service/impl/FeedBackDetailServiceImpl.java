package cn.edu.scau.linyuanbin.recruitment.service.impl;

import cn.edu.scau.linyuanbin.recruitment.domain.FeedBackDetail;
import cn.edu.scau.linyuanbin.recruitment.mapper.FeedBackDetailMapper;
import cn.edu.scau.linyuanbin.recruitment.service.service.FeedBackDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:23 2020/3/25
 */
@Service("feedBackDetailService")
public class FeedBackDetailServiceImpl implements FeedBackDetailService {
    @Autowired
    FeedBackDetailMapper mapper;


    @Override
    public FeedBackDetail getFeedBackDetailByfeedBackDetailId(Integer feedBackDetailId) {
        return mapper.getFeedBackDetailByfeedBackDetailId(feedBackDetailId);
    }

    @Override
    public FeedBackDetail getFeedBackDetailByfeedBackId(Integer feedBackId) {
        return mapper.getFeedBackDetailByfeedBackId(feedBackId);
    }

    @Override
    public int insertFeedBackDetail(FeedBackDetail feedBackDetail) {
        return mapper.insertFeedBackDetail(feedBackDetail);
    }

    @Override
    public int insertFeedBackDetailList(List<FeedBackDetail> feedBackDetailList) {
        return mapper.insertFeedBackDetailList(feedBackDetailList);
    }
}
