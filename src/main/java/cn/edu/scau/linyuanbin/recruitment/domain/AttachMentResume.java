/*
* 简历附件对象
* */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class AttachMentResume {
    private Integer attachMentResumeId;
    private Integer personId;
    private Integer ossId;
    private String name;//文件原名

    private OSSFile ossFile;

    public AttachMentResume(Integer attachMentResumeId, Integer personId, Integer ossId, String name, OSSFile ossFile) {
        this.attachMentResumeId = attachMentResumeId;
        this.personId = personId;
        this.ossId = ossId;
        this.name = name;
        this.ossFile = ossFile;
    }

    public AttachMentResume() {
    }

    public Integer getAttachMentResumeId() {
        return attachMentResumeId;
    }

    public void setAttachMentResumeId(Integer attachMentResumeId) {
        this.attachMentResumeId = attachMentResumeId;
    }

    public OSSFile getOssFile() {
        return ossFile;
    }

    public void setOssFile(OSSFile ossFile) {
        this.ossFile = ossFile;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Integer getOssId() {
        return ossId;
    }

    public void setOssId(Integer ossId) {
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
                "attachMentResumeId=" + attachMentResumeId +
                ", personId=" + personId +
                ", ossId=" + ossId +
                ", name='" + name + '\'' +
                ", ossFile=" + ossFile +
                '}';
    }
}
