package com.ppFormApp.formapp.dto;

import com.ppFormApp.formapp.model.FileDetails;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class UserDTO {

    private String rowId;
    private String name;
    private Date dob;
    private Character gender;
    private String passportNumber;
    private String passportIssuePlace;
    private Date issueDate;
    private Date expiryDate;
    private String passportCountry;
    private String residenceCountry;
    private String address;
    private String city;
    private String district;
    private String postCode;
    private String addressCountry;
    private String ukIdCardNo;
    private String ukNIN;
    private String nIDCardNo;
    private List<FileDetails> fileList;

}
