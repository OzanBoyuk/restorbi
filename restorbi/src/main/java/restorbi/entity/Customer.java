package restorbi.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import restorbi.core.BasicModel;

@Entity
public class Customer extends BasicModel {

	@Column(name="c_name")
	private String name="";
	
	@Column(name="c_surname")
	private String surname="";
	
	@Column(name="c_phone")
	private String phone="";
	
	@Column(name="c_address")
	private String address="";
	
	@Column(name="c_birthday")
	private Date birthDate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	
	
}
