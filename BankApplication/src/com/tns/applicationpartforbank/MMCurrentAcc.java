package com.tns.applicationpartforbank;

import tns.framework.*;

public class MMCurrentAcc extends CurrentAcc{

	
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
			super(accNo, accNm, accBal, creditLimit);
			
		}
	
	public void withdrew(float wd) {
			super.withdrew(wd);
		}
	
	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}