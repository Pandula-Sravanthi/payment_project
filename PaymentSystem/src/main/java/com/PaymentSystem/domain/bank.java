package com.PaymentSystem.domain;

import java.util.Objects;

public class bank {
	
	private String bic,bankname;

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bankname, bic);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		bank other = (bank) obj;
		return Objects.equals(bankname, other.bankname) && Objects.equals(bic, other.bic);
	}

	@Override
	public String toString() {
		return "bank [bic=" + bic + ", bankname=" + bankname + "]";
	}
	
	

}
