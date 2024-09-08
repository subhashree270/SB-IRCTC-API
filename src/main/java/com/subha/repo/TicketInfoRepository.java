package com.subha.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subha.entity.TicketInfo;

public interface TicketInfoRepository extends JpaRepository<TicketInfo, Integer>{

}
