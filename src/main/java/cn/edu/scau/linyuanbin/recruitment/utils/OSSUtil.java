package cn.edu.scau.linyuanbin.recruitment.utils;

import cn.edu.scau.linyuanbin.recruitment.config.OSSConfig;
import cn.edu.scau.linyuanbin.recruitment.domain.OSSFile;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.OSSObject;
import com.aliyun.oss.model.PutObjectResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 0:56 2020/3/26
 */
@Component
public class OSSUtil {
    @Autowired
    OSSConfig ossConfig;

    /*
    * 上传文件，上传成功返回文件流给response.outputstream,
    * @Return OSSFile ossFile(ossFile对象)
    * @param MultipartFile file(文件)
    * @Param String path(文件上传路径)
    * @Param String suffix(文件后缀名)
    * @Param OutputStream outputStream(文件输出流)
    * */
    public OSSFile upload(MultipartFile file, String path, String suffix, OutputStream outputStream){
        if (file == null){
            return null;
        }
        String endpoint=ossConfig.getEndpoint();
        String accessKeyId=ossConfig.getAccessKeyId();
        String accessKeySecret=ossConfig.getAccessKeySecret();
        String bucketName=ossConfig.getBucketName();
        String fileHost=ossConfig.getFolder();

        OSS client = new OSSClientBuilder().build(endpoint,accessKeyId,accessKeySecret);
        try{
            PutObjectResult result = client.putObject(bucketName, path, new ByteArrayInputStream(file.getBytes()));
            if(result != null){
                //上传成功
                InputStream inputStream = file.getInputStream();
                BufferedOutputStream os = new BufferedOutputStream(outputStream);
                byte[] buffer = new byte[1024];
                int length = 0;
                while ((length = inputStream.read(buffer)) != -1){
                    outputStream.write(buffer,0,length);
                }
                if (outputStream != null){
                    outputStream.flush();
                    outputStream.close();
                }
                if (inputStream != null){
                    inputStream.close();
                }
                return new OSSFile(0, file.getSize(),path,suffix,ossConfig.getBucketName(),file.getOriginalFilename());
            }
        } catch (IOException e) {
            //上传失败
            e.printStackTrace();
            return null;
        }
        return null;
    }


    /*
    * 下载文件，并输出到response.outputstream
    * @Param String path(文件下载路径)
    * @Param OutputStream outputStream(文件输出流)
    * */
    public void download(String path, OutputStream outputStream) throws IOException {
        if(path == null || path .equals("")){
            return;
        }
        String endpoint=ossConfig.getEndpoint();
        String accessKeyId=ossConfig.getAccessKeyId();
        String accessKeySecret=ossConfig.getAccessKeySecret();
        String bucketName=ossConfig.getBucketName();
        String fileHost=ossConfig.getFolder();

        OSS client = new OSSClientBuilder().build(endpoint,accessKeyId,accessKeySecret);

        //下载文件得到oss对象
        OSSObject ossObject = client.getObject(bucketName,path);

        BufferedInputStream inputStream = new BufferedInputStream(ossObject.getObjectContent());
        BufferedOutputStream os = new BufferedOutputStream(outputStream);
        byte[] buffer = new byte[1024];
        int length = 0;
        while ((length = inputStream.read(buffer)) != -1){
            outputStream.write(buffer,0,length);
        }
        if (outputStream != null){
            outputStream.flush();
            outputStream.close();
        }
        if (inputStream != null){
            inputStream.close();
        }
    }
}
