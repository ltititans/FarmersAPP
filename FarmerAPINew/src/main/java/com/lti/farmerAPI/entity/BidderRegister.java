package com.lti.farmerAPI.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="BidderRegister")
public class BidderRegister {

	
		
		
		
		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="bReg-seq")
		@SequenceGenerator(name="bReg-seq",sequenceName="bReg_seq",allocationSize=1)
		@Column(name = "bidder_id")
		private long bidder_id;
		
		@Column(name = "fullname")
		private String fullname;
		
		@Column(name = "contact_no")
		private long contact_no;
		
		@Column(name = "email_id")
		private String email_id;
		
		@Column(name = "address")
		private String address;
		
		@Column(name = "city")
		private String city;
		
		@Column(name = "state")
		private String state ;
		
		@Column(name = "pincode")
		private long  pincode;
		
		@Column(name = "account_no")
		private long account_no;
		
		@Column(name = "ifsc_code")
		private String ifsc_code ;
		
		@Column(name = "bpassword")
		private String bpassword;

		public long getBidder_id() {
			return bidder_id;
		}

		public void setBidder_id(long bidder_id) {
			this.bidder_id = bidder_id;
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

		public String getBpassword() {
			return bpassword;
		}

		public void setBpassword(String bpassword) {
			this.bpassword = bpassword;
		}

		@Override
		public String toString() {
			return "BidderRegister [bidder_id=" + bidder_id + ", fullname=" + fullname + ", contact_no=" + contact_no
					+ ", email_id=" + email_id + ", address=" + address + ", city=" + city + ", state=" + state
					+ ", pincode=" + pincode + ", account_no=" + account_no + ", ifsc_code=" + ifsc_code
					+ ", bpassword=" + bpassword + "]";
		}
		
		
		
		

}
