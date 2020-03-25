package cn.edu.scau.linyuanbin.recruitment.service.service;

import cn.edu.scau.linyuanbin.recruitment.domain.MemberImg;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:19 2020/3/25
 */
public interface MemberImgService {
    /*
     *根据memberImgId查找
     * */
    public MemberImg getMemberImgBymemberImgId(Integer memberImgId);

    /*
     *根据companyMemberId查找
     * */
    public MemberImg getMemberImgBycompanyMemberId(Integer companyMemberId);

    /*
     *更新对象
     * */
    public void updateMemberImg(MemberImg memberImg);

    /*
     *新增对象
     * */
    public int insertMemberImg(MemberImg memberImg);
}
