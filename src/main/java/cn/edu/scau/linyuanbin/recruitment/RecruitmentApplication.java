package cn.edu.scau.linyuanbin.recruitment;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class RecruitmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecruitmentApplication.class, args);
//        getscret();
    }

    /*private static void getscret(){
        String hashAlgorithmName = "md5";
        String credentials = "root";//密码
        int hashIterations = 1024;
        ByteSource credentialsSalt = ByteSource.Util.bytes("root");//账号
        String  obj = new SimpleHash(hashAlgorithmName, credentials, credentialsSalt, hashIterations).toHex();
        System.out.println(obj);
    }*/
}
