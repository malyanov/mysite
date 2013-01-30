package com.quazar.pages;

import org.apache.click.Page;

import com.quazar.panels.AuthPanel;
import com.quazar.panels.FooterPanel;
import com.quazar.panels.NavPanel;
import com.quazar.panels.ResourcesPanel;

public class BasePage extends Page {	 
	public BasePage(String pageId) {
		addControl(new AuthPanel());
		addControl(new NavPanel());
		addControl(new FooterPanel());
		addControl(new ResourcesPanel());
		addModel("page_id", pageId);
	}	
}
