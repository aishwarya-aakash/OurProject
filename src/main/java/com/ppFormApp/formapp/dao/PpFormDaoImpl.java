package com.ppFormApp.formapp.dao;

import com.ppFormApp.formapp.constants.CommonConstants;
import com.ppFormApp.formapp.dto.CommonResponseDTO;
import com.ppFormApp.formapp.dto.UserDTO;
import com.ppFormApp.formapp.model.FileDetails;
import com.ppFormApp.formapp.model.UserDetails;
import com.ppFormApp.formapp.repository.FileDetailsRepository;
import com.ppFormApp.formapp.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class PpFormDaoImpl implements PpFormDao {

    @Autowired
    UserDetailsRepository userDetailsRepository;

    @Autowired
    FileDetailsRepository fileDetailsRepository;

    @Autowired
    CommonConstants CommonConstants;

    @Override
    public CommonResponseDTO addUser(UserDTO userDeets) {
        CommonResponseDTO resp=new CommonResponseDTO();
        UserDetails newUser=new UserDetails();
        newUser.setName(userDeets.getName());
        newUser.setDob(userDeets.getDob());
        newUser.setGender(userDeets.getGender());
        newUser.setPassportNumber(userDeets.getPassportNumber());
        newUser.setPassportIssuePlace(userDeets.getPassportIssuePlace());
        newUser.setIssueDate(userDeets.getIssueDate());
        newUser.setExpiryDate(userDeets.getExpiryDate());
        newUser.setPassportCountry(userDeets.getPassportCountry());
        newUser.setResidenceCountry(userDeets.getResidenceCountry());
        newUser.setAddress(userDeets.getAddress());
        newUser.setCity(userDeets.getCity());
        newUser.setAddressCountry(userDeets.getAddressCountry());
        newUser.setDistrict(userDeets.getDistrict());
        newUser.setPostCode(userDeets.getPostCode());
        newUser.setUkIdCardNo(userDeets.getUkIdCardNo());
        newUser.setUkNIN(userDeets.getUkNIN());
        newUser.setNIDCardNo(userDeets.getNIDCardNo());
        try {
            userDetailsRepository.save(newUser);
            for(FileDetails filedet:userDeets.getFileList()){
                fileDetailsRepository.save(filedet);
            }
            resp.setStatus(CommonConstants.SUCCESS);
            Map<String,Object> pay=new HashMap<>();
            pay.put(CommonConstants.MESSAGE,newUser.getName()+" details saved successfully!!");
            resp.setPayload(pay);

        }catch(DataIntegrityViolationException v){
            resp.setStatus("Wrong Creds");
            Map<String,Object> pay=new HashMap<>();
            pay.put(CommonConstants.MESSAGE,"Application with Passport Number "+newUser.getPassportNumber()+" already exists in our records !!");
            resp.setPayload(pay);
        }
        catch (Exception e){
            e.printStackTrace();
            resp.setStatus("Error");
            Map<String,Object> pay=new HashMap<>();
            pay.put(CommonConstants.MESSAGE,"Internal server error!!");
            resp.setPayload(pay);
        }
        return resp;
    }

    @Override
    public List<UserDetails> getUsers() {
        List<UserDetails> userlist= userDetailsRepository.findAll();

        Map<String,Object> payload=new HashMap<>();
        payload.put("userList",userlist);
         CommonResponseDTO resp=new CommonResponseDTO();
         resp.setStatus(CommonConstants.SUCCESS);
         resp.setPayload(payload);
        return userlist;
    }
}
