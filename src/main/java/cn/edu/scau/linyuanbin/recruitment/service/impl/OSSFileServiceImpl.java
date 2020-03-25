package cn.edu.scau.linyuanbin.recruitment.service.impl;

import cn.edu.scau.linyuanbin.recruitment.config.OSSConfig;
import cn.edu.scau.linyuanbin.recruitment.domain.OSSFile;
import cn.edu.scau.linyuanbin.recruitment.service.service.OSSFileService;
import cn.edu.scau.linyuanbin.recruitment.utils.MyUtil;
import cn.edu.scau.linyuanbin.recruitment.utils.OSSUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

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

    public OSSFile upload(MultipartFile file, OutputStream outputStream){
        String fileName = file.getOriginalFilename();
        String date = MyUtil.getFormatDate();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        String suffix = file.getOriginalFilename().substring(fileName.lastIndexOf(".") + 1);
        String path = ossConfig.getFolder() + "/" + (date + "/" + uuid) + "-" + fileName;

        return ossUtil.upload(file,path,suffix,outputStream);
    }

    @Override
    public OSSFile getOSSFileByossId(Integer ossId) {
        return null;
    }

    @Override
    public int insertOSSFile(OSSFile ossFile) {
        return 0;
    }

    @Override
    public void deleteByossId(Integer ossId) {

    }
}
