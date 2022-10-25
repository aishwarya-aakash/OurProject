package com.ppFormApp.FormApp.DAO;

import com.ppFormApp.FormApp.DTO.CommonResponseDTO;
import com.ppFormApp.FormApp.DTO.UserDTO;
import com.ppFormApp.FormApp.Model.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public interface PpFormDao {

    CommonResponseDTO addUser(UserDTO userDeets);

    List<UserDetails> getUsers();
}
