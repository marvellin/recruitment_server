/*
 * 投递记录对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class Delivery {
    private int deliveryId;
    private int positionId;
    private int resumeId;
    private String deliverytime;
    private int status;

    public Delivery(int deliveryId, int positionId, int resumeId, int status, String deliverytime) {
        this.deliveryId = deliveryId;
        this.positionId = positionId;
        this.resumeId = resumeId;
        this.deliverytime = deliverytime;
        this.status = status;
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

    public int getResumeId() {
        return resumeId;
    }

    public void setResumeId(int resumeId) {
        this.resumeId = resumeId;
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
                ", resumeId=" + resumeId +
                ", deliverytime=" + deliverytime +
                ", status='" + status + '\'' +
                '}';
    }
}
