package cn.edu.scau.linyuanbin.recruitment.service.impl;

import cn.edu.scau.linyuanbin.recruitment.domain.Delivery;
import cn.edu.scau.linyuanbin.recruitment.mapper.DeliveryMapper;
import cn.edu.scau.linyuanbin.recruitment.service.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:23 2020/3/25
 */
@Service("deliveryService")
public class DeliveryServiceImpl implements DeliveryService {
    @Autowired
    DeliveryMapper mapper;


    @Override
    public List<Delivery> getDeliveryListStatus3BypersonId(Integer personId) {
        return mapper.getDeliveryListStatus3BypersonId(personId);
    }

    @Override
    public Delivery getDeliveryBydeliveryId(Integer deliveryId) {

        return mapper.getDeliveryBydeliveryId(deliveryId);
    }

    @Override
    public List<Delivery> getDeliveryListBypositionId(Integer positionId) {
        return mapper.getDeliveryListBypositionId(positionId);
    }

    @Override
    public List<Delivery> getDeliveryListBypersonId(Integer personId) {
        return mapper.getDeliveryListBypersonId(personId);
    }

    @Override
    public int insertDelivery(Delivery delivery) {
        return mapper.insertDelivery(delivery);
    }

    @Override
    public void updateDelivary(Delivery delivery) {
        mapper.updateDelivary(delivery);
    }

    @Override
    public void updatePersonIdBydeliveryId(Integer deliveryId) {
        mapper.updatePersonIdBydeliveryId(deliveryId);
    }

    @Override
    public void updatePositionIdBydeliveryId(Integer deliveryId) {
        mapper.updatePositionIdBydeliveryId(deliveryId);
    }

    @Override
    public void updatePositionIdBydeliveryIdList(List<Integer> deliveryIdList) {
        mapper.updatePositionIdBydeliveryIdList(deliveryIdList);
    }

    @Override
    public List<Delivery> getDeliveryBypositionIdList(List<Integer> positionIdList) {
        return mapper.getDeliveryBypositionIdList(positionIdList);
    }

    @Override
    public void deleteBydeliveryId(Integer deliveryId) {
        mapper.deleteBydeliveryId(deliveryId);
    }

    @Override
    public Delivery getByPersonIdWithPositionId(Integer personId, Integer positionId) {
        return mapper.getByPersonIdWithPositionId(personId,positionId);
    }
}
