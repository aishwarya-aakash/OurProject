package com.ppFormApp.FormApp.Model;

import lombok.Data;

import javax.persistence.*;
@Entity
@Data
public class FileDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    long id;
    @Column(name = "NAME")
    String fileName;
    @Lob
    @Column(name = "CONTENT")
    String content;
    @Column(name = "FILETYPE")
    private String contentype;
    @Column(name = "PASSPORT_NUM")
    private String passportNum;

}
