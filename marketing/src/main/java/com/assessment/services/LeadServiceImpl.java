package com.assessment.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessment.entities.Lead;
import com.assessment.repositories.LeadRepository;

@Service
public class LeadServiceImpl implements LeadServiceInf {
	
	@Autowired
	private LeadRepository leadRepo;
	
	@Override
	public void saveLead(Lead lead) {
		leadRepo.save(lead);

	}
	@Override
	public List<Lead> listAll(){
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}
	@Override
	public void deleteLeadById(long id) {
		leadRepo.deleteById(id);
	}
	
	@Override
	public Lead getLeadById(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

}
