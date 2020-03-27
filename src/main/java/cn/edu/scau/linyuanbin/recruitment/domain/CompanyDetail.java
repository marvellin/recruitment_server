/*
 * 公司基本信息对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

import java.util.List;

public class CompanyDetail {
    private Integer companyDetailId;
    private Integer companyId;
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
                ", fullname='" + fullname + '\'' +
                ", shortname='" + shortname + '\'' +
                ", feature='" + feature + '\'' +
                ", city='" + city + '\'' +
                ", field='" + field + '\'' +
                ", scale='" + scale + '\'' +
                ", comurl='" + comurl + '\'' +
                ", companyImg=" + companyImg +
                ", labelList=" + labelList +
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

    public Integer getCompanyDetailId() {
        return companyDetailId;
    }

    public void setCompanyDetailId(Integer companyDetailId) {
        this.companyDetailId = companyDetailId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
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

    public CompanyDetail(Integer companyDetailId, Integer companyId, String fullname, String shortname, String feature, String city, String field, String scale, String comurl, CompanyImg companyImg, List<CompanyLabel> labelList) {
        this.companyDetailId = companyDetailId;
        this.companyId = companyId;
        this.fullname = fullname;
        this.shortname = shortname;
        this.feature = feature;
        this.city = city;
        this.field = field;
        this.scale = scale;
        this.comurl = comurl;
        this.companyImg = companyImg;
        this.labelList = labelList;
    }

    public CompanyDetail() {
    }
}
