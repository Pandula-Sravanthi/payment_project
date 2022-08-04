package com.PaymentSystem.domain;

import java.util.Objects;

public class customeruser {
	private String udername,customerid,userpassword;
	private Long userid;
	public String getUdername() {
		return udername;
	}
	public void setUdername(String udername) {
		this.udername = udername;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	@Override
	public int hashCode() {
		return Objects.hash(customerid, udername, userid, userpassword);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		customeruser other = (customeruser) obj;
		return Objects.equals(customerid, other.customerid) && Objects.equals(udername, other.udername)
				&& Objects.equals(userid, other.userid) && Objects.equals(userpassword, other.userpassword);
	}
	@Override
	public String toString() {
		return "customeruser [udername=" + udername + ", customerid=" + customerid + ", userpassword=" + userpassword
				+ ", userid=" + userid + "]";
	}
	
	

}
