package com.quazar.pages;

public class ServicesPage extends BasePage {
	public ServicesPage(){
		super("services");
	}
	@Override
	public String getTemplate() {		
		return "services.htm";
	}
}
