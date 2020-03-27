/*
 * 公司标签对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class CompanyLabel {
    private Integer companyDetailId;
    private Integer companyLabelId;
    private String label;

    public CompanyLabel(Integer companyDetailId, Integer companyLabelId, String label) {
        this.companyDetailId = companyDetailId;
        this.companyLabelId = companyLabelId;
        this.label = label;
    }

    public CompanyLabel() {
    }

    public Integer getCompanyDetailId() {
        return companyDetailId;
    }

    public void setCompanyDetailId(Integer companyDetailId) {
        this.companyDetailId = companyDetailId;
    }

    public Integer getCompanyLabelId() {
        return companyLabelId;
    }

    public void setCompanyLabelId(Integer companyLabelId) {
        this.companyLabelId = companyLabelId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "CompanyLabel{" +
                "companyDetailId=" + companyDetailId +
                ", companyLabelId=" + companyLabelId +
                ", label='" + label + '\'' +
                '}';
    }
}
