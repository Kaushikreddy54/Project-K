package com.example.demo.Application;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="KAUSHIK_1")
public class AppliName {

	@Id
	public String id;
	
	private String appNum;
	private String appName;
	private String appType;
}

