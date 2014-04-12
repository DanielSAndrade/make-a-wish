package com.ciandt.hackathon.entity;

public enum ItemType {
	
	BALLOON("Balloon"), DREAM("Dream");
	
	private String typeCode;
	 
	private ItemType(String s) {
		typeCode = s;
	}
 
	public String getTypeCode() {
		return typeCode;
	}

}
