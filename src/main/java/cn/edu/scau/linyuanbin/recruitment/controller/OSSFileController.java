package cn.edu.scau.linyuanbin.recruitment.controller;

import cn.edu.scau.linyuanbin.recruitment.domain.OSSFile;
import cn.edu.scau.linyuanbin.recruitment.service.service.OSSFileService;
import cn.edu.scau.linyuanbin.recruitment.utils.OSSUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:29 2020/3/25
 */
@RestController
@RequestMapping("/oss")
public class OSSFileController {
    @Autowired
    OSSFileService ossFileService;

    /*upload测试*/
    @RequestMapping("/upload")
    public OSSFile upload(@RequestParam("file")MultipartFile file,@RequestParam("id")int id, HttpServletResponse response) throws IOException {
        System.out.println(id);
        return ossFileService.upload(file, response.getOutputStream());
    }

    /*download测试*/
    @RequestMapping("/download")
    public void download(HttpServletResponse response) throws IOException {
        String path = ossFileService.getOSSFileByossId(13).getFileUrl();
        ossFileService.down(path,response.getOutputStream());
    }
}
