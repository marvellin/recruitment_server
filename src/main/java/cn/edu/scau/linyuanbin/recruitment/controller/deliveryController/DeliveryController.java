package cn.edu.scau.linyuanbin.recruitment.controller.deliveryController;

import cn.edu.scau.linyuanbin.recruitment.domain.Delivery;
import cn.edu.scau.linyuanbin.recruitment.domain.ResponseObject;
import cn.edu.scau.linyuanbin.recruitment.service.service.DeliveryService;
import cn.edu.scau.linyuanbin.recruitment.service.service.PersonService;
import cn.edu.scau.linyuanbin.recruitment.service.service.PositionService;
import cn.edu.scau.linyuanbin.recruitment.utils.MyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * test done（差updateListByCompany和getListByPositionIdList）
 * @Date: Created in 19:29 2020/3/25
 */
@RestController
@RequestMapping("/delivery")
public class DeliveryController {
    @Autowired
    DeliveryService service;

    @Autowired
    PersonService personService;

    @Autowired
    PositionService positionService;

    /*
     *根据deliveryId获得单个对象
     * @Param Integer deliveryId
     * */
    @RequestMapping("/get")
    @ResponseBody
    public ResponseObject get(@RequestParam("deliveryId")Integer deliveryId){
        Delivery delivery = service.getDeliveryBydeliveryId(deliveryId);
        if (delivery == null){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",delivery);
    }

    /*
     *根据positionId获得多个对象List
     * @Param Integer positionId
     * */
    @RequestMapping("/getListByPositionId")
    @ResponseBody
    public ResponseObject getLsitByPositionId(@RequestParam("positionId")Integer positionId){
        List<Delivery> deliveryList = service.getDeliveryListBypositionId(positionId) ;
        if (deliveryList == null || deliveryList.size() == 0){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",deliveryList);
    }

    /*
     *根据personId获得多个对象List
     * @Param Integer personId
     * */
    @RequestMapping("/getListByPersonId")
    @ResponseBody
    public ResponseObject getLsitByPersonId(@RequestParam("personId")Integer personId){
        List<Delivery> deliveryList = service.getDeliveryListBypersonId(personId);
        if (deliveryList == null || deliveryList.size() == 0){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",deliveryList);
    }

    /*
     *新增对象，注意后台获取deliverytime投递时间，注意先判断duiyingposition和person是否存在，且对应delivery是否存在
     * @Param Delivery delivery
     * @Param Integer positionId
     * @Param Integer personId
     * */
    @RequestMapping("/insert")
    @ResponseBody
    public ResponseObject insert(@RequestBody Delivery delivery,@RequestParam("positionId")Integer positionId,@RequestParam("personId")Integer personId){
        if (personService.getPersonBypersonId(personId) == null || positionService.getPositionBypositionId(positionId) == null || service.getByPersonIdWithPositionId(personId,positionId)!=null){
            return new ResponseObject(ResponseObject.ERROR,"新增失败！",null);
        }
        delivery.setPersonId(personId);
        delivery.setPositionId(positionId);
        delivery.setDeliverytime(MyUtil.getFormatTime());
        service.insertDelivery(delivery);
        return new ResponseObject(ResponseObject.OK,"新增成功！",service.getDeliveryBydeliveryId(delivery.getDeliveryId()));
    }

    /*
     *更新对象，主要为更新投递status即投递进程,1为默认已投递，2为已查看，3为已回复
     * @Param Delivery delivery
     * */
    @RequestMapping("/update")
    @ResponseBody
    public ResponseObject update(@RequestBody Delivery delivery){
//        System.out.println(delivery.getStatus());
        if (service.getDeliveryBydeliveryId(delivery.getDeliveryId())!=null && delivery.getStatus() < 3){
            delivery.setStatus(delivery.getStatus() + 1);
        }
        service.updateDelivary(delivery);
        return new ResponseObject(ResponseObject.OK,"更新成功！",delivery);
    }

    /*
     *个人用户根据deliveryId更新对象（实则是设置personId为null，对自身不可见）
     * @Param Integer deliveryId
     * */
    @RequestMapping("/updateByPerson")
    @ResponseBody
    public ResponseObject updateByPerson(@RequestParam("deliveryId")Integer deliveryId){
        service.updatePersonIdBydeliveryId(deliveryId);
        return new ResponseObject(ResponseObject.OK,"更新成功！",null);
    }

    /*
     *公司用户根据deliveryId更新对象（实则是设置positionId为null，对自身不可见）
     * @Param Integer deliveryId
     * */
    @RequestMapping("/updateByCompany")
    @ResponseBody
    public ResponseObject updateByCompany(@RequestParam("deliveryId")Integer deliveryId){
        service.updatePositionIdBydeliveryId(deliveryId);
        return new ResponseObject(ResponseObject.OK,"更新成功！",null);
    }

    /*
     *公司用户根据deliveryIdList更新对象（实则是设置positionId为null，对自身不可见）
     * @Param List<Integer> deliveryIdList
     * */
    @RequestMapping("/updateListByCompany")
    @ResponseBody
    public ResponseObject updateListByCompany(@RequestParam("deliveryIdList") List<Integer> deliveryIdList){
        service.updatePositionIdBydeliveryIdList(deliveryIdList);
        return new ResponseObject(ResponseObject.OK,"更新成功！",null);
    }

    /*
     *根据positionIdList查找多个对象List，可能需要修改这个接口
     * @Param List<Integer> positionIdList
     * */
    @RequestMapping("/getListByPositionIdList")
    @ResponseBody
    public ResponseObject getListByPositionIdList(@RequestParam("positionIdList") List<Integer> positionIdList){
        List<Delivery> deliveryList = service.getDeliveryBypositionIdList(positionIdList);
        if (deliveryList == null || deliveryList.size() == 0){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",deliveryList);
    }

    /*
     *根据deliveryId删除对象
     * @Param Integer deliveryId
     * */
    @RequestMapping("/delete")
    @ResponseBody
    public ResponseObject delete(@RequestParam("deliveryId")Integer deliveryId){
        service.deleteBydeliveryId(deliveryId);
        return new ResponseObject(ResponseObject.OK,"删除成功！",null);
    }
}
