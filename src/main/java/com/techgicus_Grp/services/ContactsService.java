package com.techgicus_Grp.services;

import java.util.List;

import com.techgicus_Grp.entities.Contacts;

public interface ContactsService {

	public void saveContacts(Contacts contact);

	public List<Contacts> getContacts();

	public Contacts getInternsContactsInfoById(Long id);


}
