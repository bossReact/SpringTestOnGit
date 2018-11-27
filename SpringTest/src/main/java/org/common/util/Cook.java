package org.common.util;

import org.common.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cook {

	@Autowired
	@Qualifier(value="water")
	private ItemService service;
	
	public void cook() {
		System.out.println("Cook class cook method"+service.getClass().getName());
		service.behave();
	}
	
}
