package com.techgicus_Grp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techgicus_Grp.entities.Contacts;

public interface ContactRepository extends JpaRepository<Contacts, Long> {

}
