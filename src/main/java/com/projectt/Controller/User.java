/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectt.Controller;

import javax.persistence.*;




@Entity
public class User {

 private Integer no_of_buy=0;
     private boolean haveoffer=false;
    public boolean isHaveoffer() {
		return haveoffer;
	}

	public void setHaveoffer(boolean haveoffer) {
		this.haveoffer = haveoffer;
	}

	public Integer getNo_of_buys() {
		return no_of_buy;
	}

	public void setNo_of_buys(Integer no_of_buys) {
		this.no_of_buy = no_of_buys;
	}


        private int id;
	private String name ;
	private String address ;
	private String email ;
	private String gender ;
	private String country ;
	private String phone ;
	private String type ;
	private int creditCard ;
        private String username;
        private String password;
    
 public User(Integer id ,String name,String address , String email , String gender , String country , String phone , String type , int creditCard, String username, String password) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gender = gender ;
        this.email = email ;
        this.country = country ;
        this.phone = phone ;
        this.type = type ;
        this.creditCard = creditCard ;
        this.username = username ;
        this.password = password;
    }

    public User() {
       id =0;
       name = null;
       address = null;
       gender = null;
       email = null;
       phone = null;
       country = null;
       type = null;
       creditCard = 0;
       username = null;
       password = null;
    }
 
   
  @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public String getType() {
        return type;
    }

    public void setType(String  type) {
        this.type = type;
    }
    
}
