/*
 * 教育经历对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class Education {
    private Integer educationId;
    private Integer resumeId;
    private String school;
    private String degree;
    private String profession;
    private String startyear;
    private String endyear;
    private String rank;

    public Education(Integer educationId, Integer resumeId, String schoole, String degree, String profession, String startyear, String endyear, String rank) {
        this.educationId = educationId;
        this.resumeId = resumeId;
        this.school = schoole;
        this.degree = degree;
        this.profession = profession;
        this.startyear = startyear;
        this.endyear = endyear;
        this.rank = rank;
    }

    public Education() {
    }

    public Integer getEducationId() {
        return educationId;
    }

    public void setEducationId(Integer educationId) {
        this.educationId = educationId;
    }

    public Integer getResumeId() {
        return resumeId;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String schoole) {
        this.school = schoole;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getStartyear() {
        return startyear;
    }

    public void setStartyear(String startyear) {
        this.startyear = startyear;
    }

    public String getEndyear() {
        return endyear;
    }

    public void setEndyear(String endyear) {
        this.endyear = endyear;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Education{" +
                "educationId=" + educationId +
                ", resumeId=" + resumeId +
                ", schoole='" + school + '\'' +
                ", degree='" + degree + '\'' +
                ", profession='" + profession + '\'' +
                ", startyear='" + startyear + '\'' +
                ", endyear='" + endyear + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
