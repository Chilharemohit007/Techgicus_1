package com.techgicus_Grp.services;

import java.util.List;

import com.techgicus_Grp.entities.Interns;

public interface InternsService {

	public void saveInterns(Interns intern);

	public List<Interns> getAllInterns();

	public Interns getInternById(Long id);
	
	public Interns findInternByEmail(String email);

	public void deleteById(Long id);

	public void deleteInterns(long id);

}
