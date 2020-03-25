package cn.edu.scau.linyuanbin.recruitment.service.service;

import cn.edu.scau.linyuanbin.recruitment.domain.OSSFile;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:22 2020/3/25
 */
public interface OSSFileService {
    /*
     * 根据ossId获得对象
     * */
    public OSSFile getOSSFileByossId(Integer ossId);

    /*
     *新增对象
     * */
    public int insertOSSFile(OSSFile ossFile);

    /*
     *根据ossId删除对象
     * */
    public void deleteByossId(Integer ossId);
}
