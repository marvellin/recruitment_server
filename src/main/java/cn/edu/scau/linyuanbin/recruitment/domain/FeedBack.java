/*
 * 投递反馈对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class FeedBack {
    private int feedBackId;
    private int deliveryId;
    private String feedbacktime;
    private String feedback;

    public FeedBack(int feedBackId, int deliveryId, String feedBackTime, String feedback) {
        this.feedBackId = feedBackId;
        this.deliveryId = deliveryId;
        this.feedbacktime = feedBackTime;
        this.feedback = feedback;
    }

    public int getFeedBackId() {
        return feedBackId;
    }

    public void setFeedBackId(int feedBackId) {
        this.feedBackId = feedBackId;
    }

    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getFeedBackTime() {
        return feedbacktime;
    }

    public void setFeedBackTime(String feedBackTime) {
        this.feedbacktime = feedBackTime;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "FeedBack{" +
                "feedBackId=" + feedBackId +
                ", deliveryId=" + deliveryId +
                ", feedBackTime='" + feedbacktime + '\'' +
                ", feedback='" + feedback + '\'' +
                '}';
    }
}
