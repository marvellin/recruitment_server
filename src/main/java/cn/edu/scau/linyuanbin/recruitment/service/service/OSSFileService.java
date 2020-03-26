package cn.edu.scau.linyuanbin.recruitment.service.service;

import cn.edu.scau.linyuanbin.recruitment.domain.OSSFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:22 2020/3/25
 */
public interface OSSFileService {
    /*
    * 测试文件下载方法
    * */
    public void down(String path, OutputStream outputStream) throws IOException;

    /*
    * 测试文件上传方法
    * */
    public OSSFile upload(MultipartFile file, OutputStream outputStream);

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
