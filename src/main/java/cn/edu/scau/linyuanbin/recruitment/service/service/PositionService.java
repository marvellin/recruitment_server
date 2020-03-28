package cn.edu.scau.linyuanbin.recruitment.service.service;

import cn.edu.scau.linyuanbin.recruitment.domain.Position;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:21 2020/3/25
 */
public interface PositionService {
    /*
     * 根据职位名称模糊查询获得多个对象(必须为上线职位，下线职位不可见)
     * */
    public List<Position> getPositionListByFuzzyQuery(String positionName);

    /*
     * 根据positionId获得单个对象
     * */
    public Position getPositionBypositionId(Integer positionId);

    /*
     *根据companyId获得多个对象
     * */
    public List<Position> getPositionListBycompanyId(Integer companyId);

    /*
     *新增对象
     * */
    public int insertPosition(Position position);

    /*
     *根据positionId删除对象
     * */
    public void deleteBypositionId(Integer positionId);


    /*
     *更新对象
     * */
    public void updatePosition(Position position);

    /*
     * 根据companyId查找上线职位list
     * */
    public List<Position> getOnlinePositionListByCompanyId(Integer companyId);

    /*
     * 根据companyId查找下线职位list
     * */
    public List<Position> getOfflinePositionListByCompanyId(Integer companyId);

    /*
     * 根据positionId上线职位
     * */
    public void updatePositionStatusTo1BypositionId(Integer positionId);

    /*
     *根据positionId下线职位
     * */
    public void updatePositionStatusTo0BypositionId(Integer positionId);
}
