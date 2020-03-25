package cn.edu.scau.linyuanbin.recruitment.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 1:33 2020/3/26
 */
@Component
@Configuration
public class OSSConfig {
    @Value("${aliyun.file.endpoint}")
    private String endpoint;
    @Value("${aliyun.file.accessKeyId}")
    private String accessKeyId;
    @Value("${aliyun.file.accessKeySecret}")
    private String accessKeySecret;
    @Value("${aliyun.file.folder}")
    private String folder;
    @Value("${aliyun.file.bucketName}")
    private String bucketName;
    @Value("${aliyun.file.webUrl}")
    private String webUrl;

    public OSSConfig() {
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public String getAccessKeySecret() {
        return accessKeySecret;
    }

    public void setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    @Override
    public String toString() {
        return "OSSConfig{" +
                "endpoint='" + endpoint + '\'' +
                ", accessKeyId='" + accessKeyId + '\'' +
                ", accessKeySecret='" + accessKeySecret + '\'' +
                ", folder='" + folder + '\'' +
                ", bucketName='" + bucketName + '\'' +
                ", webUrl='" + webUrl + '\'' +
                '}';
    }
}
