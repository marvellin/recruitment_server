package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.ProductImg;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:12 2020/3/25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class ProductImgMapperTest {
    @Autowired
    ProductImgMapper mapper;

    @Test
    void getProductImgByproductImgId() {
        System.out.println(mapper.getProductImgByproductImgId(1));
    }

    @Test
    void getProductImgBycompanyProductId() {
        System.out.println(mapper.getProductImgBycompanyProductId(3));
    }

    @Test
    void insertProductImg() {
        ProductImg tmp = new ProductImg(0,11,12,null);
        mapper.insertProductImg(tmp);
    }

    @Test
    void updateProductImg() {
        ProductImg tmp =  mapper.getProductImgByproductImgId(5);
        tmp.setOssId(11);
        mapper.updateProductImg(tmp);
    }
}