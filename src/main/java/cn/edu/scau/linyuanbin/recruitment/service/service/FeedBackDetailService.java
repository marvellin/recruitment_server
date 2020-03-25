package cn.edu.scau.linyuanbin.recruitment.service.service;

import cn.edu.scau.linyuanbin.recruitment.domain.FeedBackDetail;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:22 2020/3/25
 */
public interface FeedBackDetailService {
    /*
     *根据feedBackDetailId获得对象
     * */
    public FeedBackDetail getFeedBackDetailByfeedBackDetailId(Integer feedBackDetailId);

    /*
     *根据feedBackId获得对象
     * */
    public FeedBackDetail getFeedBackDetailByfeedBackId(Integer feedBackId);

    /*
     *新增对象
     * */
    public int insertFeedBackDetail(FeedBackDetail feedBackDetail);

    /*
     * 新增多个对象
     * */
    public int insertFeedBackDetailList(List<FeedBackDetail> feedBackDetailList);
}
