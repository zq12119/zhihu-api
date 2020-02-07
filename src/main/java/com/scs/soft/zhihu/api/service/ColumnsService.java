package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Columns;
import com.scs.soft.zhihu.api.mapper.ColumnsMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


public interface ColumnsService {
    /**
     * 查看专栏
     *
     * @return
     */

    List<Columns> selectColumns();

    /**
     * 查看所有专l
     * @return
     */

    List<Map> selectAllColumns();
}
