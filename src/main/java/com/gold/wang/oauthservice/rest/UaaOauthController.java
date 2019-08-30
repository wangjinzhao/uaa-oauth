package com.gold.wang.oauthservice.rest;


import com.gold.wang.oauthservice.domain.User;
import com.gold.wang.oauthservice.feign.UserFeignClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Api("用户服务")
@RestController
public class UaaOauthController {

    @Autowired
    private UserFeignClient userFeignClient;

    @ApiOperation(value="用户服务")
    @GetMapping(value = "/api/user/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User user = userFeignClient.findById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
