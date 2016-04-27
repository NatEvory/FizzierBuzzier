package com.natevory.kata.fizzier;

public class EchoNumberReactor implements NumberReactor{

	public String react(Number number) {
		return number.toString();
	}

}
