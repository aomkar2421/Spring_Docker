package com.om;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private String city = "pune";
	
	private String state = "MH";
	
	private int pincode = 412104;

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
}
