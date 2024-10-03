package com.xworkz.constant;

public enum SeatType {
	
	RECLINER ("R13"),PREMIUM ("P13"),EXECUTIVE ("P14");
	
	private String seatNo;
	
	private SeatType(String seatNo) {
        this.seatNo = seatNo;
    }
	
	public String getSeatNo() {
        return seatNo;
    }
}
	

