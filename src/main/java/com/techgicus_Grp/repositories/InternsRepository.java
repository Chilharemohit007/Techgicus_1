package com.techgicus_Grp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techgicus_Grp.entities.Interns;

public interface InternsRepository extends JpaRepository<Interns, Long>{

	Interns findByEmail(String email);
}
