package com.Practice.SpringDemo.ProgrammingLanguage;

public class Java implements Language {

	private Type type;
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Java programming language";
	}
	
	public void setType(Type type) {
		this.type = type;
	}
	@Override
	public String getType() {
		return this.type.getType();
	}

}
