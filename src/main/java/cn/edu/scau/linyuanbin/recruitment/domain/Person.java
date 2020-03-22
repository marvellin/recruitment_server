/*
 * 个人用户对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class Person {
    private int personId;
    private int userId;

    public Person(int personId, int userId) {
        this.personId = personId;
        this.userId = userId;
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
