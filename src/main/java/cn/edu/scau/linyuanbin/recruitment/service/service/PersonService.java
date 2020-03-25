package cn.edu.scau.linyuanbin.recruitment.service.service;

import cn.edu.scau.linyuanbin.recruitment.domain.Person;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:16 2020/3/25
 */
public interface PersonService {
    /*
     *根据personId查找对象
     * */
    public Person getPersonBypersonId(Integer personId);

    /*
     *根据userId查找对象
     * */
    public Person getPersonByuserId(Integer userId);

    /*
     *新增对象
     * */
    public int insertPerson(Person person);
}
