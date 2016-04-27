package com.natevory.kata.fizzier;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringFactorReactorTest {

	
	@Test
	public void whenStringFactorReactorIsPassedAFactorItShouldReact(){
		StringFactorReactor fizzFactorReactor = new StringFactorReactor("fizz",3);
		assertEquals("fizzFactorReactor should return 'fizz' when passed 3","fizz",fizzFactorReactor.react(3));
		assertEquals("fizzFactorReactor should return 'fizz' when passed 6","fizz",fizzFactorReactor.react(6));
		assertEquals("fizzFactorReactor should return 'fizz' when passed 9","fizz",fizzFactorReactor.react(9));
	}
	
	@Test
	public void whenStringFactorReactoIsPassedANonFactorItShouldNotReact(){
		StringFactorReactor fizzFactorReactor = new StringFactorReactor("fizz",3);
		assertNull("fizzFactorReact should return null when Passed 2",fizzFactorReactor.react(2));
		assertNull("fizzFactorReact should return null when Passed 4",fizzFactorReactor.react(4));
		assertNull("fizzFactorReact should return null when Passed 5",fizzFactorReactor.react(5));
		assertNull("fizzFactorReact should return null when Passed 11",fizzFactorReactor.react(11));
	}
}
