package com.digisoft.com.digisoftitweb.security.api;

import com.digisoft.com.digisoftitweb.security.base.BaseResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/privilege")
public interface PrivilegeApi {

    @GetMapping("/admin/all")
    ResponseEntity<BaseResponse<?>> all(@RequestHeader(name = "Authorization") String accessToken);
}
