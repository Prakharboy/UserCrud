package com.hootboard.User.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.hootboard.User.exceptions.EmptyInputException;

@Entity
@Table
public class UserInfo {
	
	@Id
	@GeneratedValue
	private Long id;

	private String firstName;

	private String lastName;
	
	@ElementCollection 
	private Set<String> emailList;
	
	@OneToMany(
		    cascade = CascadeType.ALL)
	private Set<UserAddress> addressList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<String> getEmailList() {
		return emailList;
	}

	public void setEmailList(Set<String> emailList) {
		this.emailList = emailList;
	}

	public Set<UserAddress> getAddressList() {
		return addressList;
	}

	public void setAddressList(Set<UserAddress> addressList) {
		this.addressList = addressList;
	}
	
	


public boolean validate() throws EmptyInputException
{
	try{
		if(this.getFirstName()!=null)
		return true;
		else
			throw new EmptyInputException("first name should not be null");
			
	}
	catch(Exception e)
	{
		throw new EmptyInputException("first name should not be null");
	}

	
}

public boolean validateUpdate() throws EmptyInputException
{
	try{
		if(this.getId()!=null)
		return true;
		else
			throw new EmptyInputException("Id should not be null");
			
	}
	catch(Exception e)
	{
		throw new EmptyInputException("Id should not be null");
	}


	
}


	

}
