package cn.edu.scau.linyuanbin.recruitment.service.service;

import cn.edu.scau.linyuanbin.recruitment.domain.PersonImg;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:18 2020/3/25
 */
public interface PersonImgService {
    /*
     *根据personImgId查找对象
     * */
    public PersonImg getPersonImgBypersonImgId(Integer personImgId);

    /*
     *根据personDetailId查找对象
     * */
    public PersonImg getPersonImgBypersonDetailId(Integer personDetailId);

    /*
     *新增对象
     * */
    public int insertPersonImg(PersonImg personImg);

    /*
     *更新对象
     * */
    public void updatePersonImg(PersonImg personImg);
}
