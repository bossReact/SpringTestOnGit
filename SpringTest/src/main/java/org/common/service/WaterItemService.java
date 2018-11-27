package org.common.service;

import org.springframework.stereotype.Component;

@Component("water")
public class WaterItemService implements ItemService {

	
	public void display() {
		System.out.println("ItemService display() call");
	}

	@Override
	public String toString() {
		return "ItemService Class";
	}

	@Override
	public void behave() {
		System.out.println("inside the WaterItem Service IMpl");		
	}
	
	
}
