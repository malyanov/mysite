package com.quazar.pages;

public class DemosPage extends BasePage {
	public DemosPage() {
		super("demos");
	}

	@Override
	public String getTemplate() {		
		return "demos.htm";
	}
}
