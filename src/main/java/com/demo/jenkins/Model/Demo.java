package com.demo.jenkins.Model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Demo {
	
	String id;
	String name;
	String status;
	String ee;
}
