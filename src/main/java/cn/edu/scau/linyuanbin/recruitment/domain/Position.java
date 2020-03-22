/*
 * 职位对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class Position {
    private int positionId;
    private int companyId;
    private int salarymin;
    private int salarymax;
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

    public Position(int positionId, int companyId, int salarymin, int salarymax, String department, String post, String name, String type, String city, String experience, String degree, String advantage, String detail, String address) {
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
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getSalarymin() {
        return salarymin;
    }

    public void setSalarymin(int salarymin) {
        this.salarymin = salarymin;
    }

    public int getSalarymax() {
        return salarymax;
    }

    public void setSalarymax(int salarymax) {
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
                '}';
    }
}
