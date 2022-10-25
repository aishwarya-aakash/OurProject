package com.ppFormApp.FormApp.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ppFormApp.FormApp.DTO.CommonResponseDTO;
import com.ppFormApp.FormApp.DTO.UserDTO;
import com.ppFormApp.FormApp.Model.FileDetails;
import com.ppFormApp.FormApp.Model.UserDetails;
import com.ppFormApp.FormApp.Service.PpFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@RestController("/ppForm")
public class PpFormController {

    @Autowired
    PpFormService ppFormService;

    @PostMapping("/addUser")
    public CommonResponseDTO addUser(@RequestPart("files") MultipartFile[] files, @RequestPart("userdets") String userdet){
        try{
            ObjectMapper mapper=new ObjectMapper();
            UserDTO userdets=new UserDTO();
            userdets=mapper.readValue(userdet,UserDTO.class);
            List<FileDetails> fileList= new ArrayList<>();
            for(MultipartFile file:files) {
                FileDetails filedto = new FileDetails();
                filedto.setContentype(file.getContentType());
                filedto.setFileName(file.getOriginalFilename());
                filedto.setContent(new String(file.getBytes(), StandardCharsets.UTF_8));
                filedto.setPassportNum(userdets.getPassportNumber());
                fileList.add(filedto);
            }
            userdets.setFileList(fileList);
            return ppFormService.addUser(userdets);
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @GetMapping("/getUsers")
    public List<UserDetails> getUsers(){
        return ppFormService.getUsers();
    }
}
