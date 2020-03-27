/*
 * 公司产品对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class CompanyProduct {
    private Integer companyProductId;
    private Integer companyId;
    private String name;
    private String info;
    private ProductImg productImg;

    public CompanyProduct(Integer companyProductId, Integer companyId, String name, String info, ProductImg productImg) {
        this.companyProductId = companyProductId;
        this.companyId = companyId;
        this.name = name;
        this.info = info;
        this.productImg = productImg;
    }

    public CompanyProduct() {
    }

    public ProductImg getProductImg() {
        return productImg;
    }

    public void setProductImg(ProductImg productImg) {
        this.productImg = productImg;
    }

    public Integer getCompanyProductId() {
        return companyProductId;
    }

    public void setCompanyProductId(Integer companyProductId) {
        this.companyProductId = companyProductId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
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
                ", productImg=" + productImg +
                '}';
    }
}
