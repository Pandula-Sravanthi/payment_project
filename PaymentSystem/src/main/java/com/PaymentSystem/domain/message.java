package com.PaymentSystem.domain;

import java.util.Objects;

public class message {
	
	private String messagecode,instruction;

	public String getMessagecode() {
		return messagecode;
	}

	public void setMessagecode(String messagecode) {
		this.messagecode = messagecode;
	}

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	@Override
	public int hashCode() {
		return Objects.hash(instruction, messagecode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		message other = (message) obj;
		return Objects.equals(instruction, other.instruction) && Objects.equals(messagecode, other.messagecode);
	}

	@Override
	public String toString() {
		return "message [messagecode=" + messagecode + ", instruction=" + instruction + "]";
	}
	
	

}
