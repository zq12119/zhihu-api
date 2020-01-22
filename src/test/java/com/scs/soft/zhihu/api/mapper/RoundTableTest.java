package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.entity.RoundTable;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;

@SpringBootTest(classes = ZhihuApiApplication.class)
public class RoundTableTest {
    @Resource
    private RoundTableMapper roundTableMapper;

    @Test
     void selectAllRound(){
        List<Map> roundTables=roundTableMapper.selectAllRound();
        roundTables.forEach(System.out::println);
    }
    @Test
    void selectRecentRound(){
        List<RoundTable> roundTables=roundTableMapper.selectRecentRound();
        roundTables.forEach(System.out::println);
    }
}
