package com.techgicus_Grp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techgicus_Grp.controller.dto.SaveContactsDetails;
import com.techgicus_Grp.entities.Contacts;
import com.techgicus_Grp.services.ContactsService;
import com.techgicus_Grp.services.InternsService;

@Controller
public class ContactsController {


	@Autowired
	private ContactsService contactsService;
	
	@Autowired
	private InternsService internsService;
	
	
	@RequestMapping("/contact")
	public String saveContact(SaveContactsDetails details, ModelMap modelMap) {
		Contacts contact = new Contacts();
		contact.setId(details.getId());
		contact.setFirstName(details.getFirstName());
		contact.setLastName(details.getLastName());
		contact.setEmail(details.getEmail());
		contact.setMobile(details.getMobile());
		contact.setCourseName(details.getCourseName());
		contact.setBatch(details.getBatch());
		contact.setAddress(details.getAddress());
		contact.setInternSource(details.getInternSource());
		contact.setJoiningDate(details.getJoiningDate());
		contact.setAdvanceFees(details.getAdvanceFees());
		contact.setBalanceFees(details.getBalanceFees());
		
		contactsService.saveContacts(contact);
		
		internsService.deleteInterns(details.getId());
		modelMap.addAttribute("msg", "Interns Are Converted To Exposure");
		return"contactsSaved";
	}
	
	@RequestMapping("/getContacts")
	public String getContactsInfo(ModelMap modelMap) {
		List<Contacts> contacts = contactsService.getContacts();
		modelMap.addAttribute("contacts", contacts);
		
		return "contactsSearchResults";
	}
	
	@RequestMapping("/getInternsContactsInfo")
	public String getInternsContactsInfo(@RequestParam("id") Long id,ModelMap modelMap) {
		Contacts internscontactsinfo = contactsService.getInternsContactsInfoById(id);
		modelMap.addAttribute("internscontactsinfo", internscontactsinfo);
		return "internsContactsInfo";
	}
}
