package com.pravin.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ELIGIBILITY_DTLS")
public class EligibilltyDetails {
	
	@Id
	@GeneratedValue
	@Column(name="PLAN_ID")
	private int planId;
	
	@Column(name="CASE_NO")
	private String casNo;
	
	@Column(name="PLAN_NAME")
	private String planName;
	
	@Column(name="PLAN_STATUS")
	private String planStatus;
	
	@Column(name="HOLDER_NAME")
	private String holderName;
	
	@Column(name="BENEFIT_AMT")
	private String benefitAmt;
	
	@Column(name="START_DATE")
	private LocalDate startDate;
	
	@Column(name="END_DATE")
	private LocalDate endDate;
	
	@Column(name="DANIAL_REASON")
	private String danialReason;

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public String getCasNo() {
		return casNo;
	}

	public void setCasNo(String casNo) {
		this.casNo = casNo;
	}

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

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getBenefitAmt() {
		return benefitAmt;
	}

	public void setBenefitAmt(String benefitAmt) {
		this.benefitAmt = benefitAmt;
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

	public String getDanialReason() {
		return danialReason;
	}

	public void setDanialReason(String danialReason) {
		this.danialReason = danialReason;
	}

	@Override
	public String toString() {
		return "EligibilltyDetails [planId=" + planId + ", casNo=" + casNo + ", planName=" + planName + ", planStatus="
				+ planStatus + ", holderName=" + holderName + ", benefitAmt=" + benefitAmt + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", danialReason=" + danialReason + "]";
	}
	
	
	

}
