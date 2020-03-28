/*
 * 职位对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

import java.util.List;

public class Position {
    private Integer positionId;
    private Integer companyId;

    private Integer salarymin;
    private Integer salarymax;
    private String department;
    private String post;
    private String name;
    private String type;
    private String city;
    private String experience;
    private String degree;
    private String advantage;
    private String detail;
    private String address;
    private String status;
    private String releaseTime;
    //   private List<Person> personList;
    //    private List<Resume> resumeList;

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public Position(Integer positionId, Integer companyId, Integer salarymin, Integer salarymax, String department, String post, String name, String type, String city, String experience, String degree, String advantage, String detail, String address, String status) {
        this.positionId = positionId;
        this.companyId = companyId;
        this.salarymin = salarymin;
        this.salarymax = salarymax;
        this.department = department;
        this.post = post;
        this.name = name;
        this.type = type;
        this.city = city;
        this.experience = experience;
        this.degree = degree;
        this.advantage = advantage;
        this.detail = detail;
        this.address = address;
        this.status = status;
        this.releaseTime = releaseTime;
    }

    public Position() {
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getSalarymin() {
        return salarymin;
    }

    public void setSalarymin(Integer salarymin) {
        this.salarymin = salarymin;
    }

    public Integer getSalarymax() {
        return salarymax;
    }

    public void setSalarymax(Integer salarymax) {
        this.salarymax = salarymax;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getAdvantage() {
        return advantage;
    }

    public void setAdvantage(String advantage) {
        this.advantage = advantage;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Position{" +
                "positionId=" + positionId +
                ", companyId=" + companyId +
                ", salarymin=" + salarymin +
                ", salarymax=" + salarymax +
                ", department='" + department + '\'' +
                ", post='" + post + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", city='" + city + '\'' +
                ", experience='" + experience + '\'' +
                ", degree='" + degree + '\'' +
                ", advantage='" + advantage + '\'' +
                ", detail='" + detail + '\'' +
                ", address='" + address + '\'' +
                ", status='" + status + '\'' +
                ", releaseTime='" + releaseTime + '\'' +
                '}';
    }
}
