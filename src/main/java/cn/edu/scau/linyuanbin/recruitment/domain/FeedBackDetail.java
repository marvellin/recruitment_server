/*
 * 投递反馈细节对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class FeedBackDetail {
    private Integer feedBackDetailId;
    private Integer feedBackId;
    private String address;
    private String time;
    private String tel;

    public FeedBackDetail(Integer feedBackDetailId, Integer feedBackId, String address, String time, String tel) {
        this.feedBackDetailId = feedBackDetailId;
        this.feedBackId = feedBackId;
        this.address = address;
        this.time = time;
        this.tel = tel;
    }

    public FeedBackDetail() {
    }

    public Integer getFeedBackDetailId() {
        return feedBackDetailId;
    }

    public void setFeedBackDetailId(Integer feedBackDetailId) {
        this.feedBackDetailId = feedBackDetailId;
    }

    public Integer getFeedBackId() {
        return feedBackId;
    }

    public void setFeedBackId(Integer feedBackId) {
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
