package com.pravin.serviceimpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.util.StringUtils;

import com.pravin.SearchReq;
import com.pravin.dto.ResponseDto;
import com.pravin.entity.EligibilltyDetails;
import com.pravin.repository.EligibilltyDetailsRepository;
import com.pravin.service.DynamicFilteringService;

public class DyanmicfilteringServiceImpl implements DynamicFilteringService {

	@Autowired
	EligibilltyDetailsRepository repo;
	
	@Override
	public List<String> planName() {
		return repo.findByPlanName();
	}

	@Override
	public List<String> planStatus() {
		// TODO Auto-generated method stub
		return  repo.findByPlanStatus();
	}

	@Override
	public List<ResponseDto> searchReq(SearchReq searchReq) {
		List<EligibilltyDetails> elige=null;
		
		if(null != searchReq) {
		String planName =searchReq.getPlanName();
		String planStatus =searchReq.getPlanStatus();
		LocalDate startdate=searchReq.getStartDate();
		LocalDate enddat=searchReq.getEndDate();
		
		EligibilltyDetails eligible=new EligibilltyDetails();
		if (planName != null && planName.equals("")) {
			eligible.setPlanName(planName);
		}
		if (planStatus != null && planStatus.equals("")) {
			eligible.setPlanStatus(planStatus);
		}
		if (startdate != null && enddat != null) {
			eligible.setStartDate(startdate);
			eligible.setEndDate(enddat);
		}
		Example<EligibilltyDetails> of=Example.of(eligible);
		elige=repo.findAll(of);
			
		}
		List<ResponseDto>response=new ArrayList<>();
		for (EligibilltyDetails eligibilltyDetails : elige) {
			ResponseDto sr=new ResponseDto();
			 BeanUtils.copyProperties(eligibilltyDetails, sr);
			 response.add(sr);
			
		}
		
		return response;
	}

}
