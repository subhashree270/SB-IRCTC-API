package com.subha.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="ticket")
@Data
public class TicketInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="ticket_number")
	private Integer ticketNum;
	
	@Column(name="name")
	private String name;
	
	@Column(name="doj")
	private String doj;
	
	@Column(name="from")
	private String from;
	
	@Column(name="to")
	private String to;
	
	@Column(name="train_number")
	private String trainNum;
	
	@Column(name="status")
	private String status;
	
	@CreationTimestamp
	@Column(name="created_on",updatable = false)
	private LocalDate createdOn;
	
	@UpdateTimestamp
	@Column(name="updated_on",insertable = false)
	private LocalDate updatedOn;

}
