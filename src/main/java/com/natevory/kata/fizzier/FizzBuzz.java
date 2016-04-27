package com.natevory.kata.fizzier;

public class FizzBuzz {
	
	private NumberReactor reactor;
	
	public FizzBuzz(){
		StringFactorReactor fizzbuzzReactor = new StringFactorReactor("fizzbuzz",15);
		StringFactorReactor fizzReactor = new StringFactorReactor("fizz",3);
		StringFactorReactor buzzReactor = new StringFactorReactor("buzz",5);
		EchoNumberReactor defaultReactor = new EchoNumberReactor();
		this.reactor = new CompoundNumberReactor(fizzbuzzReactor,fizzReactor,buzzReactor,defaultReactor);
	}
	
	public String fizz(Number number){
		return reactor.react(number);
	}
}
