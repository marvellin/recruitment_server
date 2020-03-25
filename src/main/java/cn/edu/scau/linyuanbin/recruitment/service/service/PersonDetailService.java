package cn.edu.scau.linyuanbin.recruitment.service.service;

import cn.edu.scau.linyuanbin.recruitment.domain.PersonDetail;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:17 2020/3/25
 */
public interface PersonDetailService {
    /*
     *根据personDetailId查找对象
     * */
    public PersonDetail getPersonDetailBypersonDetailId(Integer personDetailId);

    /*
     *根据personId查找对象
     * */
    public PersonDetail getPersonDetailBypersonId(Integer personId);

    /*
     *根据resumeId查找对象
     * */
    public PersonDetail getPersonDetailByresumeId(Integer resumeId);

    /*
     *新增对象
     * */
    public int insertPersonDetail(PersonDetail personDetail);

    /*
     *更新对象
     * */
    public void updatePersonDetail(PersonDetail personDetail);
}
