package com.natevory.kata.fizzier;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {
	
	@Test
	public void whenFizzBuzzIsPassedANumberItShouldReturnThatNumber(){
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("FizzBuzz should return 1","1",fizzBuzz.fizz(1));
		assertEquals("FizzBuzz should return 2","2",fizzBuzz.fizz(2));
	}
	
	@Test
	public void whenFizzBuzzIsPassedAMultipleOf3ItShouldReturnFizz(){
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("FizzBuzz should return 'fizz' when passed 3","fizz",fizzBuzz.fizz(3));
		assertEquals("FizzBuzz should return 'fizz' when passed 6","fizz",fizzBuzz.fizz(6));
	}
	
	@Test
	public void whenFizzBuzzIsPassedAMultipleOf5ItShouldReturnBuzz(){
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("FizzBuzz should return 'fizz' when passed 5","buzz",fizzBuzz.fizz(5));
		assertEquals("FizzBuzz should return 'fizz' when passed 10","buzz",fizzBuzz.fizz(10));
	}
	
	@Test
	public void whenFizzBuzzIsPassedAMultipleOf3And5IthShouldReturnFizzBuzz(){
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("FizzBuzz should return 'fizz' when passed 15","fizzbuzz",fizzBuzz.fizz(15));
		assertEquals("FizzBuzz should return 'fizz' when passed 30","fizzbuzz",fizzBuzz.fizz(30));
	}
	
}
