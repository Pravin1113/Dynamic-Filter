package com.pravin;

import java.time.LocalDate;

import jakarta.persistence.Column;

public class SearchReq {
	
	private String planName;

	private String planStatus;
	
    private LocalDate startDate;
	
	private LocalDate endDate;

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanStatus() {
		return planStatus;
	}

	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "SearchReq [planName=" + planName + ", planStatus=" + planStatus + ", startDate=" + startDate
				+ ", endDate=" + endDate + "]";
	}

	

}
