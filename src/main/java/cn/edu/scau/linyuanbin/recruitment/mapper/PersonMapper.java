package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: linyuanbin
 * @Description:
 * 个人用户对象mapper
 * 1.根据personId查找对象
 * 2.根据userId查找对象
 * 3.新增对象
 * @Date: Created in 23:26 2020/3/22
 */
@Mapper
public interface PersonMapper {
    /*
    *根据personId查找对象
    * */
    public Person getPersonBypersonId(@Param("personId")Integer personId);

    /*
     *根据userId查找对象
     * */
    public Person getPersonByuserId(@Param("userId")Integer userId);

    /*
     *新增对象
     * */
    public int insertPerson(@Param("person")Person person);
}
