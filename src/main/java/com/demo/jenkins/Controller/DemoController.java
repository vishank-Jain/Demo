package com.demo.jenkins.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.jenkins.Model.Demo;
import com.demo.jenkins.Service.DemoService;

@RestController
@RequestMapping("/api/demo")
public class DemoController {
	@Autowired
	private DemoService demoService;
	
	@PostMapping("/add")
	public Demo addDemo(@RequestBody Demo demo) {
		Demo demo1 = demoService.addDemo(demo);
		return demo;
	}
	@GetMapping("/get")
	public List<Demo> getAll(){
		return demoService.getAll();
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable String id) {
		demoService.delete(id);
	}
	

}
