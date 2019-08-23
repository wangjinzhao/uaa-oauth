package com.gold.wang;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "passport", fallback = UserFeignClientFallback.class)
public interface UserFeignClient {

    @GetMapping(value = "/validate/")
    User findById(@RequestParam("id") Long id);

}
