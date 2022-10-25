package com.ppFormApp.FormApp.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="USER_DETAILS")
public class UserDetails {

    @Id
    @Column(name="ROW_ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long rowId;

    @Column(name="NAME")
    private String name;

    @Column(name="DOB")
    private Date dob;

    @Column(name="GENDER")
    private Character gender;

    @Column(unique = true,name="PASSPORT_NUMBER")
    private String passportNumber;

    @Column(name="PASSPORT_ISSUE_PLACE")
    private String passportIssuePlace;

    @Column(name="ISSUE_DATE")
    private Date issueDate;

    @Column(name="EXPIRY_DATE")
    private Date expiryDate;

    @Column(name="PASSPORT_COUNTRY")
    private String passportCountry;

    @Column(name="RESIDENCE_COUNTRY")
    private String residenceCountry;

    @Column(name="ADDRESS")
    private String address;

    @Column(name="CITY")
    private String city;

    @Column(name="DISTRICT")
    private String district;

    @Column(name="POST_CODE")
    private String postCode;

    @Column(name="ADDRESS_COUNTRY")
    private String addressCountry;

    @Column(name="UK_IDCARD_NO")
    private String ukIdCardNo;

    @Column(name="UK_NATIONAL_INSUR_NUM")
    private String ukNIN;

    @Column(name="NATIONAL_ID_CARD_NUM")
    private String nIDCardNo;



}
