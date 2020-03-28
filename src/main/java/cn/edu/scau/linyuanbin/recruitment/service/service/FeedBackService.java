package cn.edu.scau.linyuanbin.recruitment.service.service;

import cn.edu.scau.linyuanbin.recruitment.domain.FeedBack;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:21 2020/3/25
 */
public interface FeedBackService {
    /*
     *根据feedBackId查找
     * */
    public FeedBack getFeedBackByfeedBackId(Integer feedBackId);

    /*
     *根据deliveryId查找
     * */
    public FeedBack getFeedBackBydeliveryId(Integer deliveryId);

    /*
     *新增对象
     * */
    public int insertFeedBack(FeedBack feedBack);

    /*
     *更新对象
     * */
    public void updateFeedBack(FeedBack feedBack);

    /*
     *根据feedBackIdList更新多个对象(或为‘邀请面试’或为‘不合适’),测试是否可以！！！
     * */
    public void updateFeedBackList(List<Integer> feedBackList, String feedBack,String feedBackTime);

    /*
     *新增多个对象
     * */
    public int insertFeedBackList(List<FeedBack> feedBackList);
}
