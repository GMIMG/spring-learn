package com.coderby.myapp.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coderby.myapp.hr.model.EmpVO;
import com.coderby.myapp.hr.model.ProjVO;
import com.coderby.myapp.hr.service.IProjService;

@Controller
public class ProjController {

	@Autowired
	IProjService projService;
	
	@RequestMapping(value="/")
	public String getProj(Model model) {
		List<ProjVO> projList = projService.getProjList();
		model.addAttribute("projList", projList);
		return "home";
	}
	
	

	
	
	@RequestMapping(value="/hr/insert1")
	public String insertProj(Model model) {
		return "/hr/insertproj";
	}
	
	
	
	
	
	@RequestMapping(value="/hr/insert1", method=RequestMethod.POST)
	public String insertProjForm(ProjVO proj, Model model) {
		projService.insertProj(proj);
		return "redirect:/";
	}
	
	
	
	
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public String searchProj(Model model) {
		projService.getProjInfo(proj);
		return "redirect:/";
	}
	
	
	
	
	
}//end class