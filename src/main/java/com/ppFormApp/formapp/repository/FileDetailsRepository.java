package com.ppFormApp.formapp.repository;

import com.ppFormApp.formapp.model.FileDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileDetailsRepository extends JpaRepository<FileDetails,Long> {
}
