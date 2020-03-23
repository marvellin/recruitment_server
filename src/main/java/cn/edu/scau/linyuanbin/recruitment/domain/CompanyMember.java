/*
 * 公司负责人对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class CompanyMember {
    private int companyMemberId;
    private int companyId;
    private String name;
    private String post;
    private String intro;
    private MemberImg memberImg;

    public CompanyMember(int companyMemberId, int companyId, String name, String post, String intro) {
        this.companyMemberId = companyMemberId;
        this.companyId = companyId;
        this.name = name;
        this.post = post;
        this.intro = intro;
    }

    public MemberImg getMemberImg() {
        return memberImg;
    }

    public void setMemberImg(MemberImg memberImg) {
        this.memberImg = memberImg;
    }

    public int getCompanyMemberId() {
        return companyMemberId;
    }

    public void setCompanyMemberId(int companyMemberId) {
        this.companyMemberId = companyMemberId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    @Override
    public String toString() {
        return "CompanyMember{" +
                "companyMemberId=" + companyMemberId +
                ", companyId=" + companyId +
                ", name='" + name + '\'' +
                ", post='" + post + '\'' +
                ", intro='" + intro + '\'' +
                '}';
    }
}
