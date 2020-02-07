package com.scs.soft.zhihu.api.service.impl;

import com.scs.soft.zhihu.api.entity.Columns;
import com.scs.soft.zhihu.api.mapper.ColumnsMapper;
import com.scs.soft.zhihu.api.service.ColumnsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class ColumnsServiceImpl implements ColumnsService {
    @Resource
    private ColumnsMapper columnsMapper;


    @Override
    public List<Columns> selectColumns() {
        return columnsMapper.selectColumns();
    }

    @Override
    public List<Map> selectAllColumns() {
        return columnsMapper.selectAllColumns();
    }
}
