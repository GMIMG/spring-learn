package com.coderby.myapp.hr.dao;

import java.util.List;
//import java.util.Map;

import com.coderby.myapp.hr.model.ProjVO;

public interface IProjRepository {
	
	ProjVO getProjInfo(String s);
	void insertProj(ProjVO proj);
	List<ProjVO> getProjList();
	
}