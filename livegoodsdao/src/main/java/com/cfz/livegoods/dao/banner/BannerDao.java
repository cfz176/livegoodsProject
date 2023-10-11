package com.cfz.livegoods.dao.banner;

import org.springframework.boot.Banner;

import java.util.List;

/**
 * 轮播图数据访问接口
 */
public interface BannerDao {

    //查询轮播同，查询前8条
    List<Banner> findBanner();

    //新增轮播图
    void insertBanner(Banner banner);


}
