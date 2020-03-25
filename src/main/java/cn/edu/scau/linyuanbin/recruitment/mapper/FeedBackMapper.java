package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.FeedBack;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * 反馈对象mapper
 * 1.根据feedBackId查找
 * 2.根据deliveryId查找
 * 3.新增对象
 * 4.更新对象
 * 5.根据feedBackIdList更新多个对象
 * 6.新增多个对象
 * @Date: Created in 23:36 2020/3/22
 */
@Mapper
public interface FeedBackMapper {
    /*
    *根据feedBackId查找
    * */
    public FeedBack getFeedBackByfeedBackId(@Param("feedBackId")Integer feedBackId);

    /*
     *根据deliveryId查找
     * */
    public FeedBack getFeedBackBydeliveryId(@Param("deliveryId")Integer deliveryId);

    /*
     *新增对象
     * */
    public int insertFeedBack(@Param("feedBack")FeedBack feedBack);

    /*
     *更新对象
     * */
    public void updateFeedBack(@Param("feedBack")FeedBack feedBack);

    /*
     *根据feedBackIdList更新多个对象(或为‘邀请面试’或为‘不合适’),测试是否可以！！！
     * */
    public void updateFeedBackList(@Param("feedBackIdList") List<Integer> feedBackIdList,@Param("feedBack")String feedBack);

    /*
     *新增多个对象
     * */
    public int insertFeedBackList(@Param("feedBackList") List<FeedBack> feedBackList);
}
