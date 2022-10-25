package com.ppFormApp.FormApp.Repository;

import com.ppFormApp.FormApp.Model.FileDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileDetailsRepository extends JpaRepository<FileDetails,Long> {
}
