package com.PaymentSystem.domain;

import java.util.Objects;

public class logger {
	private Long loggerid,userid,employeeid;
	private String customerid,screenname,action,ipaddress;
	public Long getLoggerid() {
		return loggerid;
	}
	public void setLoggerid(Long loggerid) {
		this.loggerid = loggerid;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public Long getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(Long employeeid) {
		this.employeeid = employeeid;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getScreenname() {
		return screenname;
	}
	public void setScreenname(String screenname) {
		this.screenname = screenname;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getIpaddress() {
		return ipaddress;
	}
	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}
	@Override
	public int hashCode() {
		return Objects.hash(action, customerid, employeeid, ipaddress, loggerid, screenname, userid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		logger other = (logger) obj;
		return Objects.equals(action, other.action) && Objects.equals(customerid, other.customerid)
				&& Objects.equals(employeeid, other.employeeid) && Objects.equals(ipaddress, other.ipaddress)
				&& Objects.equals(loggerid, other.loggerid) && Objects.equals(screenname, other.screenname)
				&& Objects.equals(userid, other.userid);
	}
	@Override
	public String toString() {
		return "logger [loggerid=" + loggerid + ", userid=" + userid + ", employeeid=" + employeeid + ", customerid="
				+ customerid + ", screenname=" + screenname + ", action=" + action + ", ipaddress=" + ipaddress + "]";
	}
	
	

}
