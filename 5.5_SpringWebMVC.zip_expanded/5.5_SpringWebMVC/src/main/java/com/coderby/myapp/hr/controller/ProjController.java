package com.coderby.myapp.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	
	
	@RequestMapping(value="/insert1")
	public String connectinsert() {
		return "/hr/insert";
	}
	
	
	
	
	
	@RequestMapping(value="/insert1", method=RequestMethod.POST)
	public String insertProjForm(ProjVO proj, Model model) {
		projService.insertProj(proj);
		return "redirect:/";
	}
	
	
	
	
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public String searchProj(@RequestParam(value="customerType") int customerType,
			@RequestParam(value="searchString", required=false, defaultValue="0") String searchString, 
			Model model) {
		List<ProjVO> projList = projService.searchProj(customerType ,searchString);
		model.addAttribute("projList", projList);
		return "home";
	}
	
	
	
	
}//end class