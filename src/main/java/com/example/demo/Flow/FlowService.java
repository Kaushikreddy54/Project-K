package com.example.demo.Flow;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlowService {
	
	@Autowired
	public FlowRepository flre;
	
	public FlowName create(FlowName flo)
	{
		return flre.save(flo);
	}
	
	public List<FlowName> getAll()
	{
		return flre.findAll();
	}
	
	public Optional<FlowName> getById(String id)
	{
		return flre.findById(id);
	}
	
	public FlowName update(String id,FlowName flo)
	{
		flo.setId(id);
		return flre.save(flo);
	}
	
	public String delete(String id)
	{
		flre.deleteById(id);
		return "Flow with id:" + id + "deleted successfully.";
	}

}
