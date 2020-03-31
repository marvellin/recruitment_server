package cn.edu.scau.linyuanbin.recruitment.controller.deliveryController;

import cn.edu.scau.linyuanbin.recruitment.domain.*;
import cn.edu.scau.linyuanbin.recruitment.service.service.*;
import cn.edu.scau.linyuanbin.recruitment.utils.MyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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

    @Autowired
    FeedBackService feedBackService;

    @Autowired
    FeedBackDetailService feedBackDetailService;

    /*
    * 通知面试
    * @Param List<Delivery> deliveryList
    * @Param FeedBackDetail feedBackDetail
    * */
    @RequestMapping("/toInterview")
    @ResponseBody
    public ResponseObject toInterview(@RequestParam("deliveryIdList") List<Integer> deliveryIdList, @RequestBody FeedBackDetail feedBackDetail ){
        for (Integer deliveryId:deliveryIdList){
            Delivery delivery = service.getDeliveryBydeliveryId(deliveryId);
            if(delivery != null && delivery.getFeedBack() != null && feedBackDetailService.getFeedBackDetailByfeedBackId(delivery.getFeedBack().getFeedBackId())== null){
                //保存面试信息
                feedBackDetail.setFeedBackId(delivery.getFeedBack().getFeedBackId());
                feedBackDetailService.insertFeedBackDetail(feedBackDetail);

                //修改投递反馈信息
                delivery.getFeedBack().setFeedback("邀请面试");
                delivery.getFeedBack().setFeedbacktime(MyUtil.getFormatTime());
                feedBackService.updateFeedBack(delivery.getFeedBack());

                //修改投递状态
                delivery.setStatus(3);
                service.updateDelivary(delivery);
            }
        }
        return new ResponseObject(ResponseObject.OK,"通知面试成功！",null);
    }

    /*
    * 通知不合适
    * @Param List<Delivery> deliveryList
    * @RequestParam("deliveryIdList") List<Integer> deliveryIdList
    * */
    @RequestMapping("/toUnsuitable")
    @ResponseBody
    public ResponseObject toUnsuitable(@RequestParam("deliveryIdList") List<Integer> deliveryIdList ){
        for (Integer deliveryId:deliveryIdList){
            Delivery delivery = service.getDeliveryBydeliveryId(deliveryId);
            if(delivery != null && delivery.getFeedBack() != null){
                //修改投递反馈信息
                delivery.getFeedBack().setFeedback("不合适");
                delivery.getFeedBack().setFeedbacktime(MyUtil.getFormatTime());
                feedBackService.updateFeedBack(delivery.getFeedBack());

                //修改投递状态
                delivery.setStatus(3);
                service.updateDelivary(delivery);
            }
        }
        return new ResponseObject(ResponseObject.OK,"通知不合适成功！",null);
    }

    /*
    * 待定
    * @Param List<Delivery> deliveryList
    * @RequestParam("deliveryIdList") List<Integer> deliveryIdList
    * */
    @RequestMapping("/toUnDetermin")
    @ResponseBody
    public ResponseObject toUnDetermin(@RequestParam("deliveryIdList") List<Integer> deliveryIdList ){
        for (Integer deliveryId:deliveryIdList){
            Delivery delivery = service.getDeliveryBydeliveryId(deliveryId);
            if(delivery != null && delivery.getFeedBack() != null){
                //修改投递状态
                delivery.setStatus(2);
                service.updateDelivary(delivery);
            }
        }
        return new ResponseObject(ResponseObject.OK,"待定成功！",null);
    }

    /*
    * 通过personId查找不合适简历
    * */
    @RequestMapping("/getUnsuitableDeliveryListBypersonId")
    @ResponseBody
    public ResponseObject getUnsuitableDeliveryListBypersonId(@RequestParam("personId")Integer personId){
        System.out.println(personId);
        List<Delivery> deliveryList = service.getDeliveryListStatus3BypersonId(personId);
        if (deliveryList == null || deliveryList.size() <= 0){
            return new ResponseObject(ResponseObject.ERROR,"获取失败",deliveryList);
        }
        List<Delivery> results = new ArrayList<>();
        for (Delivery delivery:deliveryList){
            if (delivery.getFeedBack()!=null&&delivery.getFeedBack().getFeedback()!=null&&delivery.getFeedBack().getFeedback().equals("不合适")){
                results.add(delivery);
            }
        }
        if (results.size()<=0){
            return new ResponseObject(ResponseObject.ERROR,"获取失败",results);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",results);
    }


    /*
    * 通过personId查找邀请面试简历
    * */
    @RequestMapping("/getInteviewDeliveryListBypersonId")
    @ResponseBody
    public ResponseObject getInteviewDeliveryListBypersonId(@RequestParam("personId")Integer personId){
        List<Delivery> deliveryList = service.getDeliveryListStatus3BypersonId(personId);
        if (deliveryList == null || deliveryList.size() <= 0){
            return new ResponseObject(ResponseObject.ERROR,"获取失败",deliveryList);
        }
        List<Delivery> results = new ArrayList<>();
        for (Delivery delivery:deliveryList){
            if (delivery.getFeedBack()!=null&&delivery.getFeedBack().getFeedback()!=null&&delivery.getFeedBack().getFeedback().equals("邀请面试")){
                results.add(delivery);
            }
        }
        if (results.size()<=0){
            return new ResponseObject(ResponseObject.ERROR,"获取失败",results);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",results);
    }

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
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",deliveryList);
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
     *新增对象，即投递职位，注意后台获取deliverytime投递时间，注意先判断duiyingposition和person是否存在，且对应delivery是否存在
     * @Param Delivery delivery(不需要)
     * @Param Integer positionId
     * @Param Integer personId
     * */
    @RequestMapping("/insert")
    @ResponseBody
    public ResponseObject insert(@RequestParam("positionId")Integer positionId,@RequestParam("personId")Integer personId){
        if (personService.getPersonBypersonId(personId) == null || positionService.getPositionBypositionId(positionId) == null || service.getByPersonIdWithPositionId(personId,positionId)!=null){
            return new ResponseObject(ResponseObject.ERROR,"新增失败！",null);
        }
        Delivery delivery = new Delivery();
        delivery.setPersonId(personId);
        delivery.setPositionId(positionId);
        delivery.setDeliverytime(MyUtil.getFormatTime());
        service.insertDelivery(delivery);

        FeedBack feedBack = new FeedBack();
        feedBack.setDeliveryId(delivery.getDeliveryId());
        feedBackService.insertFeedBack(feedBack);
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
     *根据positionIdList查找多个待处理对象List
     * @Param List<Integer> positionIdList
     * @Param Integer companyId
     * */
    @RequestMapping("/getListByPositionIdListStatus1")
    @ResponseBody
    public ResponseObject getListByPositionIdList(@RequestParam("companyId")Integer companyId){
        List<Position> positionList = positionService.getPositionListBycompanyId(companyId);
        List<Integer> positionIdList = new ArrayList<>();
        for (Position position:positionList){
            positionIdList.add(position.getPositionId());
        }
        List<Delivery> deliveryList = service.getDeliveryBypositionIdList(positionIdList);
        if (deliveryList == null || deliveryList.size() == 0){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        List<Delivery> results = new ArrayList<>();
        for (Delivery delivery:deliveryList){
            if (delivery.getStatus()==1){
                results.add(delivery);
            }
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",results);
    }

    /*
     *根据positionIdList查找多个待定对象List
     * @Param List<Integer> positionIdList
     * @Param Integer companyId
     * */
    @RequestMapping("/getListByPositionIdListStatus2")
    @ResponseBody
    public ResponseObject getListByPositionIdListStatus2(@RequestParam("companyId")Integer companyId){
        List<Position> positionList = positionService.getPositionListBycompanyId(companyId);
        List<Integer> positionIdList = new ArrayList<>();
        for (Position position:positionList){
            positionIdList.add(position.getPositionId());
        }
        List<Delivery> deliveryList = service.getDeliveryBypositionIdList(positionIdList);
        if (deliveryList == null || deliveryList.size() == 0){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        List<Delivery> results = new ArrayList<>();
        for (Delivery delivery:deliveryList){
            if (delivery.getStatus()==2){
                results.add(delivery);
            }
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",results);
    }

    /*
     *根据positionIdList查找多个邀请面试对象List
     * @Param List<Integer> positionIdList
     * @Param Integer companyId
     * */
    @RequestMapping("/getListByPositionIdListStatus3&Inteview")
    @ResponseBody
    public ResponseObject getListByPositionIdListStatus3Inteview(@RequestParam("companyId")Integer companyId){
        List<Position> positionList = positionService.getPositionListBycompanyId(companyId);
        List<Integer> positionIdList = new ArrayList<>();
        for (Position position:positionList){
            positionIdList.add(position.getPositionId());
        }
        List<Delivery> deliveryList = service.getDeliveryBypositionIdList(positionIdList);
        if (deliveryList == null || deliveryList.size() == 0){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        List<Delivery> results = new ArrayList<>();
        for (Delivery delivery:deliveryList){
            if (delivery.getStatus()>=2&&delivery.getFeedBack().getFeedback().equals("邀请面试")){
                results.add(delivery);
            }
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",results);
    }

    /*
     *根据positionIdList查找多个不合适对象List
     * @Param List<Integer> positionIdList
     * @Param Integer companyId
     * */
    @RequestMapping("/getListByPositionIdListStatus3&Unsuit")
    @ResponseBody
    public ResponseObject getListByPositionIdListStatus3Unsuit(@RequestParam("companyId")Integer companyId){
        List<Position> positionList = positionService.getPositionListBycompanyId(companyId);
        List<Integer> positionIdList = new ArrayList<>();
        for (Position position:positionList){
            positionIdList.add(position.getPositionId());
        }
        List<Delivery> deliveryList = service.getDeliveryBypositionIdList(positionIdList);
        if (deliveryList == null || deliveryList.size() == 0){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        List<Delivery> results = new ArrayList<>();
        for (Delivery delivery:deliveryList){
            if (delivery.getStatus()>=2&&delivery.getFeedBack().getFeedback().equals("不合适")){
                results.add(delivery);
            }
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",results);
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
