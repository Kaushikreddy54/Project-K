package com.example.demo.Process;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProcessController {
	
	@Autowired
	public ProcessService prs;
	
	@PostMapping("/process")
	public ProcessName createProcess(@Validated @RequestBody ProcessName prn)
	{
		return prs.create(prn);
	}
	
	@GetMapping("/processes")
	public List<ProcessName> getAllProcesses()
	{
		return prs.getAll();
	}
	
	@GetMapping("/process/{id}")
	public Optional<ProcessName> getProcessById(@PathVariable String id)
	{
		return prs.getById(id);
	}
	
	@PutMapping("/process/{id}")
	public ProcessName updateProcess(@PathVariable String id, @Validated @RequestBody ProcessName prn)
	{
		return prs.update(id,prn);
	}
	
	@DeleteMapping("/process/{id}")
	public String deleteProcess(@PathVariable String id)
	{
		prs.delete(id);
		return "Process with id:" + id + "deleted successfully.";
	}

}
