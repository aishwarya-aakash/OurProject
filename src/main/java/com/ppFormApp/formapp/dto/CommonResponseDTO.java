package com.ppFormApp.formapp.dto;

import lombok.Data;

import java.util.Map;

@Data
public class CommonResponseDTO {

    private String status;
    private Map<String,Object> payload;

}
