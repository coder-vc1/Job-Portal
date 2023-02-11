package com.vicky.jobsite.services;

import java.util.List;

import com.vicky.jobsite.entities.Jobs;

public interface JobService {

	 public List<Jobs>getJobs();
	 
	 public Jobs getJobById(long JobId);
	 
	 public Jobs addJobs(Jobs newjob);
	 
	 public Jobs updateJobs(Jobs job);
	 
	 public void deleteJobs(long parseLong);
} 

