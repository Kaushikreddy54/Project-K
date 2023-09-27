package com.example.demo.AppInsight;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="KAUSHIK_3")
public class AppinName {
	
	@Id
	public String id;
	
	private String cliNum;
	private String cliName;
	private String cliRegion;

}
