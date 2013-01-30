package com.quazar.pages;

public class AboutPage extends BasePage {	
	public AboutPage() {
		super("about");
	}
	@Override
	public String getTemplate() {		
		return "about.htm";
	}
}
