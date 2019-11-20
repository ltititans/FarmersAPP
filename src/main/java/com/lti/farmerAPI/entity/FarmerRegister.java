package com.lti.farmerAPI.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="FarmerRegister")
public class FarmerRegister {
		
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="fReg-seq")
	@SequenceGenerator(name="fReg-seq",sequenceName="fReg_seq",allocationSize=1)
	@Column(name = "farmer_id")
	private long farmer_id;
	
	@Column(name = "fullname")
	private String fullname;
	
	@Column(name = "contact_no")
	private long contact_no ;
	
	@Column(name = "email_id")
	private String email_id;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "pincode")
	private long pincode;
	
	@Column(name = "land_area")
	private  String land_area;
	
	@Column(name = "land_address")
	private  String land_address;
	
	@Column(name = "land_pincode")
	private long land_pincode;
	
	@Column(name = "account_no")
	private long account_no;
	
	@Column(name = "ifsc_code")
	private  String ifsc_code;
	
	@Column(name = "fpassword")
	private  String fpassword;

	public long getFarmer_id() {
		return farmer_id;
	}

	public void setFarmer_id(long farmer_id) {
		this.farmer_id = farmer_id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public long getContact_no() {
		return contact_no;
	}

	public void setContact_no(long contact_no) {
		this.contact_no = contact_no;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public String getLand_area() {
		return land_area;
	}

	public void setLand_area(String land_area) {
		this.land_area = land_area;
	}

	public String getLand_address() {
		return land_address;
	}

	public void setLand_address(String land_address) {
		this.land_address = land_address;
	}

	public long getLand_pincode() {
		return land_pincode;
	}

	public void setLand_pincode(long land_pincode) {
		this.land_pincode = land_pincode;
	}

	public long getAccount_no() {
		return account_no;
	}

	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}

	public String getIfsc_code() {
		return ifsc_code;
	}

	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}

	public String getFpassword() {
		return fpassword;
	}

	public void setFpassword(String fpassword) {
		this.fpassword = fpassword;
	}

	@Override
	public String toString() {
		return "FarmerRegister [farmer_id=" + farmer_id + ", fullname=" + fullname + ", contact_no=" + contact_no
				+ ", email_id=" + email_id + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", pincode=" + pincode + ", land_area=" + land_area + ", land_address=" + land_address
				+ ", land_pincode=" + land_pincode + ", account_no=" + account_no + ", ifsc_code=" + ifsc_code
				+ ", fpassword=" + fpassword + "]";
	}
	
	
	

}
