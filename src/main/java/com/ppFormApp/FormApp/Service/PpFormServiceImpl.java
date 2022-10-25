package com.ppFormApp.FormApp.Service;

import com.ppFormApp.FormApp.DAO.PpFormDao;
import com.ppFormApp.FormApp.DTO.CommonResponseDTO;
import com.ppFormApp.FormApp.DTO.UserDTO;
import com.ppFormApp.FormApp.Model.UserDetails;
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
