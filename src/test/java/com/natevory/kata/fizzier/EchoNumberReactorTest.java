package com.natevory.kata.fizzier;

import static org.junit.Assert.*;

import org.junit.Test;


public class EchoNumberReactorTest {

	
	@Test
	public void whenEchoNumberReactorIsPassedANumberItShouldReturnThatNumber(){
		EchoNumberReactor echoNR = new EchoNumberReactor();
		assertEquals("EchoNumberReactor should return '1' when passed '1'","1",echoNR.react(1));
	}
}
