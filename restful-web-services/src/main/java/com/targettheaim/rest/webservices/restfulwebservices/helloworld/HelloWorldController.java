package com.targettheaim.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {


	//GET
	//URI - /hello-world
	//Method to get "Hello World"
	
	@GetMapping(path="/hello-world")
	public String helloworld() {
		return "Hello World";
	}
	
	//hello-world-bean
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloworldBean() {
	//throw new RuntimeException("Some Error has Happened! Contact Support");
		return new HelloWorldBean("Hello World Changed");
	}
	
	//hello-world/path-variable/targettheaim
	@GetMapping(path="/hello-world/path-variable/{name}")
	public HelloWorldBean helloworldBeanPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello world, %s", name));
	}
}
