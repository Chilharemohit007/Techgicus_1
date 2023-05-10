package com.techgicus_Grp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techgicus_Grp.entities.Clients;
import com.techgicus_Grp.repositories.ClientsRepository;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientsRepository clientRepo;

	@Override
	public void saveClients(Clients client) {

		clientRepo.save(client);
	}

	@Override
	public List<Clients> getAllClients() {
		List<Clients> clients = clientRepo.findAll();
		return clients;
	}

	@Override
	public Clients getClientById(Long id) {
		Optional<Clients> findById = clientRepo.findById(id);
		Clients client = findById.get();
		return client ; 
	}

	@Override
	public void deleteClients(long id) {
		clientRepo.deleteById(id);
	}
}
