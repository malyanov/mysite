package com.quazar.pages;



public class IndexPage extends BasePage {	
	public IndexPage() {
		super("index");		
	}

	@Override
	public String getTemplate() {
		return "index.htm";
	}
}
