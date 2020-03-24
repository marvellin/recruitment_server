/*
 * 公司标签对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class CompanyLabel {
    private int companyDetailId;
    private int companyLabelId;
    private String label;

    public CompanyLabel(int companyDetailId, int companyLabelId, String label) {
        this.companyDetailId = companyDetailId;
        this.companyLabelId = companyLabelId;
        this.label = label;
    }

    public CompanyLabel() {
    }

    public int getCompanyDetailId() {
        return companyDetailId;
    }

    public void setCompanyDetailId(int companyDetailId) {
        this.companyDetailId = companyDetailId;
    }

    public int getCompanyLabelId() {
        return companyLabelId;
    }

    public void setCompanyLabelId(int companyLabelId) {
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
