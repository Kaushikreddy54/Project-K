package com.example.demo.Process;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="KAUSHIK_4")
public class ProcessName {
	
	@Id
	public String id;
	
	private String proNum;
	private String proName;
	private int proRate;

}
