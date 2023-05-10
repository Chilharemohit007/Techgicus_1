package com.techgicus_Grp.services;

import java.util.List;

import com.techgicus_Grp.entities.Clients;

public interface ClientService {

	public void saveClients(Clients client);

	public List<Clients> getAllClients();

	public Clients getClientById(Long id);

	public void deleteClients(long id);

}
