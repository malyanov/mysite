package com.quazar.pages;


public class IndexPage extends BasePage{
	public IndexPage(){
		addModel("name", "�������� �������");
	}
	@Override
	public String getTemplate() {
		return "index.htm";
	}
}
