package cn.edu.scau.linyuanbin.recruitment.service.impl;

import cn.edu.scau.linyuanbin.recruitment.domain.Position;
import cn.edu.scau.linyuanbin.recruitment.mapper.PositionMapper;
import cn.edu.scau.linyuanbin.recruitment.service.service.PositionService;
import cn.edu.scau.linyuanbin.recruitment.utils.MyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:23 2020/3/25
 */
@Service("positionService")
public class PositionServiceImpl implements PositionService {
    @Autowired
    PositionMapper mapper;

    @Override
    public List<Position> getPositionListByFuzzyQuery(String positionName) {
        return mapper.getPositionListByFuzzyQuery(positionName);
    }

    @Override
    public Position getPositionBypositionId(Integer positionId) {
        return mapper.getPositionBypositionId(positionId);
    }

    @Override
    public List<Position> getPositionListBycompanyId(Integer companyId) {
        return mapper.getPositionListBycompanyId(companyId);
    }

    @Override
    public int insertPosition(Position position) {
        String releaseTime = MyUtil.getFormatTime();
        position.setReleaseTime(releaseTime);
        return mapper.insertPosition(position);
    }

    @Override
    public void deleteBypositionId(Integer positionId) {
        mapper.deleteBypositionId(positionId);
    }

    @Override
    public void updatePosition(Position position) {
        mapper.updatePosition(position);
    }

    @Override
    public List<Position> getOnlinePositionListByCompanyId(Integer companyId) {
        return mapper.getOnlinePositionListByCompanyId(companyId);
    }

    @Override
    public List<Position> getOfflinePositionListByCompanyId(Integer companyId) {
        return mapper.getOfflinePositionListByCompanyId(companyId);
    }

    @Override
    public void updatePositionStatusTo1BypositionId(Integer positionId) {
        mapper.updatePositionStatusTo1BypositionId(positionId);
    }

    @Override
    public void updatePositionStatusTo0BypositionId(Integer positionId) {
        mapper.updatePositionStatusTo0BypositionId(positionId);
    }
}
