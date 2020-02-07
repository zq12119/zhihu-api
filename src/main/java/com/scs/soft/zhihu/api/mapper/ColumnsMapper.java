package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.Columns;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface ColumnsMapper {
    /**
     * 查看专栏
     * @return
     */
    @Select("SELECT * FROM t_columns ORDER BY articles_count DESC LIMIT 0,4")
    List<Columns> selectColumns();

    /**
     * 查看所有专栏
     * @return
     */
    @Select("SELECT * FROM t_columns")
    @Results({
            @Result(id = true,property = "columnsId",column = "id",javaType = String.class),
            @Result(property = "title",column = "title",javaType = String.class),
            @Result(property = "description",column = "description",javaType = String.class),
            @Result(property = "url",column = "url",javaType = String.class),
            @Result(property = "imageUrl",column = "image_url",javaType = String.class),
            @Result(property = "followers",column = "followers",javaType = Integer.class),
            @Result(property = "articlesCount",column = "articles_count",javaType = Integer.class),

    })
    List<Map> selectAllColumns();
}
