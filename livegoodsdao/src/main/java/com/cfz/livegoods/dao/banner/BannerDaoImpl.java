package com.cfz.livegoods.dao.banner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

public class BannerDaoImpl implements BannerDao{

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Banner> findBanner() {
        Query query = new Query();
        query.with(PageRequest.of(0, 8));
        List<Banner> result = this.mongoTemplate.find(query, Banner.class);
        return result;
    }

    @Override
    public void insertBanner(Banner banner) {
        this.mongoTemplate.insert(banner);
    }
}
