package cn.edu.scau.linyuanbin.recruitment.controller;

import cn.edu.scau.linyuanbin.recruitment.domain.FeedBack;
import cn.edu.scau.linyuanbin.recruitment.domain.FeedBackDetail;
import cn.edu.scau.linyuanbin.recruitment.domain.ResponseObject;
import cn.edu.scau.linyuanbin.recruitment.service.service.FeedBackDetailService;
import cn.edu.scau.linyuanbin.recruitment.service.service.FeedBackService;
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
@RequestMapping("/feedBackDetail")
public class FeedBackDetailController {
    @Autowired
    FeedBackDetailService service;

    @Autowired
    FeedBackService feedBackService;

    /*
     *根据feedBackDetailId获得对象
     * @Param Integer feedBackDetailId
     * */
    @RequestMapping("/get")
    @ResponseBody
    public ResponseObject get(@RequestParam("feedBackDetailId")Integer feedBackDetailId){
        FeedBackDetail feedBackDetail = service.getFeedBackDetailByfeedBackDetailId(feedBackDetailId);
        if (feedBackDetail == null){
            return new ResponseObject(ResponseObject.ERROR,"获取失败",null);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",feedBackDetail);
    }

    /*
     *根据feedBackId获得对象,
     * @Param Integer feedBackId
     * */
    @RequestMapping("/getByFeedBackId")
    @ResponseBody
    public ResponseObject getByFeedBackId(@RequestParam("feedBackId")Integer feedBackId){
        if(feedBackService.getFeedBackByfeedBackId(feedBackId) == null){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }

        /*1*/
        /*FeedBackDetail feedBackDetail = service.getFeedBackDetailByfeedBackId(feedBackId);
        if(feedBackDetail == null){
            feedBackDetail = new FeedBackDetail();
            feedBackDetail.setFeedBackId(feedBackId);
            service.insertFeedBackDetail(feedBackDetail);
        }

        return new ResponseObject(ResponseObject.OK,"获取成功！",feedBackDetail);*/

        /*2*/
        FeedBackDetail feedBackDetail = service.getFeedBackDetailByfeedBackId(feedBackId);
        if (feedBackDetail == null){
            return new ResponseObject(ResponseObject.ERROR,"获取失败",null);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",feedBackDetail);
    }

    /*
     *新增对象
     * @Param FeedBackDetail feedBackDetail
     * @Param Integer feedBackId
     * */
    @RequestMapping("/insert")
    @ResponseBody
    public ResponseObject insert(@RequestBody FeedBackDetail feedBackDetail,@RequestParam("feedBackId")Integer feedBackId){
        if (feedBackService.getFeedBackByfeedBackId(feedBackId) == null || service.getFeedBackDetailByfeedBackId(feedBackId)!=null){
            return new ResponseObject(ResponseObject.ERROR,"新增失败！",null);
        }

        feedBackDetail.setFeedBackId(feedBackId);
        service.insertFeedBackDetail(feedBackDetail);
        return new ResponseObject(ResponseObject.OK,"新增成功！",feedBackDetail);
    }

    /*
     * 新增多个对象
     * @Param FeedBackDetail feedBackDetail
     * @Param List<Integer> feedBackIdList
     * */
    @RequestMapping("/insertList")
    @ResponseBody
    public ResponseObject insertList(@RequestBody FeedBackDetail feedBackDetail,@RequestParam("feedBackIdList")List<Integer> feedBackIdList){
        List<FeedBackDetail> feedBackDetailList = new ArrayList<>();
        String address = feedBackDetail.getAddress();
        String time = feedBackDetail.getTime();
        String tel = feedBackDetail.getTel();
        for (Integer feedBackId:feedBackIdList){
            FeedBackDetail tmp = new FeedBackDetail();
            tmp.setAddress(address);
            tmp.setTime(time);
            tmp.setTel(tel);
            tmp.setFeedBackId(feedBackId);
            if(feedBackService.getFeedBackByfeedBackId(feedBackId)!=null){
                feedBackDetailList.add(tmp);
            }
        }
        service.insertFeedBackDetailList(feedBackDetailList);
        return new ResponseObject(ResponseObject.OK,"新增成功！",null);
    }
}
