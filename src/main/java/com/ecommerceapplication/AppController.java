package com.ecommerceapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@GetMapping("/data1")
	public String getData() {
		return "data1,data2";
	}

}
