package org.common.test;

import org.common.AppConfig;
import org.common.service.ItemService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApplication {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
	//	context.refresh();
		ItemService service=context.getBean("water",ItemService.class);
		System.out.println(service.toString());
		service.behave();
	}
}
