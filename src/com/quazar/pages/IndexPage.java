package com.quazar.pages;

import org.apache.click.Page;

public class IndexPage extends Page{
	public IndexPage(){
		addModel("name", "Мальянов Дмитрий");
	}
	@Override
	public String getTemplate() {
		return "index.htm";
	}
}
