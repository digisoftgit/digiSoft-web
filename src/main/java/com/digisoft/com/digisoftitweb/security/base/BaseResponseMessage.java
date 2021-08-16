package com.digisoft.com.digisoftitweb.security.base;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.sql.Timestamp;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponseMessage<T> {
    private Date date = new Timestamp(new Date().getTime());

    private Boolean isSuccess;
    private HttpStatus status;
    private int statusCode;
    private String message;
    private T data;
}