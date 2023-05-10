package com.techgicus_Grp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techgicus_Grp.entities.Clients;
import com.techgicus_Grp.services.ClientService;

@Controller
public class ClientsController {

	@Autowired
	private ClientService clientService;
	
	
	@RequestMapping("/client")
	public String showClientPage() {
		return "createClients";
	}
	
	
	@RequestMapping("/saveClient")
	public String saveClientsInfo(@ModelAttribute("client") Clients client,ModelMap modelMap) {
		clientService.saveClients(client);
		modelMap.addAttribute("msg", "Client info is saved...!!!");
		return "createClients";
	}
	
	@RequestMapping("/getclients")
	public String getClients(ModelMap modelMap) {
		List<Clients> clients = clientService.getAllClients();
		modelMap.addAttribute("clients", clients);
		return "searchingResults";
	}
	
	@RequestMapping("/getClientInfo")
	public String getClientsInfo(@RequestParam("id") Long id,ModelMap modelMap) {
		Clients client = clientService.getClientById(id);
		modelMap.addAttribute("client", client);
		return "clientsInfo";
	}
	
}
