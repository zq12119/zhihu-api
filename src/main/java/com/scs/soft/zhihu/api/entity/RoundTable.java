package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author zhgqan
 */
@Data
@Builder
public class RoundTable {
    private Integer id;
    private String name;
    private String banner;
    private String tinyBanner;
    private String urlToken;
    private Integer visitsCount;
    private Integer includeCount;
}
