package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.service.FavoriteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhgqan
 */
@RestController
@RequestMapping(value = "/api/favorite")
public class FavoriteController {
    @Resource
    private FavoriteService favoriteService;
    @GetMapping
    public Result getRecentFavorite(){
        return  Result.success(favoriteService.selectRecentFavorite());
    }
    @GetMapping(value = "/all")
    public Result getAllRoundTable(){
        return  Result.success(favoriteService.selectAllFavorite());
    }
    @PostMapping(value = "page")
    public Result getByPage(int currentPage, int count){
        return Result.success(favoriteService.selectFavoriteByPage(currentPage,count));
    }
}
