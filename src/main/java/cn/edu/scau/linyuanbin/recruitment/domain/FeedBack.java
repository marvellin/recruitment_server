/*
 * 投递反馈对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class FeedBack {
    private Integer feedBackId;
    private Integer deliveryId;
    private String feedbacktime;
    private String feedback;

    private FeedBackDetail feedBackDetail;

    public FeedBack(Integer feedBackId, Integer deliveryId, String feedbacktime, String feedback, FeedBackDetail feedBackDetail) {
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

    public Integer getFeedBackId() {
        return feedBackId;
    }

    public void setFeedBackId(Integer feedBackId) {
        this.feedBackId = feedBackId;
    }

    public Integer getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
    }

    /*public String getFeedBackTime() {
        return feedbacktime;
    }

    public void setFeedBackTime(String feedBackTime) {
        this.feedbacktime = feedBackTime;
    }*/

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
