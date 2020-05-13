package com.saumya.fun.core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "user_info")
@NamedQueries(
        {
                @NamedQuery(
                        name = "com.saumya.fun.core.UserInfo.findAll",
                        query = "SELECT p FROM UserInfo p"
                )
        })
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;
    
    @Column(name = "password")
    private String password;

    @Column(name = "last_login", nullable = false)
    private Date lastLoggedIn;
    
    @Column(name = "google_token")
    private String googleToken;
    
    @Column(name = "fb_token")
    private String fbToken;
    
    @Column(name = "state", nullable = false)
    private String state;
    
    @Column(name = "created_date", nullable = false)
    private Date createdDate;
    
    public UserInfo() {
    }


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}




	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Date getLastLoggedIn() {
		return lastLoggedIn;
	}


	public void setLastLoggedIn(Date lastLoggedIn) {
		this.lastLoggedIn = lastLoggedIn;
	}


	public String getGoogleToken() {
		return googleToken;
	}


	public void setGoogleToken(String googleToken) {
		this.googleToken = googleToken;
	}


	public String getFbToken() {
		return fbToken;
	}


	public void setFbToken(String fbToken) {
		this.fbToken = fbToken;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

  

   
	
}
