package com.vicky.jobsite.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vicky.jobsite.dao.JobDao;
import com.vicky.jobsite.entities.Jobs;

@Service
public class JobServiceImplement implements JobService {
	
	@Autowired
	private JobDao jobdaw_var;
	
//  List<Jobs> list;
	public JobServiceImplement()
	{
//		list = new ArrayList<>();
//		list.add(new Jobs(145, "SDE1","Banglore","NinjaCart","Intern","19-Oct-2022"));
//		list.add(new Jobs(1267,"SDE2","Hydrabad","NinjaGlobal","FTE","26-Oct-2022"));
	}

	@Override
	public List<Jobs>getJobs() {
		// TODO Auto-generated method stub
		return jobdaw_var.findAll();
	}

	@Override
	public Jobs getJobById(long JobId) {
//		// TODO Auto-generated method stub
//		Jobs X = null;
//		for(Jobs i:list)
//		{
//			if(i.getId() == JobId)
//			{
//				X = i;
//				break;
//			}
//		}
		//return X;
		
		return jobdaw_var.findById(JobId).get();
	}

	@Override
	public Jobs addJobs(Jobs newjob) {
		// TODO Auto-generated method stub
//		list.add(newjob);
		jobdaw_var.save(newjob);
		return newjob;
	}

	@Override
	public Jobs updateJobs(Jobs job) {
//		list.forEach(e -> {
//			if(e.getId() == job.getId())
//			{
//				e.setPostingDate(job.getPostingDate());
//				e.setDesignation(job.getDesignation());
//			}
//			
//		});	
		jobdaw_var.save(job);
		return job;
	}

	@Override
	public void deleteJobs(long parseLong) {
		// TODO Auto-generated method stub
//		list = this.list.stream().filter(e->e.getId() != parseLong).collect(Collectors.toList());
		Jobs x = jobdaw_var.findById(parseLong).get();
		jobdaw_var.delete(x);
		
	}
	
	
	
// Commented Lines are alternate way of doing the same things	

}
