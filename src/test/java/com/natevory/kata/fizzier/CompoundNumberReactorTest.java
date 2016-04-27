package com.natevory.kata.fizzier;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompoundNumberReactorTest {
	
	@Test
	public void compoundNumberReactorShouldReactWithAppropriateReactor(){
		NumberReactor fizzReactor = new StringFactorReactor("fizz", 3);
		NullNumberReactor nullReactor = new NullNumberReactor();
		NumberReactor echoReactor = new EchoNumberReactor();
		CompoundNumberReactor compoundNumberReactor = new CompoundNumberReactor(fizzReactor,nullReactor,echoReactor);
		
		assertEquals("CompoundNumberReactor should return '2' when passed 2","2",compoundNumberReactor.react(2));
		assertEquals("CompoundNumberReactor should return 'fizz' when passed 3","fizz",compoundNumberReactor.react(3));
		assertEquals("CompoundNumberReactor should return '5' when passed 5","5",compoundNumberReactor.react(5));
		assertEquals("CompoundNumberReactor should return 'fizz' when passed 9","fizz",compoundNumberReactor.react(9));
	}
}
