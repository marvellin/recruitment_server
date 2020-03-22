/*
 * 公司产品图片对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class ProductImg {
    private int productImgId;
    private int companyProductId;
    private int ossId;

    public ProductImg(int productImgId, int companyProductId, int ossId) {
        this.productImgId = productImgId;
        this.companyProductId = companyProductId;
        this.ossId = ossId;
    }

    public int getProductImgId() {
        return productImgId;
    }

    public void setProductImgId(int productImgId) {
        this.productImgId = productImgId;
    }

    public int getCompanyProductId() {
        return companyProductId;
    }

    public void setCompanyProductId(int companyProductId) {
        this.companyProductId = companyProductId;
    }

    public int getOssId() {
        return ossId;
    }

    public void setOssId(int ossId) {
        this.ossId = ossId;
    }

    @Override
    public String toString() {
        return "ProductImg{" +
                "productImgId=" + productImgId +
                ", companyProductId=" + companyProductId +
                ", ossId=" + ossId +
                '}';
    }
}
