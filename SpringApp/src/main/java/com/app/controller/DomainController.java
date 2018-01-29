package com.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Domains;
import com.app.repo.DomainRepository;

@RestController
@RequestMapping("/domains")
public class DomainController {

	@Autowired
	DomainRepository domainRepository;

	@PostMapping("/add")
	public Domains addDomain(@Valid @RequestBody Domains domain) {
		return domainRepository.save(domain);
	}
	
	@GetMapping("/all")
	public List<Domains> getAllDomains(){
		return domainRepository.findAll();
	}
}
