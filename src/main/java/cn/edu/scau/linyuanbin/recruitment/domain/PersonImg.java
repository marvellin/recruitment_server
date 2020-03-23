/*
 * 个人照片对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class PersonImg {
    private int personImgId;
    private int personDetailId;
    private int ossId;
    private OSSFile ossFile;

    public PersonImg(int personImgId, int personDetailId, int ossId) {
        this.personImgId = personImgId;
        this.personDetailId = personDetailId;
        this.ossId = ossId;
    }

    public OSSFile getOssFile() {
        return ossFile;
    }

    public void setOssFile(OSSFile ossFile) {
        this.ossFile = ossFile;
    }

    public int getPersonImgId() {
        return personImgId;
    }

    public void setPersonImgId(int personImgId) {
        this.personImgId = personImgId;
    }

    public int getPersonDetailId() {
        return personDetailId;
    }

    public void setPersonDetailId(int personDetailId) {
        this.personDetailId = personDetailId;
    }

    public int getOssId() {
        return ossId;
    }

    public void setOssId(int ossId) {
        this.ossId = ossId;
    }

    @Override
    public String toString() {
        return "PersonImg{" +
                "personImgId=" + personImgId +
                ", personDetailId=" + personDetailId +
                ", ossId=" + ossId +
                '}';
    }
}
