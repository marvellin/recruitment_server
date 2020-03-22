/*
 * 公司报道对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class CompanyReport {
    private int companyReportId;
    private int companyId;
    private String repotitle;
    private String repolink;

    public CompanyReport(int companyReportId, int companyId, String repotitle, String repolink) {
        this.companyReportId = companyReportId;
        this.companyId = companyId;
        this.repotitle = repotitle;
        this.repolink = repolink;
    }

    public int getCompanyReportId() {
        return companyReportId;
    }

    public void setCompanyReportId(int companyReportId) {
        this.companyReportId = companyReportId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getRepotitle() {
        return repotitle;
    }

    public void setRepotitle(String repotitle) {
        this.repotitle = repotitle;
    }

    public String getRepolink() {
        return repolink;
    }

    public void setRepolink(String repolink) {
        this.repolink = repolink;
    }

    @Override
    public String toString() {
        return "CompanyReport{" +
                "companyReportId=" + companyReportId +
                ", companyId=" + companyId +
                ", repotitle='" + repotitle + '\'' +
                ", repolink='" + repolink + '\'' +
                '}';
    }
}
