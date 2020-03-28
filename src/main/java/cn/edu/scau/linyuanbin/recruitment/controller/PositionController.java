package cn.edu.scau.linyuanbin.recruitment.controller;

import cn.edu.scau.linyuanbin.recruitment.domain.Position;
import cn.edu.scau.linyuanbin.recruitment.domain.ResponseObject;
import cn.edu.scau.linyuanbin.recruitment.service.service.CompanyService;
import cn.edu.scau.linyuanbin.recruitment.service.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * done
 * @Date: Created in 19:29 2020/3/25
 */
@RestController
@RequestMapping("/position")
public class PositionController {
    @Autowired
    PositionService service;

    @Autowired
    CompanyService companyService;

    /*
    * 发布职位,先检查对应公司是否存在，需要在后台service层获取发布时间
    * @RequestParam Position position
    * @Param companyId
    * */
    @RequestMapping("/insert")
    @ResponseBody
    public ResponseObject insert(@RequestBody Position position, @RequestParam("companyId")Integer companyId){
        if(companyService.getCompanyByCompanyId(companyId) == null){
            return  new ResponseObject(ResponseObject.ERROR,"获取失败！",null);
        }
        position.setCompanyId(companyId);
        service.insertPosition(position);
        return new ResponseObject(ResponseObject.OK,"新增成功！",position);
    }

    /*
    * 修改职位
    * @Param Position position
    * */
    @RequestMapping("/update")
    @ResponseBody
    public ResponseObject update(@RequestBody Position position){
        service.updatePosition(position);
        return new ResponseObject(ResponseObject.OK,"更新成功！",position);
    }

    /*
    * 删除一个职位
    * @Param Position position
    * */
    @RequestMapping("/delete")
    @ResponseBody
    public ResponseObject delete(@RequestBody Position position){
        service.deleteBypositionId(position.getPositionId());
        return new ResponseObject(ResponseObject.OK,"删除成功！",position);
    }

    /*
    * 获取一个职位
    * @Param Integer positionId
    * */
    @RequestMapping("/get")
    @ResponseBody
    public ResponseObject get(@RequestBody Position position){
        service.deleteBypositionId(position.getPositionId());
        return new ResponseObject(ResponseObject.OK,"删除成功！",position);
    }

    /*
    * 搜索职位（即模糊查询职位）
    * @Param String positionName
    * */
    @RequestMapping("/search")
    @ResponseBody
    public ResponseObject search(@RequestParam("positionName")String positionName){
        List<Position> positionList = service.getPositionListByFuzzyQuery(positionName);
        if(positionList == null || positionList.size() == 0){
            return new ResponseObject(ResponseObject.ERROR,"查询失败！",null);
        }
        return new ResponseObject(ResponseObject.OK,"查询成功！",positionList);
    }

    /*
    * 根据companyId获得多个对象
    * @Param Integer companyId
    * */
    @RequestMapping("/getByCompanyId")
    @ResponseBody
    public ResponseObject getByCompanyId(@RequestParam("companyId")Integer companyId){
        List<Position> positionList = service.getPositionListBycompanyId(companyId);
        if(positionList == null || positionList.size() == 0){
            return new ResponseObject(ResponseObject.ERROR,"查询失败！",null);
        }
        return new ResponseObject(ResponseObject.OK,"查询成功！",positionList);
    }

    /*
    * 根据companyId查找上线职位list
    * @Param Integer companyId
    * */
    @RequestMapping("/getOnlineByCompanyId")
    @ResponseBody
    public ResponseObject getOnlineByCompanyId(@RequestParam("companyId")Integer companyId){
        List<Position> positionList = service.getOnlinePositionListByCompanyId(companyId);
        if(positionList == null || positionList.size() == 0){
            return new ResponseObject(ResponseObject.ERROR,"查询失败！",null);
        }
        return new ResponseObject(ResponseObject.OK,"查询成功！",positionList);
    }

    /*
     * 根据companyId查找下线职位list
     * @Param Integer companyId
     * */
    @RequestMapping("/getOfflineByCompanyId")
    @ResponseBody
    public ResponseObject getOfflineByCompanyId(@RequestParam("companyId")Integer companyId){
        List<Position> positionList = service.getOfflinePositionListByCompanyId(companyId);
        if(positionList == null || positionList.size() == 0){
            return new ResponseObject(ResponseObject.ERROR,"查询失败！",null);
        }
        return new ResponseObject(ResponseObject.OK,"查询成功！",positionList);
    }

    /*
     * 根据positionId上线职位
     * @Param Integer positionId
     * */
    @RequestMapping("/toOnline")
    @ResponseBody
    public ResponseObject toOnline(@RequestParam("positionId")Integer positionId){
        service.updatePositionStatusTo1BypositionId(positionId);
        return new ResponseObject(ResponseObject.OK,"上线成功！",null);
    }

    /*
     *根据positionId下线职位
     * @Param Integer positionId
     * */
    @RequestMapping("/toOffline")
    @ResponseBody
    public ResponseObject toOffline(@RequestParam("positionId")Integer positionId){
        service.updatePositionStatusTo0BypositionId(positionId);
        return new ResponseObject(ResponseObject.OK,"下线成功！",null);
    }
}
