package com.techgicus_Grp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techgicus_Grp.entities.Contacts;
import com.techgicus_Grp.repositories.ContactRepository;

@Service
public class ContactsServiceImpl implements ContactsService{

	
	@Autowired
	private ContactRepository contactRepo;

	@Override
	public void saveContacts(Contacts contact) {
			contactRepo.save(contact);
	}

	@Override
	public List<Contacts> getContacts() {
		List<Contacts> contacts = contactRepo.findAll();
		return contacts;
	}

	@Override
	public Contacts getInternsContactsInfoById(Long id) {
		Optional<Contacts> findById = contactRepo.findById(id);
		Contacts internscontactsinfo = findById.get();
		
		return internscontactsinfo;
	}
	

}
