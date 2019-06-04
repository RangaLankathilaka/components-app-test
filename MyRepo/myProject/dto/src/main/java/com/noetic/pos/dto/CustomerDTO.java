package com.noetic.pos.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable{
	
	private String  customerId;
	
	private String  customerName;
	
	private String customerAddress;

	public CustomerDTO() {
		super();
	}

	public CustomerDTO(String customerId, String customerName, String customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	@Override
	public String toString() {
		return "CustomerDTO [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + "]";
	}
	
	

}
