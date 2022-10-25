package com.ppFormApp.FormApp.DTO;

import lombok.Data;

import java.util.Map;

@Data
public class CommonResponseDTO {

    private String status;
    private Map<String,Object> payload;

}
