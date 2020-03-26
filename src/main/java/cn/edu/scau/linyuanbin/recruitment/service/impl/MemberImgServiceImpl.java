package cn.edu.scau.linyuanbin.recruitment.service.impl;

import cn.edu.scau.linyuanbin.recruitment.domain.MemberImg;
import cn.edu.scau.linyuanbin.recruitment.mapper.MemberImgMapper;
import cn.edu.scau.linyuanbin.recruitment.service.service.MemberImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:23 2020/3/25
 */
@Service("memberImgService")
public class MemberImgServiceImpl implements MemberImgService {
    @Autowired
    MemberImgMapper mapper;

    @Override
    public MemberImg getMemberImgBymemberImgId(Integer memberImgId) {
        return mapper.getMemberImgBymemberImgId(memberImgId);
    }

    @Override
    public MemberImg getMemberImgBycompanyMemberId(Integer companyMemberId) {
        return mapper.getMemberImgBycompanyMemberId(companyMemberId);
    }

    @Override
    public void updateMemberImg(MemberImg memberImg) {
        mapper.updateMemberImg(memberImg);
    }

    @Override
    public int insertMemberImg(MemberImg memberImg) {
        return mapper.insertMemberImg(memberImg);
    }
}
