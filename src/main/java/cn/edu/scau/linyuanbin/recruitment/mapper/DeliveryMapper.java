package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.Delivery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * 1.根据deliveryId获得单个对象
 * 2.根据positionId获得多个对象
 * 3.根据personId获得多个对象
 * 4.新增对象
 * 5.更新对象
 * 6.个人用户根据deliveryId更新对象（实则是设置personId为-1，对自身不可见）
 * 7.公司用户根据deliveryId更新对象（实则是设置positionId为-1，对自身不可见）
 * 8.公司用户根据deliveryIdList更新对象（实则是设置positionId为-1，对自身不可见）
 * 9.根据positionIdList查找多个对象
 * 10.根据deliveryId删除对象
 * @Date: Created in 23:36 2020/3/22
 */
@Mapper
public interface DeliveryMapper {
    /*
    *根据deliveryId获得单个对象
    * */
    public Delivery getDeliveryBydeliveryId(@Param("deliveryId")Integer deliveryId);

    /*
     *根据positionId获得多个对象
     * */
    public List<Delivery> getDeliveryListBypositionId(@Param("positionId")Integer positionId);

    /*
     *根据personId获得多个对象
     * */
    public List<Delivery> getDeliveryListBypersonId(@Param("personId")Integer personId);

    /*
     *新增对象
     * */
    public int insertDelivery(@Param("delivery")Delivery delivery);

    /*
     *更新对象
     * */
    public void updateDelivary(@Param("delivery")Delivery delivery);

    /*
    *个人用户根据deliveryId更新对象（实则是设置personId为0，对自身不可见）
    * */
    public void updatePersonIdBydeliveryId(@Param("deliveryId")Integer deliveryId);

    /*
     *公司用户根据deliveryId更新对象（实则是设置positionId为0，对自身不可见）
     * */
    public void updatePositionIdBydeliveryId(@Param("deliveryId")Integer deliveryId);

    /*
     *公司用户根据deliveryIdList更新对象（实则是设置positionId为0，对自身不可见）
     * */
    public void updatePositionIdBydeliveryIdList(@Param("deliveryIdList") List<Integer> deliveryIdList);

    /*
     *根据positionIdList查找多个对象
     * */
    public List<Delivery> getDeliveryBypositionIdList(@Param("positionIdList") List<Integer> positionIdList);

    /*
     *根据deliveryId删除对象
     * */
    public void deleteBydeliveryId(@Param("deliveryId")Integer deliveryId);
}
