package com.api.automation.enums;

public enum CalenderMonth {
	
	JAN("1"),
	Feb("2"),
	MAR("3"),
	APR("4"),
	MAY("5"),
	JUN("6"),
	JUL("7"),
	AUG("8"),
	SEP("9"),
	OCT("10"),
	NOV("11"),
	DEC("12");
	
private String monthvalue;

	CalenderMonth(String monthvalue) {
		this.monthvalue=monthvalue;
	}
	
	public String getMonthValue() {
        return monthvalue;
    }

	

}
