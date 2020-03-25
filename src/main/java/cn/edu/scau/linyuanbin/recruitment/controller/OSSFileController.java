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

    @RequestMapping("/upload")
    @ResponseBody
    public OSSFile upload(@RequestParam("file")MultipartFile file, HttpServletResponse response) throws IOException {
        return ossFileService.upload(file, response.getOutputStream());
    }
}
