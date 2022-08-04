package com.PaymentSystem.domain;

import java.util.Objects;

public class transfertypes {
	
	
	private String transfertypecode,transfertypedescription;

	public String getTransfertypecode() {
		return transfertypecode;
	}

	public void setTransfertypecode(String transfertypecode) {
		this.transfertypecode = transfertypecode;
	}

	public String getTransfertypedescription() {
		return transfertypedescription;
	}

	public void setTransfertypedescription(String transfertypedescription) {
		this.transfertypedescription = transfertypedescription;
	}

	@Override
	public int hashCode() {
		return Objects.hash(transfertypecode, transfertypedescription);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		transfertypes other = (transfertypes) obj;
		return Objects.equals(transfertypecode, other.transfertypecode)
				&& Objects.equals(transfertypedescription, other.transfertypedescription);
	}

	@Override
	public String toString() {
		return "transfertypes [transfertypecode=" + transfertypecode + ", transfertypedescription="
				+ transfertypedescription + "]";
	}
	
	

}
