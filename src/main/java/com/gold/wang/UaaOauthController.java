package com.gold.wang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class UaaOauthController {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping(value = "/user/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User user = userFeignClient.findById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
