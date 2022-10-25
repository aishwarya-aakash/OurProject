package com.ppFormApp.formapp.service;

import com.ppFormApp.formapp.dao.PpFormDao;
import com.ppFormApp.formapp.dto.CommonResponseDTO;
import com.ppFormApp.formapp.dto.UserDTO;
import com.ppFormApp.formapp.model.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PpFormServiceImpl implements PpFormService {

    @Autowired
    PpFormDao ppFormDao;

    @Override
    public CommonResponseDTO addUser(UserDTO userDets) {
        return ppFormDao.addUser(userDets);
    }

    @Override
    public List<UserDetails> getUsers() {
        return ppFormDao.getUsers();
    }
}
