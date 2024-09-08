package com.subha.service;

import java.util.List;

import com.subha.entity.PassengerInfo;
import com.subha.entity.TicketInfo;

public interface IRCTCService {
	
	public TicketInfo bookTicket(PassengerInfo passenger);
	public List<TicketInfo> getAllTickets();

}
