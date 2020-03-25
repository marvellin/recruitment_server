package cn.edu.scau.linyuanbin.recruitment.config;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 1:36 2020/3/26
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class OSSConfigTest {
    @Autowired
    OSSConfig config;

    @Test
    void toString1() {
        config.toString();
    }
}