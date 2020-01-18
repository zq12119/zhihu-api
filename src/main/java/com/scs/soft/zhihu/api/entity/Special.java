package com.scs.soft.zhihu.api.entity;
import lombok.Builder;
import lombok.Data;
import java.util.Date;
/**
 * @author zhgqan
 * @description TODO
 * @create 2020/1/17**/
@Data
@Builder
public class Special {
    private String specialId;
    private String title;
    private String introduction;
    private String banner;
    private Integer viewCount;
    private Integer followersCount;
    private Date updated;
}
