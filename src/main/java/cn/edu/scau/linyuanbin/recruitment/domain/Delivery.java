/*
 * 投递记录对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class Delivery {
    private int deliveryId;
    private int positionId;
    private int personId;
    private String deliverytime;
    private int status;
    private Resume resume;
    private Position position;
    private Person person;
    private FeedBack feedBack;

    public Delivery(int deliveryId, int positionId, int personId, String deliverytime, int status, Resume resume, Position position, Person person, FeedBack feedBack) {
        this.deliveryId = deliveryId;
        this.positionId = positionId;
        this.personId = personId;
        this.deliverytime = deliverytime;
        this.status = status;
        this.resume = resume;
        this.position = position;
        this.person = person;
        this.feedBack = feedBack;
    }

    public Delivery() {
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public FeedBack getFeedBack() {
        return feedBack;
    }

    public void setFeedBack(FeedBack feedBack) {
        this.feedBack = feedBack;
    }

    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getDeliverytime() {
        return deliverytime;
    }

    public void setDeliverytime(String deliverytime) {
        this.deliverytime = deliverytime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "deliveryId=" + deliveryId +
                ", positionId=" + positionId +
                ", personId=" + personId +
                ", deliverytime='" + deliverytime + '\'' +
                ", status=" + status +
                ", resume=" + resume +
                ", position=" + position +
                ", person=" + person +
                ", feedBack=" + feedBack +
                '}';
    }
}
