/*
 * 简历对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class Resume {
    private int resumeId;
    private int personId;
    private String resumename;
    private String selfdescription;

    public Resume(int resumeId, int personId, String resumename, String selfdescription) {
        this.resumeId = resumeId;
        this.personId = personId;
        this.resumename = resumename;
        this.selfdescription = selfdescription;
    }

    public int getResumeId() {
        return resumeId;
    }

    public void setResumeId(int resumeId) {
        this.resumeId = resumeId;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getResumename() {
        return resumename;
    }

    public void setResumename(String resumename) {
        this.resumename = resumename;
    }

    public String getSelfdescription() {
        return selfdescription;
    }

    public void setSelfdescription(String selfdescription) {
        this.selfdescription = selfdescription;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "resumeId=" + resumeId +
                ", personId=" + personId +
                ", resumename='" + resumename + '\'' +
                ", selfdescription='" + selfdescription + '\'' +
                '}';
    }
}
