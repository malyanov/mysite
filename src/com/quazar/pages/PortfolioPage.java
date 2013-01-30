package com.quazar.pages;

public class PortfolioPage extends BasePage {
	public PortfolioPage(){
		super("portfolio");
	}
	@Override
	public String getTemplate() {		
		return "portfolio.htm";
	}
}
