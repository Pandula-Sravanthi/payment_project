package com.PaymentSystem.domain;

import java.util.Objects;

public class currency {
	
	private Long conversionrate;
	private String currencycode,currencyname;
	public Long getConversionrate() {
		return conversionrate;
	}
	public void setConversionrate(Long conversionrate) {
		this.conversionrate = conversionrate;
	}
	public String getCurrencycode() {
		return currencycode;
	}
	public void setCurrencycode(String currencycode) {
		this.currencycode = currencycode;
	}
	public String getCurrencyname() {
		return currencyname;
	}
	public void setCurrencyname(String currencyname) {
		this.currencyname = currencyname;
	}
	@Override
	public int hashCode() {
		return Objects.hash(conversionrate, currencycode, currencyname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		currency other = (currency) obj;
		return Objects.equals(conversionrate, other.conversionrate) && Objects.equals(currencycode, other.currencycode)
				&& Objects.equals(currencyname, other.currencyname);
	}
	@Override
	public String toString() {
		return "currency [conversionrate=" + conversionrate + ", currencycode=" + currencycode + ", currencyname="
				+ currencyname + "]";
	}
	
	

}
