package com.subha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subha.entity.PassengerInfo;
import com.subha.entity.TicketInfo;
import com.subha.service.IRCTCService;

@RestController
@RequestMapping("/irctc")
public class IRCTCRestController {
	@Autowired
	private IRCTCService irctcService;
	
	@PostMapping(value="/bookTicket",consumes ="application/json",produces = "application/json")
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo passenger){
		TicketInfo ticket = irctcService.bookTicket(passenger);
		return new ResponseEntity<>(ticket,HttpStatus.CREATED);
		
	}
	
	@GetMapping(value="/getTickets",produces = "application/json")
	public ResponseEntity<List<TicketInfo>> getAllTickets(){
		List<TicketInfo> allTickets = irctcService.getAllTickets();
		return new ResponseEntity<>(allTickets,HttpStatus.OK);
	}
	

}
