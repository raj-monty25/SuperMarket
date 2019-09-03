package com.bj.beans;

public class ArmstrongCheck {
	
	public void isArmstrong(int number) {

		int originaNo = number;
		int remainder, result = 0;
		
		while(originaNo != 0) {
			remainder = originaNo % 10;
			result += Math.pow(remainder, 3);
			originaNo /= 10;
		}
		
		if(result == number) {
			System.out.println(number + " is a Armstrong Number.");
		}else {
			System.out.println(number + " is a Not Armstrong Number.");

		}

	}

}
