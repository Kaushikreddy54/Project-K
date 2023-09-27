package com.example.demo.Process;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcessService {
	
	@Autowired
	public ProcessRepository pre;
	
	public ProcessName create(ProcessName prn)
	{
		return pre.save(prn);
	}
	
	public List<ProcessName> getAll()
	{
		return pre.findAll();
	}
	
	public Optional<ProcessName> getById(String id)
	{
		return pre.findById(id);
	}
	
	public ProcessName update(String id,ProcessName prn)
	{
		prn.setId(id);
		return pre.save(prn);
	}
	
	public String delete(String id)
	{
		pre.deleteById(id);
		return "Flow with id:" + id + "deleted successfully.";
	}

}
