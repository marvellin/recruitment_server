/*
 * OSS文件对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class OSSFile {
    private int ossId;
    private long fileSize;
    private String fileUrl;
    private String suffix;
    private String bucket;
    private String filename;//文件原名

    public OSSFile(int ossId, long fileSize, String fileUrl, String suffix, String bucket, String filename) {
        this.ossId = ossId;
        this.fileSize = fileSize;
        this.fileUrl = fileUrl;
        this.suffix = suffix;
        this.bucket = bucket;
        this.filename = filename;
    }

    public OSSFile() {}

    public int getOssId() {
        return ossId;
    }

    public void setOssId(int ossId) {
        this.ossId = ossId;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public String toString() {
        return "OSSFile{" +
                "ossId=" + ossId +
                ", fileSize=" + fileSize +
                ", fileUrl='" + fileUrl + '\'' +
                ", suffix='" + suffix + '\'' +
                ", bucket='" + bucket + '\'' +
                ", filename='" + filename + '\'' +
                '}';
    }
}
