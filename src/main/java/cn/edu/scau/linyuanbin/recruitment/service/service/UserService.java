package cn.edu.scau.linyuanbin.recruitment.service.service;

import cn.edu.scau.linyuanbin.recruitment.domain.User;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:16 2020/3/25
 */
public interface UserService {
    /*
     * 新增对象
     * */
    public int insertUser(User user);

    /*
     *更新对象（主要为更新密码）
     * */
    public void updateUser(User user);

    /*
     *根据userId查找对象
     * */
    public User getUserByuserId(Integer userId);

    /*
     *根据email查找对象
     * */
    public User getUserByemail(String email);
}
