/*
 * 教育经历对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class Education {
    private int educationId;
    private int resumeId;
    private String school;
    private String degree;
    private String profession;
    private String startyear;
    private String endyear;
    private String rank;

    public Education(int educationId, int resumeId, String schoole, String degree, String profession, String startyear, String endyear, String rank) {
        this.educationId = educationId;
        this.resumeId = resumeId;
        this.school = schoole;
        this.degree = degree;
        this.profession = profession;
        this.startyear = startyear;
        this.endyear = endyear;
        this.rank = rank;
    }

    public int getEducationId() {
        return educationId;
    }

    public void setEducationId(int educationId) {
        this.educationId = educationId;
    }

    public int getResumeId() {
        return resumeId;
    }

    public void setResumeId(int resumeId) {
        this.resumeId = resumeId;
    }

    public String getSchoole() {
        return school;
    }

    public void setSchoole(String schoole) {
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
