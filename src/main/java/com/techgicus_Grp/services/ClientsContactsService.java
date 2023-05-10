package com.techgicus_Grp.services;

import java.util.List;

import com.techgicus_Grp.entities.ClientsContacts;

public interface ClientsContactsService {

	public void saveClientsContacts(ClientsContacts clientContact);

	public List<ClientsContacts> getClientsContacts();

}
