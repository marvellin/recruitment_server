/*
 * 公司图标对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class CompanyImg {
    private Integer companyImgId;
    private Integer companyDetailId;
    private Integer ossId;
    private OSSFile ossFile;

    public CompanyImg(Integer companyImgId, Integer companyDetailId, Integer ossId, OSSFile ossFile) {
        this.companyImgId = companyImgId;
        this.companyDetailId = companyDetailId;
        this.ossId = ossId;
        this.ossFile = ossFile;
    }

    public CompanyImg() {
    }

    public OSSFile getOssFile() {
        return ossFile;
    }

    public void setOssFile(OSSFile ossFile) {
        this.ossFile = ossFile;
    }

    public Integer getCompanyImgId() {
        return companyImgId;
    }

    public void setCompanyImgId(Integer companyImgId) {
        this.companyImgId = companyImgId;
    }

    public Integer getCompanyDetailId() {
        return companyDetailId;
    }

    public void setCompanyDetailId(Integer companyDetailId) {
        this.companyDetailId = companyDetailId;
    }

    public Integer getOssId() {
        return ossId;
    }

    public void setOssId(Integer ossId) {
        this.ossId = ossId;
    }

    @Override
    public String toString() {
        return "CompanyImg{" +
                "companyImgId=" + companyImgId +
                ", companyDetailId=" + companyDetailId +
                ", ossId=" + ossId +
                ", ossFile=" + ossFile +
                '}';
    }
}
