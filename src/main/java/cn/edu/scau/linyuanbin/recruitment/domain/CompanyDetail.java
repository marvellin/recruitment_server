/*
 * 公司基本信息对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

import java.util.List;

public class CompanyDetail {
    private int companyDetailId;
    private int companyId;
    private String fullname;
    private String shortname;
    private String feature;
    private String city;
    private String field;
    private String scale;
    private String comurl;
    private CompanyImg companyImg;
    private List<CompanyLabel> labelList;

    @Override
    public String toString() {
        return "CompanyDetail{" +
                "companyDetailId=" + companyDetailId +
                ", companyId=" + companyId +
                ", fullName='" + fullname + '\'' +
                ", shortName='" + shortname + '\'' +
                ", feature='" + feature + '\'' +
                ", city='" + city + '\'' +
                ", field='" + field + '\'' +
                ", scale='" + scale + '\'' +
                ", comurl='" + comurl + '\'' +
                '}';
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public CompanyImg getCompanyImg() {
        return companyImg;
    }

    public void setCompanyImg(CompanyImg companyImg) {
        this.companyImg = companyImg;
    }

    public List<CompanyLabel> getLabelList() {
        return labelList;
    }

    public void setLabelList(List<CompanyLabel> labelList) {
        this.labelList = labelList;
    }

    public int getCompanyDetailId() {
        return companyDetailId;
    }

    public void setCompanyDetailId(int companyDetailId) {
        this.companyDetailId = companyDetailId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getFullName() {
        return fullname;
    }

    public void setFullName(String fullName) {
        this.fullname = fullName;
    }

    public String getShortName() {
        return shortname;
    }

    public void setShortName(String shortName) {
        this.shortname = shortName;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getComurl() {
        return comurl;
    }

    public void setComurl(String comurl) {
        this.comurl = comurl;
    }

    public CompanyDetail(int companyDetailId, int companyId, String fullName, String shortName, String feature, String city, String field, String scale, String comurl) {
        this.companyDetailId = companyDetailId;
        this.companyId = companyId;
        this.fullname = fullName;
        this.shortname = shortName;
        this.feature = feature;
        this.city = city;
        this.field = field;
        this.scale = scale;
        this.comurl = comurl;
    }
}
