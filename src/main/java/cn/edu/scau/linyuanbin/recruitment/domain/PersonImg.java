/*
 * 个人照片对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class PersonImg {
    private Integer personImgId;
    private Integer personDetailId;
    private Integer ossId;

    private OSSFile ossFile;

    public PersonImg(Integer personImgId, Integer personDetailId, Integer ossId, OSSFile ossFile) {
        this.personImgId = personImgId;
        this.personDetailId = personDetailId;
        this.ossId = ossId;
        this.ossFile = ossFile;
    }

    public PersonImg() {
    }

    public OSSFile getOssFile() {
        return ossFile;
    }

    public void setOssFile(OSSFile ossFile) {
        this.ossFile = ossFile;
    }

    public Integer getPersonImgId() {
        return personImgId;
    }

    public void setPersonImgId(Integer personImgId) {
        this.personImgId = personImgId;
    }

    public Integer getPersonDetailId() {
        return personDetailId;
    }

    public void setPersonDetailId(Integer personDetailId) {
        this.personDetailId = personDetailId;
    }

    public Integer getOssId() {
        return ossId;
    }

    public void setOssId(Integer ossId) {
        this.ossId = ossId;
    }

    @Override
    public String toString() {
        return "PersonImg{" +
                "personImgId=" + personImgId +
                ", personDetailId=" + personDetailId +
                ", ossId=" + ossId +
                ", ossFile=" + ossFile +
                '}';
    }
}
