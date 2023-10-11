package com.cfz.livegoods.banner.service.controller;

import com.cfz.livegoods.banner.serviceapi.BannerServiceApi;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class BannerServiceController implements BannerServiceApi {

    @Override
    public Map<String, Object> getBanners() {
        return null;
    }
}
