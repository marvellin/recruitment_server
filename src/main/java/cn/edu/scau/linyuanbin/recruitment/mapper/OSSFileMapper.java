package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.OSSFile;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: linyuanbin
 * @Description:
 * OSS文件对象mapper
 * 1.根据ossId获得对象
 * 2.新增对象
 * 3.根据ossId删除对象
 * @Date: Created in 23:37 2020/3/22
 */
@Mapper
public interface OSSFileMapper {
    /*
    * 根据ossId获得对象
    * */
    public OSSFile getOSSFileByossId(@Param("ossId")Integer ossId);

    /*
     *新增对象
     * */
    public int insertOSSFile(@Param("ossFile")OSSFile ossFile);

    /*
     *根据ossId删除对象
     * */
    public void deleteByossId(@Param("ossId")Integer ossId);
}
