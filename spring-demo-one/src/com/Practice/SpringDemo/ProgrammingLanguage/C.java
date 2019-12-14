package com.Practice.SpringDemo.ProgrammingLanguage;

public class C implements Language {

	private Type type;
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "C programming language";
	}
	
	public void setType(Type type) {
		this.type = type;
	}
	
	@Override
	public String getType() {
		return this.type.getType();
	}

}
