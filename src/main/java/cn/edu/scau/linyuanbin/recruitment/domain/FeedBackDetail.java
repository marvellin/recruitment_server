/*
 * 投递反馈细节对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class FeedBackDetail {
    private int feedBackDetailId;
    private int feedBackId;
    private String address;
    private String time;
    private String tel;

    public FeedBackDetail(int feedBackDetailId, int feedBackId, String address, String time, String tel) {
        this.feedBackDetailId = feedBackDetailId;
        this.feedBackId = feedBackId;
        this.address = address;
        this.time = time;
        this.tel = tel;
    }

    public int getFeedBackDetailId() {
        return feedBackDetailId;
    }

    public void setFeedBackDetailId(int feedBackDetailId) {
        this.feedBackDetailId = feedBackDetailId;
    }

    public int getFeedBackId() {
        return feedBackId;
    }

    public void setFeedBackId(int feedBackId) {
        this.feedBackId = feedBackId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "FeedBackDetail{" +
                "feedBackDetailId=" + feedBackDetailId +
                ", feedBackId=" + feedBackId +
                ", address='" + address + '\'' +
                ", time='" + time + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
