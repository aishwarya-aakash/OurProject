package com.ppFormApp.formapp.service;

import com.ppFormApp.formapp.dto.CommonResponseDTO;
import com.ppFormApp.formapp.dto.UserDTO;
import com.ppFormApp.formapp.model.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PpFormService {

    CommonResponseDTO addUser(UserDTO userDets);

    List<UserDetails> getUsers();
}
