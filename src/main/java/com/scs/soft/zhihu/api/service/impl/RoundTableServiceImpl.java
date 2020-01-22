package com.scs.soft.zhihu.api.service.impl;
import com.scs.soft.zhihu.api.entity.RoundTable;
import com.scs.soft.zhihu.api.mapper.RoundTableMapper;
import com.scs.soft.zhihu.api.service.RoundTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author zhsgqan
 */
@Service
public class RoundTableServiceImpl implements RoundTableService {
    /***注入mapper对象**/
    @Resource
    private RoundTableMapper roundTableMapper;
    @Override
    public List<Map> selectAllRound() {
        return roundTableMapper.selectAllRound();
    }

    @Override
    public List<RoundTable> selectRecentRound() {
        return roundTableMapper.selectRecentRound();
    }
}
