package cn.edu.scau.linyuanbin.recruitment.controller;

import cn.edu.scau.linyuanbin.recruitment.domain.FeedBack;
import cn.edu.scau.linyuanbin.recruitment.domain.ResponseObject;
import cn.edu.scau.linyuanbin.recruitment.service.service.DeliveryService;
import cn.edu.scau.linyuanbin.recruitment.service.service.FeedBackService;
import cn.edu.scau.linyuanbin.recruitment.utils.MyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:29 2020/3/25
 */
@RestController
@RequestMapping("/feedBack")
public class FeedBackController {
    @Autowired
    FeedBackService service;

    @Autowired
    DeliveryService deliveryService;

    /*
     *根据feedBackId查找
     * @Param Integer feedBackId
     * */
    @RequestMapping("/get")
    @ResponseBody
    public ResponseObject get(@RequestParam("feedBackId")Integer feedBackId){
        FeedBack feedBack = service.getFeedBackByfeedBackId(feedBackId);
        if(feedBack == null){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",feedBack);
    }

    /*
     *根据deliveryId查找，先判断对应delivery是否存在，再判断对应feedBack是否存在，若不存在则返回新建对象
     * @Param Integer deliveryId
     * */
    @RequestMapping("/getByDeliveryId")
    @ResponseBody
    public ResponseObject getByDeliveryId(@RequestParam("deliveryId")Integer deliveryId){
        if (deliveryService.getDeliveryBydeliveryId(deliveryId) == null){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }

        FeedBack feedBack = service.getFeedBackBydeliveryId(deliveryId);
        if (feedBack == null){
            feedBack = new FeedBack();
            feedBack.setDeliveryId(deliveryId);
            service.insertFeedBack(feedBack);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",feedBack);
    }

    /*
     *新增对象，先判断对应delivery是否存在，在判断对应feedBack是否存在，如果存在则不插入，后台获得时间feedBacktime
     *
     * @Param FeedBack feedBack
     * @Param Integer deliveryId
     * */
    @RequestMapping("/insert")
    @ResponseBody
    public ResponseObject insert(@RequestBody FeedBack feedBack, @RequestParam("deliveryId")Integer deliveryId){
        if (deliveryService.getDeliveryBydeliveryId(deliveryId) == null || service.getFeedBackBydeliveryId(deliveryId) != null){
            return new ResponseObject(ResponseObject.ERROR,"新增失败！",null);
        }
        feedBack.setDeliveryId(deliveryId);
        feedBack.setFeedBackTime(MyUtil.getFormatTime());
        service.insertFeedBack(feedBack);
        return new ResponseObject(ResponseObject.OK,"新增成功！",feedBack);
    }

    /*
     *更新对象,后台service层获得时间feedBacktime
     * @Param FeedBack feedBack
     * */
    @RequestMapping("/update")
    @ResponseBody
    public ResponseObject update(@RequestBody FeedBack feedBack){
        feedBack.setFeedBackTime(MyUtil.getFormatTime());
        service.updateFeedBack(feedBack);
        return new ResponseObject(ResponseObject.OK,"更新成功！",feedBack);
    }

    /*
     *根据feedBackIdList更新多个对象(或为‘邀请面试’或为‘不合适’),测试是否可以！！！后台获得时间feedBacktime
     * @Param List<Integer> feedBackIdList
     * @Param String feedBack
     * */
    @RequestMapping("/updateList")
    @ResponseBody
    public ResponseObject updateList(@RequestBody List<Integer> feedBackIdList, @RequestParam("feedBack")String feedBack){
        service.updateFeedBackList(feedBackIdList, feedBack, MyUtil.getFormatTime());
        return new ResponseObject(ResponseObject.OK,"更新成功！",null);
    }

    /*
     *新增多个对象，注意判断对应delivery是否存在,后台获得时间feedBacktime
     * @Param FeedBack feedBack
     * @Param List<Integer> deliveryIdList
     * */
    @RequestMapping("/insertList")
    @ResponseBody
    public ResponseObject insertList(@RequestBody FeedBack feedBack, @RequestParam("deliveryIdList")List<Integer> deliveryIdList){
        List<FeedBack> feedBackList = new ArrayList<>();
        String feedBackTime = MyUtil.getFormatTime();
        for (Integer deliveryId:deliveryIdList){
            FeedBack tmp = new FeedBack();
            feedBack.setFeedBackTime(feedBackTime);
            feedBack.setDeliveryId(deliveryId);
            if (deliveryService.getDeliveryBydeliveryId(deliveryId) != null){
                feedBackList.add(tmp);
            }
        }
        service.insertFeedBackList(feedBackList);
        return new ResponseObject(ResponseObject.OK,"新增成功！",null);
    }
}
