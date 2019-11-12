package com.coderby.myapp.hr.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderby.myapp.hr.dao.IProjRepository;
import com.coderby.myapp.hr.model.ProjVO;

@Service
public class ProjService implements IProjService {

	@Autowired
	IProjRepository projRepository;

	@Override
	public List<ProjVO> getProjList() {
		return projRepository.getProjList();
	}

	@Override
	public ProjVO getProjInfo(String s) {
		return projRepository.getProjInfo(s);
	}

	@Override
	public void insertProj(ProjVO proj) {
		projRepository.insertProj(proj);
	}
	
}