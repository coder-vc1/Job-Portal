package com.vicky.jobsite.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "JOB_AVAILABLE")
public class Jobs {
	@Id
	
	private long Id;
	private String designation;
	private String location;
	private String CompanyName;
	private String EmploymentType;
	private String PostingDate;
	public Jobs(long id, String designation, String location, String companyName, String employmentType,
			String postingDate) {
		super();
		Id = id;
		this.designation = designation;
		this.location = location;
		CompanyName = companyName;
		EmploymentType = employmentType;
		PostingDate = postingDate;
	}
	public Jobs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getEmploymentType() {
		return EmploymentType;
	}
	public void setEmploymentType(String employmentType) {
		EmploymentType = employmentType;
	}
	public String getPostingDate() {
		return PostingDate;
	}
	public void setPostingDate(String postingDate) {
		PostingDate = postingDate;
	}
	@Override
	public String toString() {
		return "Jobs [Id=" + Id + ", designation=" + designation + ", location=" + location + ", CompanyName="
				+ CompanyName + ", EmploymentType=" + EmploymentType + ", PostingDate=" + PostingDate + "]";
	}
	
	



	

	



	
	
}
