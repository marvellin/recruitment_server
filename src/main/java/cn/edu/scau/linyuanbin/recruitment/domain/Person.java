/*
 * 个人用户对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

import java.util.List;

public class Person {
    private int personId;
    private int userId;
    private User user;
    private Resume resume;
    private List<AttachMentResume> attachMentResumeList;
    private DefaultResume defaultResume;
    private PersonDetail basicinfo;
    private List<Delivery> deliveryList;

    public Person(int personId, int userId) {
        this.personId = personId;
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    public List<AttachMentResume> getAttachMentResumeList() {
        return attachMentResumeList;
    }

    public void setAttachMentResumeList(List<AttachMentResume> attachMentResumeList) {
        this.attachMentResumeList = attachMentResumeList;
    }

    public DefaultResume getDefaultResume() {
        return defaultResume;
    }

    public void setDefaultResume(DefaultResume defaultResume) {
        this.defaultResume = defaultResume;
    }

    public PersonDetail getBasicinfo() {
        return basicinfo;
    }

    public void setBasicinfo(PersonDetail basicinfo) {
        this.basicinfo = basicinfo;
    }

    public List<Delivery> getDeliveryList() {
        return deliveryList;
    }

    public void setDeliveryList(List<Delivery> deliveryList) {
        this.deliveryList = deliveryList;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", userId=" + userId +
                '}';
    }
}
