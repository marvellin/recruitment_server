/*
 * 项目经历对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class ProjectExperience {
    private Integer projectExperienceId;
    private Integer resumeId;

    private String proname;
    private String post;
    private String startym;
    private String endym;
    private String intro;

    public ProjectExperience(Integer projectExperienceId, Integer resumeId, String proname, String post, String startym, String endym, String intro) {
        this.projectExperienceId = projectExperienceId;
        this.resumeId = resumeId;
        this.proname = proname;
        this.post = post;
        this.startym = startym;
        this.endym = endym;
        this.intro = intro;
    }

    public ProjectExperience() {
    }

    public Integer getProjectExperienceId() {
        return projectExperienceId;
    }

    public void setProjectExperienceId(Integer projectExperienceId) {
        this.projectExperienceId = projectExperienceId;
    }

    public Integer getResumeId() {
        return resumeId;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
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

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    @Override
    public String toString() {
        return "ProjectExperience{" +
                "projectExperienceId=" + projectExperienceId +
                ", resumeId=" + resumeId +
                ", proname='" + proname + '\'' +
                ", post='" + post + '\'' +
                ", startym='" + startym + '\'' +
                ", endym='" + endym + '\'' +
                ", intro='" + intro + '\'' +
                '}';
    }
}
