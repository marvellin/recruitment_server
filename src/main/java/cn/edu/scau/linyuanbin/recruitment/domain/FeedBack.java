/*
 * 投递反馈对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class FeedBack {
    private int feedBackId;
    private int deliveryId;
    private String feedbacktime;
    private String feedback;

    private FeedBackDetail feedBackDetail;

    public FeedBack(int feedBackId, int deliveryId, String feedbacktime, String feedback, FeedBackDetail feedBackDetail) {
        this.feedBackId = feedBackId;
        this.deliveryId = deliveryId;
        this.feedbacktime = feedbacktime;
        this.feedback = feedback;
        this.feedBackDetail = feedBackDetail;
    }

    public FeedBack() {
    }

    public String getFeedbacktime() {
        return feedbacktime;
    }

    public void setFeedbacktime(String feedbacktime) {
        this.feedbacktime = feedbacktime;
    }

    public FeedBackDetail getFeedBackDetail() {
        return feedBackDetail;
    }

    public void setFeedBackDetail(FeedBackDetail feedBackDetail) {
        this.feedBackDetail = feedBackDetail;
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
                ", feedbacktime='" + feedbacktime + '\'' +
                ", feedback='" + feedback + '\'' +
                ", feedBackDetail=" + feedBackDetail +
                '}';
    }
}
