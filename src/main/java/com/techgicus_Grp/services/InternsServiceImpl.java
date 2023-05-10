package com.techgicus_Grp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techgicus_Grp.entities.Interns;
import com.techgicus_Grp.repositories.InternsRepository;

@Service
public class InternsServiceImpl implements InternsService {
	
	@Autowired
	private InternsRepository internsRepo;

	@Override
	public void saveInterns(Interns intern) {
		internsRepo.save(intern);
	}

	@Override
	public List<Interns> getAllInterns() {
		List<Interns> interns = internsRepo.findAll();
		return interns;
	}
	
	@Override
	public Interns getInternById(Long id) {
		Optional<Interns> findById = internsRepo.findById(id);
		Interns intern = findById.get();
		return intern;
	}

	@Override
	public Interns findInternByEmail(String email) {
		internsRepo.findByEmail(email);
		return null;
	}

	@Override
	public void deleteById(Long id) {
		internsRepo.deleteById(id);
	}

	@Override
	public void deleteInterns(long id) {
		internsRepo.deleteById(id);
	}

}
