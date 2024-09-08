package com.subha.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subha.entity.PassengerInfo;
import com.subha.entity.TicketInfo;
import com.subha.repo.PassengerInfoRepository;
import com.subha.repo.TicketInfoRepository;

@Service
public class IRCTCServiceImpl implements IRCTCService{
	@Autowired
	private PassengerInfoRepository  passengerRepo;
	
	@Autowired
	private TicketInfoRepository ticketRepo;
	
	Random r=new Random();
	
	@Override
	public TicketInfo bookTicket(PassengerInfo passenger) {
		passengerRepo.save(passenger);
		TicketInfo ticketInfo=new TicketInfo();
		int i = r.nextInt(100);
		ticketInfo.setTicketNum(i);
		ticketInfo.setStatus("confirmed");
		BeanUtils.copyProperties(passenger, ticketInfo);
		TicketInfo ticket = ticketRepo.save(ticketInfo);
		return ticket;
	}
	
	@Override
	public List<TicketInfo> getAllTickets() {
		List<TicketInfo> allTickets = ticketRepo.findAll();
		return allTickets;
	}
	

}
