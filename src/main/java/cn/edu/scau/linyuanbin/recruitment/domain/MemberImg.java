/*
 * 公司负责人照片对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class MemberImg {
    private int memberImgId;
    private int companyMemberId;
    private int ossId;

    OSSFile ossFile;

    public MemberImg(int memberImgId, int companyMemberId, int ossId, OSSFile ossFile) {
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

    public int getMemberImgId() {
        return memberImgId;
    }

    public void setMemberImgId(int memberImgId) {
        this.memberImgId = memberImgId;
    }

    public int getCompanyMemberId() {
        return companyMemberId;
    }

    public void setCompanyMemberId(int companyMemberId) {
        this.companyMemberId = companyMemberId;
    }

    public int getOssId() {
        return ossId;
    }

    public void setOssId(int ossId) {
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
