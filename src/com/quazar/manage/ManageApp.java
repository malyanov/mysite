package com.quazar.manage;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class ManageApp extends UI{

	@Override
	protected void init(VaadinRequest request) {
		VerticalLayout vl=new VerticalLayout();
		NativeButton btn=new NativeButton("Привет!", new ClickListener() {			
			@Override
			public void buttonClick(ClickEvent event) {
				Notification.show("Здорова, Чувак!!!");
			}
		});
		vl.addComponent(btn);		
		setContent(vl);
	}

}
