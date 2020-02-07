package com.scs.soft.zhihu.api.service.impl;

import com.scs.soft.zhihu.api.entity.Favorite;
import com.scs.soft.zhihu.api.mapper.FavoriteMapper;
import com.scs.soft.zhihu.api.service.FavoriteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
/**
 * @author zhgqan
 */
@Service
public class FavoriteServiceImpl implements FavoriteService {
    /***注入mapper对象**/
    @Resource
    private FavoriteMapper favoriteMapper;
    @Override
    public List<Map> selectAllFavorite() {
        return favoriteMapper.selectAllFavorite();
    }

    @Override
    public List<Favorite> selectRecentFavorite() {
        return favoriteMapper.selectRecentFavorite();
    }

    @Override
    public List<Favorite> selectFavoriteByPage(int currentPage, int count) {
        int dealCount = (currentPage -1) * count;
        return favoriteMapper.selectByPage(dealCount,count);
    }
}
