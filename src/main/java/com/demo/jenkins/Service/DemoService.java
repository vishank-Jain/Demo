package com.demo.jenkins.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.demo.jenkins.Model.Demo;

@Service
public class DemoService {

	private List<Demo> list=new ArrayList<>();
	public DemoService() {
		list.add(Demo.builder().
				name("Demo1").id(UUID.randomUUID().toString()).
				status("yes").build());
	}	
	
	public Demo addDemo(Demo demo) {
		demo.setId(UUID.randomUUID().toString());
		list.add(demo);
		return demo;
	}
	public List<Demo> getAll(){
		return list;
	}
	public void delete(String id) {
		list.removeIf(demo-> demo.getId().equals(id));
	}
}
