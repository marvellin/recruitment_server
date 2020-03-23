/*
 * 个人基本信息对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class PersonDetail {
    private int personDetailId;
    private int personId;
    private int resumeId;
    private String username;
    private String tel;
    private String email;
    private String gender;
    private String degree;
    private String workyear;
    private String currentstate;
    private PersonImg personImg;

    public PersonDetail(int personDetailId, int personId, int resumeId, String username, String tel, String email, String gender, String degree, String workyear, String currenttate) {
        this.personDetailId = personDetailId;
        this.personId = personId;
        this.resumeId = resumeId;
        this.username = username;
        this.tel = tel;
        this.email = email;
        this.gender = gender;
        this.degree = degree;
        this.workyear = workyear;
        this.currentstate = currenttate;
    }

    public String getCurrentstate() {
        return currentstate;
    }

    public void setCurrentstate(String currentstate) {
        this.currentstate = currentstate;
    }

    public PersonImg getPersonImg() {
        return personImg;
    }

    public void setPersonImg(PersonImg personImg) {
        this.personImg = personImg;
    }

    public int getPersonDetailId() {
        return personDetailId;
    }

    public void setPersonDetailId(int personDetailId) {
        this.personDetailId = personDetailId;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getWorkyear() {
        return workyear;
    }

    public void setWorkyear(String workyear) {
        this.workyear = workyear;
    }

    public String getCurrenttate() {
        return currentstate;
    }

    public void setCurrenttate(String currenttate) {
        this.currentstate = currenttate;
    }

    @Override
    public String toString() {
        return "PersonDetail{" +
                "personDetailId=" + personDetailId +
                ", personId=" + personId +
                ", resumeId=" + resumeId +
                ", username='" + username + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", degree='" + degree + '\'' +
                ", workyear='" + workyear + '\'' +
                ", currenttate='" + currentstate + '\'' +
                '}';
    }
}
