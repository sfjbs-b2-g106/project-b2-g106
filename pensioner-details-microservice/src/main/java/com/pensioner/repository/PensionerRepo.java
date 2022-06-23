package com.pensioner.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pensioner.entity.PensionerDetail;

public interface PensionerRepo extends JpaRepository<PensionerDetail, String>{

}
