/*
 * 公司产品对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class CompanyProduct {
    private int companyProductId;
    private int companyId;
    private String name;
    private String info;
    private ProductImg productImg;

    public CompanyProduct(int companyProductId, int companyId, String name, String info) {
        this.companyProductId = companyProductId;
        this.companyId = companyId;
        this.name = name;
        this.info = info;
    }

    public ProductImg getProductImg() {
        return productImg;
    }

    public void setProductImg(ProductImg productImg) {
        this.productImg = productImg;
    }

    public int getCompanyProductId() {
        return companyProductId;
    }

    public void setCompanyProductId(int companyProductId) {
        this.companyProductId = companyProductId;
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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "CompanyProduct{" +
                "companyProductId=" + companyProductId +
                ", companyId=" + companyId +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
