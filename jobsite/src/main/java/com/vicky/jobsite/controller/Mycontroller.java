package com.vicky.jobsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vicky.jobsite.entities.Jobs;
import com.vicky.jobsite.services.JobService;

@RestController    //representational state transfer(Rest)

public class Mycontroller {
	
	@Autowired
	private JobService jobService_var;

	@GetMapping("/home")
	public String home()
	{
		return "Welcome to JobSite ";
	}
	
	// Get List of all Available Jobs
	@GetMapping("/Jobs")
	public List<Jobs> getJobs()
	{
		return this.jobService_var.getJobs();
	}
	
	// Get Jobs by Id
	@GetMapping("/Jobs/{JobId}")
	public Jobs getJobById(@PathVariable String JobId)
	{
		return this.jobService_var.getJobById(Long.parseLong(JobId));
		
	}
	
	// Post new Jobs
	@PostMapping("/Jobs")
	public Jobs addJobs(@RequestBody Jobs newjob)
	{
		return this.jobService_var.addJobs(newjob);
	}
	
	// Update the jobs using PUT
	@PutMapping("/Jobs")
	public Jobs updateJobs(@RequestBody Jobs job)
	{
		return this.jobService_var.updateJobs(job);
	}
	
	// Close a particular Job Vacancy using Job Id
	@DeleteMapping("/Jobs/{JobId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String JobId)
	{
		try 
		{
			this.jobService_var.deleteJobs(Long.parseLong(JobId));
			return new ResponseEntity<>(HttpStatus.OK);
			
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
