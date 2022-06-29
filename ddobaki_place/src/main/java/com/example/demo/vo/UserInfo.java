package com.example.demo.vo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import lombok.Data;

@Entity
@Data
@Table(name="userinfo")
public class UserInfo {
	@Id
	private int user_num;
	
	@Column(columnDefinition="varchar2(3000)", nullable = false)
	private String user_id;
	@Column(columnDefinition="varchar2(3000)", nullable = false)
	private String user_pwd;
	@Column(columnDefinition="varchar2(3000)", nullable = false)
	private String user_nick;
	@Column(columnDefinition="varchar2(3000)", nullable = false)
	private String user_phone;	
	@Column(columnDefinition="varchar2(3000)", nullable = false)
	private String user_file;
	
	
	@OneToMany(mappedBy="userinfo", cascade=CascadeType.REMOVE, fetch=FetchType.LAZY)
	private List<Dog> dog;
	
	@OneToMany(mappedBy="userinfo", cascade=CascadeType.REMOVE, fetch=FetchType.LAZY)
	private List<Board> board;
	
	@OneToMany(mappedBy="userinfo", cascade=CascadeType.REMOVE, fetch=FetchType.LAZY)
	private List<Reply> reply;
	
	@OneToMany(mappedBy="userinfo", cascade=CascadeType.REMOVE, fetch=FetchType.LAZY)
	private List<Plan> plan;
	
	@OneToMany(mappedBy="userinfo", cascade=CascadeType.REMOVE,fetch=FetchType.LAZY)
	private List<Dibs> dibs;
	
	@OneToMany(mappedBy="userinfo", cascade=CascadeType.REMOVE, fetch=FetchType.LAZY)
	private List<Reservation> reservation;
	
	@OneToMany(mappedBy="userinfo", cascade=CascadeType.REMOVE, fetch=FetchType.LAZY)
	private List<Payment> payment;
	
	/* Service 사용시 주석 풀어서 사용!
	@OneToMany(mappedBy="userinfo", fetch=FetchType.EAGER)
	private List<Service> service;
	*/
	
	
}
