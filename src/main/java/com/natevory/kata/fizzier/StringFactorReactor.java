package com.natevory.kata.fizzier;

public class StringFactorReactor extends AbstractFactorReactor {

	private String reaction;
	
	public StringFactorReactor(String reaction,int factor){
		super(factor);
		this.reaction = reaction;
	}
	
	@Override
	public String getReaction() {
		return reaction;
	}

}
