package com.PaymentSystem.domain;

import java.util.Objects;

public class customer {
 private String customerid,accountholdername,customeraddress,customercity,customertype;
 private Long overdrafting,clearbalance;
public String getCustomerid() {
	return customerid;
}
public void setCustomerid(String customerid) {
	this.customerid = customerid;
}
public String getAccountholdername() {
	return accountholdername;
}
public void setAccountholdername(String accountholdername) {
	this.accountholdername = accountholdername;
}
public String getCustomeraddress() {
	return customeraddress;
}
public void setCustomeraddress(String customeraddress) {
	this.customeraddress = customeraddress;
}
public String getCustomercity() {
	return customercity;
}
public void setCustomercity(String customercity) {
	this.customercity = customercity;
}
public String getCustomertype() {
	return customertype;
}
public void setCustomertype(String customertype) {
	this.customertype = customertype;
}
public Long getOverdrafting() {
	return overdrafting;
}
public void setOverdrafting(Long overdrafting) {
	this.overdrafting = overdrafting;
}
public Long getClearbalance() {
	return clearbalance;
}
public void setClearbalance(Long clearbalance) {
	this.clearbalance = clearbalance;
}
@Override
public int hashCode() {
	return Objects.hash(accountholdername, clearbalance, customeraddress, customercity, customerid, customertype,
			overdrafting);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	customer other = (customer) obj;
	return Objects.equals(accountholdername, other.accountholdername)
			&& Objects.equals(clearbalance, other.clearbalance)
			&& Objects.equals(customeraddress, other.customeraddress)
			&& Objects.equals(customercity, other.customercity) && Objects.equals(customerid, other.customerid)
			&& Objects.equals(customertype, other.customertype) && Objects.equals(overdrafting, other.overdrafting);
}
@Override
public String toString() {
	return "customer [customerid=" + customerid + ", accountholdername=" + accountholdername + ", customeraddress="
			+ customeraddress + ", customercity=" + customercity + ", customertype=" + customertype + ", overdrafting="
			+ overdrafting + ", clearbalance=" + clearbalance + "]";
}
 
}
