package com.pravin.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pravin.SearchReq;
import com.pravin.dto.ResponseDto;
import com.pravin.serviceimpl.DyanmicfilteringServiceImpl;

@RestController
public class DynaimcFilterController {
	
	@Autowired
	DyanmicfilteringServiceImpl service;
	
	@GetMapping("/plans")
	public List<String> getplanNames() {
		return service.planName();
		
	}
	@GetMapping("/status")
	public List<String> getplanstatus() {
		return service.planStatus();
		
	}
	@GetMapping("/search")
	public List<ResponseDto> Searchplan(@RequestBody SearchReq req) {
		return service.searchReq(req);
		
	}

}
