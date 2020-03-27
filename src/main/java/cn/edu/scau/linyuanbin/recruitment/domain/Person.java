/*
 * 个人用户对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

import java.util.List;

public class Person {
    private Integer personId;
    private Integer userId;

    private User user;
    private Resume resume;
    private List<AttachMentResume> attachMentResumeList;
    private DefaultResume defaultResume;
    private PersonDetail basicinfo;
//    private List<Delivery> deliveryList;

    public Person(Integer personId, Integer userId, User user, Resume resume, List<AttachMentResume> attachMentResumeList, DefaultResume defaultResume, PersonDetail basicinfo) {
        this.personId = personId;
        this.userId = userId;
        this.user = user;
        this.resume = resume;
        this.attachMentResumeList = attachMentResumeList;
        this.defaultResume = defaultResume;
        this.basicinfo = basicinfo;
//        this.deliveryList = deliveryList;
    }

    public Person() {
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

    /*public List<Delivery> getDeliveryList() {
        return deliveryList;
    }

    public void setDeliveryList(List<Delivery> deliveryList) {
        this.deliveryList = deliveryList;
    }*/

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", userId=" + userId +
                ", user=" + user +
                ", resume=" + resume +
                ", attachMentResumeList=" + attachMentResumeList +
                ", defaultResume=" + defaultResume +
                ", basicinfo=" + basicinfo +
                /*", deliveryList=" + deliveryList +*/
                '}';
    }
}
