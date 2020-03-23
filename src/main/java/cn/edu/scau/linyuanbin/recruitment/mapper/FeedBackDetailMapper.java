package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.FeedBackDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * 反馈详细内容对象mapper
 * 1.根据feedBackDetailId获得对象
 * 2.根据feedBackId获得对象
 * 3.新增对象
 * 4.新增多个对象
 * @Date: Created in 23:36 2020/3/22
 */
@Mapper
public interface FeedBackDetailMapper {
    /*
    *根据feedBackDetailId获得对象
    * */
    public FeedBackDetail getFeedBackDetailByfeedBackDetailId(@Param("feedBackDetailId")Integer feedBackDetailId);

    /*
     *根据feedBackId获得对象
     * */
    public FeedBackDetail getFeedBackDetailByfeedBackId(@Param("feedBackId")Integer feedBackId);

    /*
     *新增对象
     * */
    public int insertFeedBackDetail(@Param("feedBackDetail")FeedBackDetail feedBackDetail);

    /*
    * 新增多个对象
    * */
    public int insertFeedBackDetailList(List<FeedBackDetail> feedBackDetailList);
}
