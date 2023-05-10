package com.techgicus_Grp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techgicus_Grp.entities.ClientsContacts;
import com.techgicus_Grp.repositories.ClientsContactsRepository;

@Service
public class ClientsContactsServiceImpl implements ClientsContactsService {

	@Autowired
	private ClientsContactsRepository clientsContactsRepo;
	
	
	@Override
	public void saveClientsContacts(ClientsContacts clientContact) {
	
		clientsContactsRepo.save(clientContact);
	}


	@Override
	public List<ClientsContacts> getClientsContacts() {
		List<ClientsContacts> clientsContacts = clientsContactsRepo.findAll();
		
		return clientsContacts;
	}

	
}
