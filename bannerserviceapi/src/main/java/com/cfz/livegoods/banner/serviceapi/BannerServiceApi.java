package com.cfz.livegoods.banner.serviceapi;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * 轮播图服务标准
 */
public interface BannerServiceApi {

    @GetMapping("/banner")
    Map<String, Object> getBanners();

}
