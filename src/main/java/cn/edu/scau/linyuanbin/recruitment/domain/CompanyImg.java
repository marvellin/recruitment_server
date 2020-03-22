/*
 * 公司图标对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class CompanyImg {
    private int companyImgId;
    private int companyDetailId;
    private int ossId;

    public CompanyImg(int companyImgId, int companyDetailId, int ossId) {
        this.companyImgId = companyImgId;
        this.companyDetailId = companyDetailId;
        this.ossId = ossId;
    }

    public int getCompanyImgId() {
        return companyImgId;
    }

    public void setCompanyImgId(int companyImgId) {
        this.companyImgId = companyImgId;
    }

    public int getCompanyDetailId() {
        return companyDetailId;
    }

    public void setCompanyDetailId(int companyDetailId) {
        this.companyDetailId = companyDetailId;
    }

    public int getOssId() {
        return ossId;
    }

    public void setOssId(int ossId) {
        this.ossId = ossId;
    }

    @Override
    public String toString() {
        return "CompanyImg{" +
                "companyImgId=" + companyImgId +
                ", companyDetailId=" + companyDetailId +
                ", ossId=" + ossId +
                '}';
    }
}
