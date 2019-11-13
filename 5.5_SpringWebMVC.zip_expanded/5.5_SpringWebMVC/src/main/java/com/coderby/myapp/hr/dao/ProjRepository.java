package com.coderby.myapp.hr.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.coderby.myapp.hr.model.ProjVO;

@Repository
public class ProjRepository implements IProjRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	private class ProjMapper implements RowMapper<ProjVO> {
		@Override
		public ProjVO mapRow(ResultSet rs, int count) throws SQLException {
			ProjVO proj = new ProjVO();
			proj.setCustomerType(rs.getString("dcustomertype"));
			proj.setName(rs.getString("dname"));
			proj.setPhoneNumber(rs.getString("dphonenumber"));
			proj.setCigar(rs.getString("dcigar"));
			proj.setsPoint(rs.getString("dspoint"));
			proj.setePoint(rs.getString("depoint"));			
			proj.setsTime(rs.getString("dstime"));
			proj.setMemo(rs.getString("dmemo"));
			return proj;
		}
	}
	
	@Override
	public List<ProjVO> getProjList() {
		String sql = "select * from project";
		return jdbcTemplate.query(sql, new RowMapper<ProjVO>() {
			@Override
			public ProjVO mapRow(ResultSet rs, int count) throws SQLException {
				ProjVO proj = new ProjVO();
				proj.setCustomerType(rs.getString("dcustomertype"));
				proj.setName(rs.getString("dname"));
				proj.setPhoneNumber(rs.getString("dphonenumber"));
				proj.setCigar(rs.getString("dcigar"));
				proj.setsPoint(rs.getString("dspoint"));
				proj.setePoint(rs.getString("depoint"));			
				proj.setsTime(rs.getString("dstime"));
				proj.setMemo(rs.getString("dmemo"));
				return proj;
			} //mapRow close
		});
	}
	
	@Override
	public ProjVO getProjInfo(String s) {
		String sql = "select dcustomerType, dname, " 
				+ "phoneNumber, cigar, sPoint, ePoint, sTime, memo "
				+ "from project where sPoint=?";		
		return jdbcTemplate.queryForObject(sql, new ProjMapper(), s);
	}
	
	@Override
	public void insertProj(ProjVO proj) {
		String sql = "insert into project (dcustomerType, dname, "
				+ "dphoneNumber, dcigar, dsPoint, dePoint, dsTime, dmemo) "
				+ "values (?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql, 
				proj.getCustomerType(), 
				proj.getName(), 
				proj.getPhoneNumber(),
				proj.getCigar(),
				proj.getsPoint(),
				proj.getePoint(),
				proj.getsTime(),
				proj.getMemo()
		);
	}
	
	@Override
	public List<ProjVO> searchProj(int t, String sp) {
		String sql = null;
		switch(t) {
		case 1:
			sql = "select * from project where dsPoint = ?";
			break;
		case 2:
			sql = "select * from project where dePoint = ?";
			break;
		case 3:
			sql = "select * from project where dstime = ?";
			break;
		}
		return jdbcTemplate.query(sql, new Object[]{sp}, new RowMapper<ProjVO>() {
			@Override
			public ProjVO mapRow(ResultSet rs, int count) throws SQLException {
				ProjVO proj = new ProjVO();
				proj.setCustomerType(rs.getString("dcustomertype"));
				proj.setName(rs.getString("dname"));
				proj.setPhoneNumber(rs.getString("dphonenumber"));
				proj.setCigar(rs.getString("dcigar"));
				proj.setsPoint(rs.getString("dspoint"));
				proj.setePoint(rs.getString("depoint"));			
				proj.setsTime(rs.getString("dstime"));
				proj.setMemo(rs.getString("dmemo"));
				return proj;
			} //mapRow close
		});
	}
	
	
}//end class

/*
@Override
public List<Map<Integer, String>> getAllDeptId() {
	String sql = "select department_id, department_name from departments";
	return jdbcTemplate.query(sql, new RowMapper<Map<Integer, String>>() {
		@Override
		public Map<Integer, String> mapRow(ResultSet rs, int count) throws SQLException {
			Map<Integer, String> deptMap = new HashMap<Integer, String>();
			deptMap.put(rs.getInt("department_id"), rs.getString("department_name"));
			return deptMap;
		};
	});
}
*/