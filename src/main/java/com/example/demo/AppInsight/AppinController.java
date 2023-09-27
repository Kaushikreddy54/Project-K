package com.example.demo.AppInsight;

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
public class AppinController {
	
	@Autowired
	public AppinService ais;
	
	@PostMapping("/client")
	public AppinName createClient(@Validated @RequestBody AppinName apn)
	{
		return ais.create(apn);
	}
	
	@GetMapping("/clients")
	public List<AppinName> getAllClients()
	{
		return ais.getAll();
	}
	
	@GetMapping("/client/{id}")
	public Optional<AppinName> getClientById(@PathVariable String id)
	{
		return ais.getById(id);	
	}
	
	@PutMapping("/client/{id}")
	public AppinName updateClient(@PathVariable String id, @Validated @RequestBody AppinName apn)
	{
		return ais.update(id,apn);
	}
	
	@DeleteMapping("/client/{id}")
	public String deleteClient(@PathVariable String id)
	{
		ais.delete(id);
		return "Client with id:" + id + "deleted successfully.";
	}

}
