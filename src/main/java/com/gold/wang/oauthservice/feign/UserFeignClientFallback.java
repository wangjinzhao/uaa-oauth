package com.gold.wang.oauthservice.feign;


import com.gold.wang.oauthservice.domain.User;

public class UserFeignClientFallback implements UserFeignClient {

    @Override
    public User findById(Long id) {
        return null;
    }
}
