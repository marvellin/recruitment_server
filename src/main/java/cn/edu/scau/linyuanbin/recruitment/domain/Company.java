/*
 * 公司用户对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class Company {
    private int companyId;
    private int userId;
    private String intro;//公司介绍

    @Override
    public String toString() {
        return "Company{" +
                "companyId=" + companyId +
                ", userId=" + userId +
                ", intro='" + intro + '\'' +
                '}';
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Company(int companyId, int userId, String intro) {
        this.companyId = companyId;
        this.userId = userId;
        this.intro = intro;
    }
}
