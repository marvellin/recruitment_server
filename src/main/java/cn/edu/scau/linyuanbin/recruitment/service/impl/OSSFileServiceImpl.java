package cn.edu.scau.linyuanbin.recruitment.service.impl;

import cn.edu.scau.linyuanbin.recruitment.config.OSSConfig;
import cn.edu.scau.linyuanbin.recruitment.domain.OSSFile;
import cn.edu.scau.linyuanbin.recruitment.mapper.OSSFileMapper;
import cn.edu.scau.linyuanbin.recruitment.service.service.OSSFileService;
import cn.edu.scau.linyuanbin.recruitment.utils.MyUtil;
import cn.edu.scau.linyuanbin.recruitment.utils.OSSUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.OutputStream;
import java.util.UUID;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:23 2020/3/25
 */
@Service("ossFileService")
public class OSSFileServiceImpl implements OSSFileService {
    @Autowired
    private OSSUtil ossUtil;

    @Autowired
    private OSSConfig ossConfig;

    @Autowired
    private OSSFileMapper ossFileMapper;

    @Override
    public void down(String path, OutputStream outputStream) throws IOException {
        System.out.println("enter ossservice "+path);
        if (path==null||path.equals("")){
            return;
        }
        System.out.println("begin download");
        ossUtil.download(path,outputStream);
    }

    public OSSFile upload(MultipartFile file,Integer userId,String desc, OutputStream outputStream){
        //生成文件内容
        String fileName = file.getOriginalFilename();
        String suffix = file.getOriginalFilename().substring(fileName.lastIndexOf(".") + 1);
        String path = ossUtil.getFilePath(userId,desc,fileName);

        OSSFile ossFile = ossUtil.upload(file,path,suffix,outputStream);
        ossFileMapper.insertOSSFile(ossFile);
        return ossFile;
    }

    @Override
    public OSSFile getOSSFileByossId(Integer ossId) {
        return ossFileMapper.getOSSFileByossId(ossId);
    }

    @Override
    public int insertOSSFile(OSSFile ossFile) {
        return ossFileMapper.insertOSSFile(ossFile);
    }

    @Override
    public void deleteByossId(Integer ossId) {
        //应先删除oss服务上的文件资源再删除数据记录
        ossFileMapper.deleteByossId(ossId);
    }
}
