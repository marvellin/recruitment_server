package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.OSSFile;
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
class OSSFileMapperTest {
    @Autowired
    OSSFileMapper mapper;

    @Test
    void getOSSFileByossId() {
        System.out.println(mapper.getOSSFileByossId(1));
    }

    @Test
    void insertOSSFile() {
        OSSFile tmp = new OSSFile(0,0,"/url","pnt","recuirm","test");
        mapper.insertOSSFile(tmp);
    }

    @Test
    void deleteByossId() {
        mapper.deleteByossId(2);
    }
}