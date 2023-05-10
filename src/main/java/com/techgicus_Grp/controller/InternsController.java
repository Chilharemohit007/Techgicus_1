package com.techgicus_Grp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techgicus_Grp.controller.dto.InternData;
import com.techgicus_Grp.entities.Interns;
import com.techgicus_Grp.services.InternsService;
import com.techgicus_Grp.util.EmailServiceImpl;


@Controller
public class InternsController {
	
	@Autowired
	private EmailServiceImpl emailService; // It automatically creates an Bean(Object) of EmailService .

	@Autowired
	private InternsService internsService;
	
	
	@RequestMapping("/intern")
	public String showInternsPage() {
		return "createInterns";
	}
	
	@RequestMapping("/saveIntern")
	public String saveInternsInfo(@ModelAttribute("intern") Interns intern, ModelMap modelmap) {
		internsService.saveInterns(intern);
		modelmap.addAttribute("msg", "Intern info is saved...!!!");
		emailService.sendSimpleEmailMessage("mohitchilhare007@gmail.com", "Welcome", "Interns is saved...!!!");
		return "createInterns";
	}
	
	@RequestMapping("/getinterns")
	public String getInterns(ModelMap modelMap) {
		List<Interns> interns = internsService.getAllInterns();
		modelMap.addAttribute("interns", interns);
		return "searchResult";
	}
	
	@RequestMapping("/getInternInfo")
	public String getInternsInfo(@RequestParam("id") Long id,ModelMap modelMap) {
		Interns intern = internsService.getInternById(id);
		modelMap.addAttribute("intern", intern);
		return "internsInfo";
	}
	
	@RequestMapping("/delete")
	public String deleteInternsById(@RequestParam("id") Long id, ModelMap modelMap) {
		internsService.deleteById(id);
		
		List<Interns> interns = internsService.getAllInterns();
		modelMap.addAttribute("interns", interns);
		return "searchResult";
	}
	
	@RequestMapping("/update")
	public String updateInternsById(@RequestParam("id") Long id, ModelMap modelMap) {
		Interns intern = internsService.getInternById(id);
		modelMap.addAttribute("intern", intern);
		return "updateInterns";
	}
	
	@RequestMapping("/updateInternData")
	public String updateInternsData(InternData internData, ModelMap modelMap) {
		Interns intern = new Interns();
		intern.setId(internData.getId());
		intern.setFirstName(internData.getFirstName());
		intern.setLastName(internData.getLastName());
		intern.setEmail(internData.getEmail());
		intern.setMobile(internData.getMobile());
		intern.setCourseName(internData.getCourseName());
		intern.setBatch(internData.getBatch());
		intern.setAddress(internData.getAddress());
		intern.setInternSource(internData.getInternSource());
		intern.setJoiningDate(internData.getJoiningDate());
		intern.setAdvanceFees(internData.getAdvanceFees());
		intern.setBalanceFees(internData.getBalanceFees());
	
		internsService.saveInterns(intern);
		
		List<Interns> allInterns = internsService.getAllInterns();
		modelMap.addAttribute("interns", allInterns);
		return "searchResult";
	}
}
