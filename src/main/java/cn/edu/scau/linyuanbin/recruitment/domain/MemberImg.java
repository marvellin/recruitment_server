/*
 * 公司负责人照片对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class MemberImg {
    private Integer memberImgId;
    private Integer companyMemberId;
    private Integer ossId;

    OSSFile ossFile;

    public MemberImg(Integer memberImgId, Integer companyMemberId, Integer ossId, OSSFile ossFile) {
        this.memberImgId = memberImgId;
        this.companyMemberId = companyMemberId;
        this.ossId = ossId;
        this.ossFile = ossFile;
    }

    public MemberImg() {
    }

    public OSSFile getOssFile() {
        return ossFile;
    }

    public void setOssFile(OSSFile ossFile) {
        this.ossFile = ossFile;
    }

    public Integer getMemberImgId() {
        return memberImgId;
    }

    public void setMemberImgId(Integer memberImgId) {
        this.memberImgId = memberImgId;
    }

    public Integer getCompanyMemberId() {
        return companyMemberId;
    }

    public void setCompanyMemberId(Integer companyMemberId) {
        this.companyMemberId = companyMemberId;
    }

    public Integer getOssId() {
        return ossId;
    }

    public void setOssId(Integer ossId) {
        this.ossId = ossId;
    }

    @Override
    public String toString() {
        return "MemberImg{" +
                "memberImgId=" + memberImgId +
                ", companyMemberId=" + companyMemberId +
                ", ossId=" + ossId +
                ", ossFile=" + ossFile +
                '}';
    }
}
