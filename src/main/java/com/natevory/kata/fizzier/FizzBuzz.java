package com.natevory.kata.fizzier;

public class FizzBuzz {
	public String fizz(Number number){
		int intNumber = number.intValue();
		if(intNumber % 3 == 0)
			return "fizz";
		if(intNumber % 5 == 0)
			return "buzz";
		
		return number.toString();
	}
}
