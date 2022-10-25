package com.ppFormApp.formapp.dao;

import com.ppFormApp.formapp.dto.CommonResponseDTO;
import com.ppFormApp.formapp.dto.UserDTO;
import com.ppFormApp.formapp.model.UserDetails;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PpFormDao {

    CommonResponseDTO addUser(UserDTO userDeets);

    List<UserDetails> getUsers();
}
