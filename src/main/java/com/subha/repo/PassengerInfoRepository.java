package com.subha.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subha.entity.PassengerInfo;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo, Integer>{

}
