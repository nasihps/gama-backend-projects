package com.ust.rest_jpa_sql.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyErrorResponse {

    private String message;
    private String errorCode;
    private Date time;

}

