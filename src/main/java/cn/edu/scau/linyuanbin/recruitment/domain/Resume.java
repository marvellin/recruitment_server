/*
 * 简历对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

import java.util.List;

public class Resume {
    private Integer resumeId;
    private Integer personId;

    private String resumename;
    private String selfdescription;

    private List<Education> educationList;
    private List<ProjectExperience> projectExperienceList;
    private List<WorkExperience> workExperienceList;
    private ExpectJob expectJob;
    private PersonDetail basicinfo;

    public Resume(Integer resumeId, Integer personId, String resumename, String selfdescription, List<Education> educationList, List<ProjectExperience> projectExperienceList, List<WorkExperience> workExperienceList, ExpectJob expectJob, PersonDetail basicinfo) {
        this.resumeId = resumeId;
        this.personId = personId;
        this.resumename = resumename;
        this.selfdescription = selfdescription;
        this.educationList = educationList;
        this.projectExperienceList = projectExperienceList;
        this.workExperienceList = workExperienceList;
        this.expectJob = expectJob;
        this.basicinfo = basicinfo;
    }

    public Resume() {
    }

    public List<Education> getEducationList() {
        return educationList;
    }

    public void setEducationList(List<Education> educationList) {
        this.educationList = educationList;
    }

    public List<ProjectExperience> getProjectExperienceList() {
        return projectExperienceList;
    }

    public void setProjectExperienceList(List<ProjectExperience> projectExperienceList) {
        this.projectExperienceList = projectExperienceList;
    }

    public List<WorkExperience> getWorkExperienceList() {
        return workExperienceList;
    }

    public void setWorkExperienceList(List<WorkExperience> workExperienceList) {
        this.workExperienceList = workExperienceList;
    }

    public ExpectJob getExpectJob() {
        return expectJob;
    }

    public void setExpectJob(ExpectJob expectJob) {
        this.expectJob = expectJob;
    }

    public PersonDetail getBasicinfo() {
        return basicinfo;
    }

    public void setBasicinfo(PersonDetail basicinfo) {
        this.basicinfo = basicinfo;
    }

    public Integer getResumeId() {
        return resumeId;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
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
                ", educationList=" + educationList +
                ", projectExperienceList=" + projectExperienceList +
                ", workExperienceList=" + workExperienceList +
                ", expectJob=" + expectJob +
                ", basicinfo=" + basicinfo +
                '}';
    }
}
