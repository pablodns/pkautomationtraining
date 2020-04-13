package com.enums;

public enum Browsers {
	CHROME("THIS IS CHROME"), FIREFOX("THIS IS Firefox"), SAFARI("Safari"), EDGE("EDGE"), IE("EI");
	
	String value;
	
	Browsers(String value){
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}
	
}
