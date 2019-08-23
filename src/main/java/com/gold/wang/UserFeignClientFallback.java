package com.gold.wang;


public class UserFeignClientFallback implements UserFeignClient {

    @Override
    public User findById(Long id) {
        return null;
    }
}
