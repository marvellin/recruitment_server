package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.PersonImg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: linyuanbin
 * @Description:
 * 个人照片对象mapper
 * 1.根据personImgId查找对象
 * 2.根据personDetailId查找对象
 * 3.新增对象
 * 4.更新对象
 * @Date: Created in 23:29 2020/3/22
 */
@Mapper
public interface PersonImgMapper {
    /*
    *根据personImgId查找对象
    * */
    public PersonImg getPersonImgBypersonImgId(@Param("personImgId")Integer personImgId);

    /*
     *根据personDetailId查找对象
     * */
    public PersonImg getPersonImgBypersonDetailId(@Param("personDetailId")Integer personDetailId);

    /*
     *新增对象
     * */
    public int insertPersonImg(@Param("personImg")PersonImg personImg);

    /*
     *更新对象
     * */
    public void updatePersonImg(@Param("personImg")PersonImg personImg);
}
