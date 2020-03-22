/*
 * 公司融资情况对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class CompanyStage {
    private int companyStageId;
    private int companyId;
    private String currentstage;
    private String org;

    public CompanyStage(int companyStageId, int companyId, String currentstage, String org) {
        this.companyStageId = companyStageId;
        this.companyId = companyId;
        this.currentstage = currentstage;
        this.org = org;
    }

    public int getCompanyStageId() {
        return companyStageId;
    }

    public void setCompanyStageId(int companyStageId) {
        this.companyStageId = companyStageId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCurrentstage() {
        return currentstage;
    }

    public void setCurrentstage(String currentstage) {
        this.currentstage = currentstage;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    @Override
    public String toString() {
        return "CompanyStage{" +
                "companyStageId=" + companyStageId +
                ", companyId=" + companyId +
                ", currentstage='" + currentstage + '\'' +
                ", org='" + org + '\'' +
                '}';
    }
}
