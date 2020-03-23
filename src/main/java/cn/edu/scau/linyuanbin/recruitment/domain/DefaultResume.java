/*
 * 默认简历对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class DefaultResume {
    private int defaultResumeId;
    private int personId;
    private int resumeId;
    private int attachmentResumeId;
    private Resume resume;
    private AttachMentResume attachMentResume;

    public DefaultResume(int defaultResumeId, int personId, int resumeId, int attachmentResumeId) {
        this.defaultResumeId = defaultResumeId;
        this.personId = personId;
        this.resumeId = resumeId;
        this.attachmentResumeId = attachmentResumeId;
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

    public int getResumeId() {
        return resumeId;
    }

    public void setResumeId(int resumeId) {
        this.resumeId = resumeId;
    }

    public int getAttachmentResumeId() {
        return attachmentResumeId;
    }

    public void setAttachmentResumeId(int attachmentResumeId) {
        this.attachmentResumeId = attachmentResumeId;
    }

    @Override
    public String toString() {
        return "DefaultResume{" +
                "defaultResumeId=" + defaultResumeId +
                ", personId=" + personId +
                ", resumeId=" + resumeId +
                ", attachmentResumeId=" + attachmentResumeId +
                '}';
    }
}
