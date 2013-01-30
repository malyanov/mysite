package com.quazar.pages;


public class IndexPage extends BasePage{
	public IndexPage(){
		addModel("name", "Мальянов Дмитрий");
	}
	@Override
	public String getTemplate() {
		return "index.htm";
	}
}
