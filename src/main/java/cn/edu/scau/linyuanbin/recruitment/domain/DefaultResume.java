/*
 * 默认简历对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class DefaultResume {
    private int defaultResumeId;
    private int personId;
    private Integer resumeId;
    private Integer attachmentResumeId;
    private Resume resume;
    private AttachMentResume attachMentResume;

    public DefaultResume(int defaultResumeId, int personId, Integer resumeId, Integer attachmentResumeId, Resume resume, AttachMentResume attachMentResume) {
        this.defaultResumeId = defaultResumeId;
        this.personId = personId;
        this.resumeId = resumeId;
        this.attachmentResumeId = attachmentResumeId;
        this.resume = resume;
        this.attachMentResume = attachMentResume;
    }

    public DefaultResume() {
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    public AttachMentResume getAttachMentResume() {
        return attachMentResume;
    }

    public void setAttachMentResume(AttachMentResume attachMentResume) {
        this.attachMentResume = attachMentResume;
    }

    public int getDefaultResumeId() {
        return defaultResumeId;
    }

    public void setDefaultResumeId(int defaultResumeId) {
        this.defaultResumeId = defaultResumeId;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public Integer getResumeId() {
        return resumeId;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    public Integer getAttachmentResumeId() {
        return attachmentResumeId;
    }

    public void setAttachmentResumeId(Integer attachmentResumeId) {
        this.attachmentResumeId = attachmentResumeId;
    }

    @Override
    public String toString() {
        return "DefaultResume{" +
                "defaultResumeId=" + defaultResumeId +
                ", personId=" + personId +
                ", resumeId=" + resumeId +
                ", attachmentResumeId=" + attachmentResumeId +
                ", resume=" + resume +
                ", attachMentResume=" + attachMentResume +
                '}';
    }
}
