package com.natevory.kata.fizzier;

import java.util.ArrayList;
import java.util.List;

public class CompoundNumberReactor implements NumberReactor{

	private List<NumberReactor> reactors = new ArrayList<NumberReactor>();
	
	public CompoundNumberReactor(NumberReactor... reactors){
		for(NumberReactor reactor : reactors){
			if(reactor != null)
				this.reactors.add(reactor);
		}
	}
	
	public String react(Number number) {
		for(NumberReactor reactor: reactors){
			String reaction = reactor.react(number);
			if(reaction != null)
				return reaction;
		}
		return null;
	}

}
