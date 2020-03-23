/*
* 简历附件对象
* */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class AttachMentResume {
    private int attachMentResumeId;
    private int personId;
    private int ossId;
    private String name;//文件原名
    private OSSFile ossFile;


    public AttachMentResume(int attachMentId, int personId, int ossId, String name, OSSFile ossFile) {
        this.attachMentResumeId = attachMentId;
        this.personId = personId;
        this.ossId = ossId;
        this.name = name;
    }


    public int getAttachMentResumeId() {
        return attachMentResumeId;
    }

    public void setAttachMentResumeId(int attachMentResumeId) {
        this.attachMentResumeId = attachMentResumeId;
    }

    public OSSFile getOssFile() {
        return ossFile;
    }

    public void setOssFile(OSSFile ossFile) {
        this.ossFile = ossFile;
    }

    /*public int getAttachMentId() {
        return attachMentResumeId;
    }

    public void setAttachMentId(int attachMentId) {
        this.attachMentResumeId = attachMentId;
    }*/

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getOssId() {
        return ossId;
    }

    public void setOssId(int ossId) {
        this.ossId = ossId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AttachMentResume{" +
                "attachMentId=" + attachMentResumeId +
                ", personId=" + personId +
                ", ossId=" + ossId +
                ", name='" + name + '\'' +
                '}';
    }
}
