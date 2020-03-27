/*
 * 公司融资情况对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class CompanyStage {
    private Integer companyStageId;
    private Integer companyId;
    private String currentstage;
    private String org;

    public CompanyStage(Integer companyStageId, Integer companyId, String currentstage, String org) {
        this.companyStageId = companyStageId;
        this.companyId = companyId;
        this.currentstage = currentstage;
        this.org = org;
    }

    public CompanyStage() {
    }

    public Integer getCompanyStageId() {
        return companyStageId;
    }

    public void setCompanyStageId(Integer companyStageId) {
        this.companyStageId = companyStageId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
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
