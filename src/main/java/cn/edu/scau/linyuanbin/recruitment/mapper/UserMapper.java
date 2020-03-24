package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: linyuanbin
 * @Description:
 * 系统用户对象
 * 1.新增对象
 * 2.更新对象（主要为更新密码）
 * 3.根据userId查找对象
 * 4.根据email查找对象
 * @Date: Created in 23:25 2020/3/22
 */
@Mapper
public interface UserMapper {
    /*
    * 新增对象
    * */
    public int insertUser(@Param("user") User user);

    /*
     *更新对象（主要为更新密码）
     * */
    public void updateUser(@Param("user") User user);

    /*
     *根据userId查找对象
     * */
    public User getUserByuserId(@Param("userId")Integer userId);

    /*
     *根据email查找对象
     * */
    public User getUserByemail(@Param("email")String email);
}
