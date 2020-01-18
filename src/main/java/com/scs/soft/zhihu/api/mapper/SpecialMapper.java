package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.Special;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;


import java.util.Date;
import java.util.List;
import java.util.Map;

public interface SpecialMapper {
/**
 *查询最新专题
 * @return List<Special>
 */
@Select("SELECT * FROM t_special ORDER BY updated DESC LIMIT 0,4 ")
List<Special> selectRecent();

/**
 *查询所有专题
 * @return List<Map>
 */
@Select("SELECT * FROM t_special ")
@Results({
        /***对应的属性表和一些属性的内容**/
        @Result(id = true,property = "specialId", column = "special_id", javaType = String.class),
        @Result(property = "title",column = "title",javaType = String.class),
        @Result(property = "introduction",column = "introduction", javaType = String.class),
        @Result(property = "banner", column = "banner", javaType = String.class),
        /*** 浏览量和关注量*/
        @Result(property = "viewCount", column = "view_count",javaType = Integer.class),
        @Result(property = "followersCount", column = "followers_count", javaType = Integer.class),
       /**更新时间**/
        @Result(property = "updated", column = "updated", javaType = Date.class),
        /***两个表直接的相对关联** */
        @Result(property = "sections", column = "special_id",
        many = @Many(select = "com.scs.soft.zhihu.api.mapper.SectionMapper.getSectionsBySpecialId")),
})
List<Map> selectAll();
}
