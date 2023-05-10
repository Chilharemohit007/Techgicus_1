package com.techgicus_Grp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techgicus_Grp.controller.dto.SaveClientsContactsDetails;
import com.techgicus_Grp.entities.ClientsContacts;
import com.techgicus_Grp.services.ClientService;
import com.techgicus_Grp.services.ClientsContactsService;

@Controller
public class ClientsContactsController {

	@Autowired
	private ClientsContactsService clientsContactsService;
	
	@Autowired
	private ClientService clientService;
	
	@RequestMapping("/clientsContacts")
	public String saveClientContact(SaveClientsContactsDetails details, ModelMap modelMap) {
		ClientsContacts clientContact = new ClientsContacts();
		clientContact.setDate(details.getDate());
		clientContact.setClientName(details.getClientName());
		clientContact.setEmail(details.getEmail());
		clientContact.setMobile(details.getMobile());
		clientContact.setAddress(details.getAddress());
		clientContact.setOrganisation(details.getOrganisation());
		clientContact.setRequirement(details.getRequirement());
		clientContact.setProjectScheduleDate(details.getProjectScheduleDate());
		clientContact.setClientSource(details.getClientSource());
		clientContact.setAmountPaid(details.getAmountPaid());
		clientContact.setAmountBalance(details.getAmountBalance());
		clientContact.setPaymentDate(details.getPaymentDate());
		clientContact.setPaymentMode(details.getPaymentMode());
		
		clientsContactsService.saveClientsContacts(clientContact);
		
		clientService.deleteClients(details.getId());
		modelMap.addAttribute("msg", "Clients are converted to exposure...");
		return "clientsContactsSaved";
	}
	
	@RequestMapping("/getClientsContacts")
	public String getClientsContactsInfo(ModelMap modelMap) {
		List<ClientsContacts> clientsContacts = clientsContactsService.getClientsContacts();
		modelMap.addAttribute("clientsContacts", clientsContacts);
		return "clientsContactsSearchResults";
	}
}
