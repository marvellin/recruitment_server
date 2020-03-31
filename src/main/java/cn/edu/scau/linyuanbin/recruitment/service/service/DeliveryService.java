package cn.edu.scau.linyuanbin.recruitment.service.service;

import cn.edu.scau.linyuanbin.recruitment.domain.Delivery;
import org.omg.CORBA.INTERNAL;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:21 2020/3/25
 */
public interface DeliveryService {
    /*
     * 根据personId查找status=3的对象list
     * */
    public List<Delivery> getDeliveryListStatus3BypersonId(Integer personId);

    /*
     *根据deliveryId获得单个对象
     * */
    public Delivery getDeliveryBydeliveryId(Integer deliveryId);

    /*
     *根据positionId获得多个对象
     * */
    public List<Delivery> getDeliveryListBypositionId(Integer positionId);

    /*
     *根据personId获得多个对象
     * */
    public List<Delivery> getDeliveryListBypersonId(Integer personId);

    /*
     *新增对象
     * */
    public int insertDelivery(Delivery delivery);

    /*
     *更新对象
     * */
    public void updateDelivary(Delivery delivery);

    /*
     *个人用户根据deliveryId更新对象（实则是设置personId为0，对自身不可见）
     * */
    public void updatePersonIdBydeliveryId(Integer deliveryId);

    /*
     *公司用户根据deliveryId更新对象（实则是设置positionId为0，对自身不可见）
     * */
    public void updatePositionIdBydeliveryId(Integer deliveryId);

    /*
     *公司用户根据deliveryIdList更新对象（实则是设置positionId为0，对自身不可见）
     * */
    public void updatePositionIdBydeliveryIdList(List<Integer> deliveryIdList);

    /*
     *根据positionIdList查找多个对象
     * */
    public List<Delivery> getDeliveryBypositionIdList(List<Integer> positionIdList);

    /*
     *根据deliveryId删除对象
     * */
    public void deleteBydeliveryId(Integer deliveryId);

    /*
    * 根据personId和positionId查找对应投递记录
    * */
    public Delivery getByPersonIdWithPositionId(Integer personId, Integer positionId);
}
