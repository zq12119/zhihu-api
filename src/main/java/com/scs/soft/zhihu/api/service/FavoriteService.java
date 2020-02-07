package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Favorite;

import java.util.List;
import java.util.Map;

/**
 * @author zhgqan
 */
public interface FavoriteService {
    /**
     * 查询最新收藏
     * @return
     */
    List<Favorite> selectRecentFavorite();

    /**
     * 查询所有收藏
     * @return
     */
    List<Map> selectAllFavorite();

    /**
     * 分页
     * @param currentPage
     * @param count
     * @return
     */
    List<Favorite> selectFavoriteByPage(int currentPage, int count);
}
