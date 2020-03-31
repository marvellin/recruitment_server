package cn.edu.scau.linyuanbin.recruitment.controller.imgController;

import cn.edu.scau.linyuanbin.recruitment.domain.MemberImg;
import cn.edu.scau.linyuanbin.recruitment.domain.OSSFile;
import cn.edu.scau.linyuanbin.recruitment.domain.ProductImg;
import cn.edu.scau.linyuanbin.recruitment.domain.ResponseObject;
import cn.edu.scau.linyuanbin.recruitment.service.service.CompanyMemberService;
import cn.edu.scau.linyuanbin.recruitment.service.service.MemberImgService;
import cn.edu.scau.linyuanbin.recruitment.service.service.OSSFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: linyuanbin
 * @Description:
 * test done
 * @Date: Created in 19:29 2020/3/25
 */
@RestController
@RequestMapping("/memberImg")
public class MemberImgController {
    @Autowired
    MemberImgService service;

    @Autowired
    OSSFileService ossFileService;

    @Autowired
    CompanyMemberService companyMemberService;

    /*
     * 根据companyMemberId获得文件，下载返回给前台
     * */
    @RequestMapping("/download")
    public void download(HttpServletResponse response,@RequestParam("companyMemberId")Integer companyMemberId) throws IOException {
        MemberImg memberImg = service.getMemberImgBycompanyMemberId(companyMemberId);
        if (memberImg == null || memberImg.getOssFile() == null){
//            return new ResponseObject(ResponseObject.ERROR,"获取失败",null);
            return;
        }
        OSSFile ossFile = memberImg.getOssFile();
        if (ossFile.getFileUrl()==null){
            return;
        }
        ossFileService.down(ossFile.getFileUrl(),response.getOutputStream());
//        return new ResponseObject(ResponseObject.OK,"下载成功!",null);
    }

    /*
     * 上传公司负责人图片，先判断是否有对应companyMember，再判断是否有memberImg对象，如果有则更新，没有则插入
     * @Param MultipartFile file文件目标
     * @Param Integer companyMemberId对应公司负责人
     * @Param Integer userId对应用户（用于文件保存路径的生成）
     * */
    @RequestMapping("/upload")
    @ResponseBody
    public void upload(@RequestParam("file") MultipartFile file, @RequestParam("companyMemberId")Integer companyMemberId, @RequestParam("userId")Integer userId, HttpServletResponse response) throws IOException {
        if (companyMemberService.getCompanyMemberBycompanyMemberId(companyMemberId) == null){
//            return new ResponseObject(ResponseObject.ERROR,"上传失败！",null);
            return;
        }
        OSSFile ossFile =  ossFileService.upload(file,userId,"公司负责人照片",response.getOutputStream());

        MemberImg memberImg = service.getMemberImgBycompanyMemberId(companyMemberId);
        if(memberImg != null){
            memberImg.setOssId(ossFile.getOssId());
            service.updateMemberImg(memberImg);
        }
        else {
            memberImg = new MemberImg();
            memberImg.setCompanyMemberId(companyMemberId);
            memberImg.setOssId(ossFile.getOssId());
            service.insertMemberImg(memberImg);
        }
//        return new ResponseObject(ResponseObject.OK,"上传成功！",memberImg);
    }
}
