/*
 * 投递记录对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class Delivery {
    private Integer deliveryId;
    private Integer positionId;
    private Integer personId;
    private String deliverytime;
    private Integer status;

    private Resume resume;
    private Position position;
    private Person person;
    private FeedBack feedBack;

    public Delivery(Integer deliveryId, Integer positionId, Integer personId, String deliverytime, Integer status, Resume resume, Position position, Person person, FeedBack feedBack) {
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

    public Integer getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getDeliverytime() {
        return deliverytime;
    }

    public void setDeliverytime(String deliverytime) {
        this.deliverytime = deliverytime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
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
