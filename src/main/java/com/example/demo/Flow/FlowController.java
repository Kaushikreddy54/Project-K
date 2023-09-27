package com.example.demo.Flow;

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
public class FlowController {
	
	@Autowired
	public FlowService fls;

	@PostMapping("/flow")
	public FlowName createFlow(@Validated @RequestBody FlowName flo)
	{
		return fls.create(flo);
	}
	
	@GetMapping("/flows")
	public List<FlowName> getAllFlows()
	{
		return fls.getAll();
	}
	
	@GetMapping("/flow/{id}")
	public Optional<FlowName> getFlowById(@PathVariable String id)
	{
		return fls.getById(id);
	}
	
	@PutMapping("/flow/{id}")
	public FlowName updateFlow(@PathVariable String id, @Validated @RequestBody FlowName flo)
	{
		return fls.update(id,flo);
	}
	
	@DeleteMapping("/flow/{id}")
	public String deleteFlow(@PathVariable String id)
	{
		fls.delete(id);
		return "Flow with id:" + id + "deleted successfully.";
	}

}
