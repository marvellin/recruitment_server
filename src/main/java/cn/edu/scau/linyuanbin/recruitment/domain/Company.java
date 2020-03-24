/*
 * 公司用户对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

import java.util.List;

public class Company {
    private int companyId;
    private int userId;
    private String intro;//公司介绍

    private User user;
    private List<Position> positionList;
    private List<CompanyReport> reportList;
    private List<CompanyProduct> productList;
    private CompanyStage companyStage;
    private CompanyMember companyMember;
    private CompanyDetail companyDetail;

    @Override
    public String toString() {
        return "Company{" +
                "companyId=" + companyId +
                ", userId=" + userId +
                ", intro='" + intro + '\'' +
                ", user=" + user +
                ", positionList=" + positionList +
                ", reportList=" + reportList +
                ", productList=" + productList +
                ", companyStage=" + companyStage +
                ", companyMember=" + companyMember +
                ", companyDetail=" + companyDetail +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Position> getPositionList() {
        return positionList;
    }

    public void setPositionList(List<Position> positionList) {
        this.positionList = positionList;
    }

    public List<CompanyReport> getReportList() {
        return reportList;
    }

    public void setReportList(List<CompanyReport> reportList) {
        this.reportList = reportList;
    }

    public List<CompanyProduct> getProductList() {
        return productList;
    }

    public void setProductList(List<CompanyProduct> productList) {
        this.productList = productList;
    }

    public CompanyStage getCompanyStage() {
        return companyStage;
    }

    public void setCompanyStage(CompanyStage companyStage) {
        this.companyStage = companyStage;
    }

    public CompanyMember getCompanyMember() {
        return companyMember;
    }

    public void setCompanyMember(CompanyMember companyMember) {
        this.companyMember = companyMember;
    }

    public CompanyDetail getCompanyDetail() {
        return companyDetail;
    }

    public void setCompanyDetail(CompanyDetail companyDetail) {
        this.companyDetail = companyDetail;
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

    public Company(int companyId, int userId, String intro, User user, List<Position> positionList, List<CompanyReport> reportList, List<CompanyProduct> productList, CompanyStage companyStage, CompanyMember companyMember, CompanyDetail companyDetail) {
        this.companyId = companyId;
        this.userId = userId;
        this.intro = intro;
        this.user = user;
        this.positionList = positionList;
        this.reportList = reportList;
        this.productList = productList;
        this.companyStage = companyStage;
        this.companyMember = companyMember;
        this.companyDetail = companyDetail;
    }

    public Company() {
    }
}
