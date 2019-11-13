package com.coderby.myapp.hr.service;

import java.util.List;
import java.util.Map;

import com.coderby.myapp.hr.model.ProjVO;

public interface IProjService {
	ProjVO getProjInfo(String s);
	void insertProj(ProjVO proj);
	List<ProjVO> getProjList();
	void deleteProj(String name);

	List<ProjVO> searchProj(int t, String sp);
}