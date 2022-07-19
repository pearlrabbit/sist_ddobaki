package com.example.demo.vo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Entity
@Data
@Table(name="userinfo")
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo{
	@Id
	private int user_num;
	
	@Column(columnDefinition="varchar2(3000)", nullable = false, unique=true)
	private String user_id;

	@Column(columnDefinition="varchar2(3000)", nullable = false)
	private String user_pwd;

	@Column(columnDefinition="varchar2(3000)", nullable = false)
	private String user_nick;

	@Column(columnDefinition="varchar2(3000)", nullable = false)
	private String user_phone;	

	@Column(columnDefinition="varchar2(3000)", nullable = true)
	private String user_file;
	
	//private MultipartFile uploadFile;
	
	@Column
	private String user_role;
	
	@JsonIgnore
	@OneToMany(mappedBy="userinfo", cascade=CascadeType.REMOVE, fetch=FetchType.LAZY)
	private List<Dog> dog;
	
	@JsonIgnore
	@OneToMany(mappedBy="userinfo", cascade=CascadeType.REMOVE, fetch=FetchType.LAZY)
	private List<Board> board;
	
	@JsonIgnore
	@OneToMany(mappedBy="userinfo", cascade=CascadeType.REMOVE, fetch=FetchType.LAZY)
	private List<Reply> reply;

	@JsonIgnore
	@OneToMany(mappedBy="userinfo", cascade=CascadeType.REMOVE, fetch=FetchType.LAZY)
	private List<Plan> plan;

	@JsonIgnore
	@OneToMany(mappedBy="userinfo", cascade=CascadeType.REMOVE, fetch=FetchType.LAZY)
	private List<Dibs> dibs;

	@JsonIgnore
	@OneToMany(mappedBy="userinfo", cascade=CascadeType.REMOVE, fetch=FetchType.LAZY)
	private List<Reservation> reservation;
	
	@JsonIgnore
	@OneToMany(mappedBy="userinfo", cascade=CascadeType.REMOVE, fetch=FetchType.LAZY)
	private List<Payment> payment;
	
	/* Service 사용시 주석 풀어서 사용!
	@OneToMany(mappedBy="userinfo", fetch=FetchType.EAGER)
	private List<Service> service;
	*/
}
