/*
 * 公司产品图片对象
 * */
package cn.edu.scau.linyuanbin.recruitment.domain;

public class ProductImg {
    private Integer productImgId;
    private Integer companyProductId;
    private Integer ossId;

    private OSSFile ossFile;

    public ProductImg(Integer productImgId, Integer companyProductId, Integer ossId, OSSFile ossFile) {
        this.productImgId = productImgId;
        this.companyProductId = companyProductId;
        this.ossId = ossId;
        this.ossFile = ossFile;
    }

    public ProductImg() {
    }

    public OSSFile getOssFile() {
        return ossFile;
    }

    public void setOssFile(OSSFile ossFile) {
        this.ossFile = ossFile;
    }

    public Integer getProductImgId() {
        return productImgId;
    }

    public void setProductImgId(Integer productImgId) {
        this.productImgId = productImgId;
    }

    public Integer getCompanyProductId() {
        return companyProductId;
    }

    public void setCompanyProductId(Integer companyProductId) {
        this.companyProductId = companyProductId;
    }

    public Integer getOssId() {
        return ossId;
    }

    public void setOssId(Integer ossId) {
        this.ossId = ossId;
    }

    @Override
    public String toString() {
        return "ProductImg{" +
                "productImgId=" + productImgId +
                ", companyProductId=" + companyProductId +
                ", ossId=" + ossId +
                ", ossFile=" + ossFile +
                '}';
    }
}
