/*
 * 工作经验对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class WorkExperience {
    private Integer workExperienceId;
    private Integer resumeId;

    private String comname;
    private String post;
    private String startym;
    private String endym;

    public WorkExperience(Integer workExperienceId, Integer resumeId, String comname, String post, String startym, String endym) {
        this.workExperienceId = workExperienceId;
        this.resumeId = resumeId;
        this.comname = comname;
        this.post = post;
        this.startym = startym;
        this.endym = endym;
    }

    public WorkExperience() {
    }

    public Integer getWorkExperienceId() {
        return workExperienceId;
    }

    public void setWorkExperienceId(Integer workExperienceId) {
        this.workExperienceId = workExperienceId;
    }

    public Integer getResumeId() {
        return resumeId;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    public String getComname() {
        return comname;
    }

    public void setComname(String comname) {
        this.comname = comname;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getStartym() {
        return startym;
    }

    public void setStartym(String startym) {
        this.startym = startym;
    }

    public String getEndym() {
        return endym;
    }

    public void setEndym(String endym) {
        this.endym = endym;
    }

    @Override
    public String toString() {
        return "WorkExperience{" +
                "workExperienceId=" + workExperienceId +
                ", resumeId=" + resumeId +
                ", comname='" + comname + '\'' +
                ", post='" + post + '\'' +
                ", startym='" + startym + '\'' +
                ", endym='" + endym + '\'' +
                '}';
    }
}
