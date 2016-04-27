package com.natevory.kata.fizzier;

public abstract class AbstractFactorReactor implements NumberReactor {
	
	private int factor;
	
	protected AbstractFactorReactor(int factor){
		this.factor = factor;
	}
	
	public boolean shouldReact(Number number){
		if(number.intValue() % factor == 0)
			return true;
		return false;
	}
	
	public abstract String getReaction();
	
	
	public String react(Number number) {
		if(shouldReact(number))
			return getReaction();
		return null;
	}

}
