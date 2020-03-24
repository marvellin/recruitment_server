package cn.edu.scau.linyuanbin.recruitment.mapper;

import cn.edu.scau.linyuanbin.recruitment.domain.MemberImg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: linyuanbin
 * @Description:
 * 公司负责人照片对象
 * 1.根据memberImgId
 * 2.根据companyMemberId
 * 3.更新对象
 * 4.新增对象
 * @Date: Created in 23:30 2020/3/22
 */
@Mapper
public interface MemberImgMapper {
    /*
    *根据memberImgId
    * */
    public MemberImg getMemberImgBymemberImgId(@Param("memberImgId")Integer memberImgId);

    /*
     *根据companyMemberId
     * */
    public MemberImg getMemberImgBycompanyMemberId(@Param("companyMemberId")Integer companyMemberId);

    /*
     *更新对象
     * */
    public void updateMemberImg(@Param("memberImg")MemberImg memberImg);

    /*
     *新增对象
     * */
    public int insertMemberImg(@Param("memberImg")MemberImg memberImg);
}
