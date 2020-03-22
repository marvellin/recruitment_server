/*
 * 期望工作对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class ExpectJob {
    private int expectJobId;
    private int resumeId;
    private String city;
    private String type;
    private String post;
    private String salary;

    public ExpectJob(int expectJobId, int resumeId, String city, String type, String post, String salary) {
        this.expectJobId = expectJobId;
        this.resumeId = resumeId;
        this.city = city;
        this.type = type;
        this.post = post;
        this.salary = salary;
    }

    public int getExpectJobId() {
        return expectJobId;
    }

    public void setExpectJobId(int expectJobId) {
        this.expectJobId = expectJobId;
    }

    public int getResumeId() {
        return resumeId;
    }

    public void setResumeId(int resumeId) {
        this.resumeId = resumeId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ExpectJob{" +
                "expectJobId=" + expectJobId +
                ", resumeId=" + resumeId +
                ", city='" + city + '\'' +
                ", type='" + type + '\'' +
                ", post='" + post + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
