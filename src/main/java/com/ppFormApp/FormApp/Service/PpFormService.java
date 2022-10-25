package com.ppFormApp.FormApp.Service;

import com.ppFormApp.FormApp.DTO.CommonResponseDTO;
import com.ppFormApp.FormApp.DTO.UserDTO;
import com.ppFormApp.FormApp.Model.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PpFormService {

    CommonResponseDTO addUser(UserDTO userDets);

    List<UserDetails> getUsers();
}
