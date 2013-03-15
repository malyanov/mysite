package com.quazar.pages;

import com.quazar.dao.UserDao;
import com.quazar.models.UserModel;

public class IndexPage extends BasePage {
	public IndexPage() {
		super("index");
		if (getContext().getRequestParameter("user").equals("create")) {			
			UserModel user=UserDao.createUser("123", "Дмитрий", "Мальянов", "192.168.0.1", 1);			
			user.getId();
		} else if (getContext().getRequestParameter("user").equals("get")) {
			UserModel user = UserDao.getUser("123");
			user.getFirstName();
		}else if (getContext().getRequestParameter("user").equals("update")) {
			UserModel user=UserDao.createUser("123", "Дмитрий1", "Мальянов1", "192.168.0.1", 1);			
			user.getId();
		}
		
	}

	@Override
	public String getTemplate() {
		return "index.htm";
	}
}
