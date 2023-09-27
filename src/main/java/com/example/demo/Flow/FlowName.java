package com.example.demo.Flow;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="KAUSHIK_2")
public class FlowName {
	
	@Id
	public String id;
	
	private String flowNum;
	private String flowFrom;
	private String flowTo;

}
