package cn.edu.scau.linyuanbin.recruitment.controller.personController;

import cn.edu.scau.linyuanbin.recruitment.domain.ExpectJob;
import cn.edu.scau.linyuanbin.recruitment.domain.ResponseObject;
import cn.edu.scau.linyuanbin.recruitment.service.service.ExpectJobService;
import cn.edu.scau.linyuanbin.recruitment.service.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: linyuanbin
 * @Description:
 * test done
 * @Date: Created in 19:29 2020/3/25
 */
@RestController
@RequestMapping("/expectJob")
public class ExpectJobController {
    @Autowired
    ExpectJobService service;

    @Autowired
    ResumeService resumeService;

    /*
     *根据expectJobId获得对象
     * @Param Integer expectJobId
     * */
    @RequestMapping("/get")
    @ResponseBody
    public ResponseObject get(@RequestParam("expectJobId")Integer expectJobId){
        ExpectJob expectJob = service.getExpectJobByexpectJobId(expectJobId);
        if (expectJob == null){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",expectJob);
    }

    /*
     *根据resumeId获得对象
     * @Param Integer resumeId
     * */
    @RequestMapping("/getByResumeId")
    @ResponseBody
    public ResponseObject getByResumeId(@RequestParam("resumeId")Integer resumeId){
        ExpectJob expectJob = service.getExpectJobByresumeId(resumeId);
        if (expectJob == null){
            return new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        return new ResponseObject(ResponseObject.OK,"获取成功！",expectJob);
    }

    /*
     *新增对象，注意先判断对应resume是否存在，在判断对应expectJob是否存在，如果存在则不插入
     * @Param ExpectJob expectJob
     * @Param Integer resumeId
     * */
    @RequestMapping("/insert")
    @ResponseBody
    public ResponseObject insert(@RequestBody ExpectJob expectJob, @RequestParam("resumeId")Integer resumeId){
        if (resumeService.getResumeByresumeId(resumeId) == null || service.getExpectJobByresumeId(resumeId) != null){
            return new ResponseObject(ResponseObject.ERROR,"新增失败！",null);
        }

        expectJob.setResumeId(resumeId);
        service.insertExpectJob(expectJob);
        return new ResponseObject(ResponseObject.OK,"新增成功！",expectJob);
    }

    /*
     *更新对象
     * @Param ExpectJob expectJob
     * */
    @RequestMapping("/update")
    @ResponseBody
    public ResponseObject update(@RequestBody ExpectJob expectJob){
        service.updateExpectJob(expectJob);
        return new ResponseObject(ResponseObject.OK,"更新成功！",expectJob);
    }
}
