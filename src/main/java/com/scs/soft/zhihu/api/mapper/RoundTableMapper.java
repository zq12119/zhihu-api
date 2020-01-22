package com.scs.soft.zhihu.api.mapper;
import com.scs.soft.zhihu.api.entity.RoundTable;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import java.util.List;
import java.util.Map;

/**
 * @author zhgqan
 */
public interface RoundTableMapper {
/**
 * 查看圆桌讨论
 * @return
 */
@Select("SELECT * FROM t_round_table ORDER BY include_count DESC LIMIT 0,4")
     List<RoundTable> selectRecentRound();
/**
 * 查看所有圆桌
 */
@Select("SELECT * FROM t_round_table")
    @Results({
            @Result(id=true,property = "id",column = "id",javaType = Integer.class),
            @Result(property ="name",column = "name",javaType = String.class),
            @Result(property = "banner",column = "banner",javaType = String.class),
            @Result(property = "tinyBanner",column = "tiny_banner",javaType = String.class),
            @Result(property = "urlToken",column = "url_token",javaType = String.class),
            @Result(property = "visitsCount",column = "visits_count",javaType = Integer.class),
            @Result(property = "includeCount",column = "include_count",javaType = Integer.class),
    })
List<Map> selectAllRound();
}
