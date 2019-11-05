package com.multicampus.ex01;

import java.util.List;

public interface IEmpService {
	int getEmpCount();
	int getEmpCount(int deptid);
	List<EmpVO> getEmpList();
	EmpVO getEmpInfo(int empid);
}
