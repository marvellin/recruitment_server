package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.Position;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * 职位对象mapper
 * 1.根据positionId获得单个对象
 * 2.根据companyId获得多个对象
 * 3.新增对象
 * 4.根据positionId删除对象
 * 5.更新对象
 * 6.根据companyId查找上线职位list
 * 7.根据companyId查找下线职位list
 * 8.根据职位名称模糊查询获得多个对象
 * @Date: Created in 23:35 2020/3/22
 */
@Mapper
public interface PositionMapper {
    /*
    * 降序查找前n个职位
    * */
    public List<Position> getPostionByDescending(@Param("limitNum")Integer limitNum);

    /*
    * 根据职位名称模糊查询获得多个对象(必须为上线职位，下线职位不可见)
    * */
    public List<Position> getPositionListByFuzzyQuery(@Param("positionName")String positionName);

    /*
    * 根据positionId获得单个对象
    * */
    public Position getPositionBypositionId(@Param("positionId")Integer positionId);

    /*
     *根据companyId获得多个对象
     * */
    public List<Position> getPositionListBycompanyId(@Param("companyId")Integer companyId);

    /*
     *新增对象
     * */
    public int insertPosition(@Param("position")Position position);

    /*
     *根据positionId删除对象
     * */
    public void deleteBypositionId(@Param("positionId")Integer positionId);


    /*
     *更新对象
     * */
    public void updatePosition(@Param("position")Position position);

    /*
    * 根据companyId查找上线职位list
    * */
    public List<Position> getOnlinePositionListByCompanyId(@Param("companyId")Integer companyId);

    /*
    * 根据companyId查找下线职位list
    * */
    public List<Position> getOfflinePositionListByCompanyId(@Param("companyId")Integer companyId);

    /*
    * 根据positionId上线职位
    * */
    public void updatePositionStatusTo1BypositionId(@Param("positionId")Integer positionId);

    /*
    *根据positionId下线职位
    * */
    public void updatePositionStatusTo0BypositionId(@Param("positionId")Integer positionId);
}
