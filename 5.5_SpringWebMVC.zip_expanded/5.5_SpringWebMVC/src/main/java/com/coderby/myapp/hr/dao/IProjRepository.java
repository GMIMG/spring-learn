package com.coderby.myapp.hr.dao;

import java.util.List;
//import java.util.Map;

import com.coderby.myapp.hr.model.ProjVO;

public interface IProjRepository {
	
	ProjVO getProjInfo(int cId);
	void insertProj(ProjVO proj);
	List<ProjVO> getProjList();
	
	List<ProjVO> searchProj(int t, String sp);
	int maxindex();
	void updateProj(ProjVO proj);
	void deleteProj(int cId);
	
}