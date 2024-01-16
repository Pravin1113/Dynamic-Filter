package com.pravin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pravin.entity.EligibilltyDetails;

public interface EligibilltyDetailsRepository extends JpaRepository<EligibilltyDetails, Integer> {

	List<String> findByPlanName();

	List<String> findByPlanStatus();

}
