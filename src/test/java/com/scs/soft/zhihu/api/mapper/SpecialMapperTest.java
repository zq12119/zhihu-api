package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.entity.Special;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@SpringBootTest(classes = ZhihuApiApplication.class)
class SpecialMapperTest {
    @Resource
    private SpecialMapper specialMapper;

    @Test
    void selectAll(){
        List<Map> specials=specialMapper.selectAll();
        specials.forEach(System.out::println);
    }

    @Test
    void selectRecent(){
        List<Special> specials=specialMapper.selectRecent();
        specials.forEach(System.out::println);
    }
}