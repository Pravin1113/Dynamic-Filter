package com.pravin.service;

import java.util.List;

import com.pravin.SearchReq;
import com.pravin.dto.ResponseDto;

public interface DynamicFilteringService {

	public List<String> planName();
	
	public List<String> planStatus();
	
	public List<ResponseDto> searchReq(SearchReq searchReq);
	
}
