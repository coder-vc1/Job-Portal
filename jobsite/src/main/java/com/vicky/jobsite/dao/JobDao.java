package com.vicky.jobsite.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vicky.jobsite.entities.Jobs;

public interface JobDao extends JpaRepository<Jobs, Long>{

}
