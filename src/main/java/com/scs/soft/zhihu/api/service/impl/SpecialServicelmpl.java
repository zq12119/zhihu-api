package com.scs.soft.zhihu.api.service.impl;

import com.scs.soft.zhihu.api.entity.Special;
import com.scs.soft.zhihu.api.mapper.SpecialMapper;
import com.scs.soft.zhihu.api.service.SpecialService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**要加Service的注解不然会显示无法初始化**/
@Service
public class SpecialServicelmpl implements SpecialService {
    @Resource
    /***注入mapper对象**/
    private SpecialMapper specialMapper;
    @Override
    public List<Map> selectAll() {
        /**调用相应的同名方法**/
        return specialMapper.selectAll();
    }

    @Override
    public List<Special> selectRecent() {
        return specialMapper.selectRecent();
    }
}
