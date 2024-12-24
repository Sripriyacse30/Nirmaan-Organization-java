
package day14;

import java.util.Scanner;

public class Employee {
	private  String EmpName;
	private int Eid;
	private String Edept;
	private long Epno;
	Employee(){
		
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEdept() {
		return Edept;
	}
	public void setEdept(String edept) {
		Edept = edept;
	}
	public long getEpno() {
		return Epno;
	}
	public void setEpno(long epno) {
		Epno = epno;
	}
	
	public Employee(String empName, int eid, String edept, long epno) {
		super();
		EmpName = empName;
		Eid = eid;
		Edept = edept;
		Epno = epno;
	}
	@Override
	public String toString() {
		return "Employee [EmpName=" + EmpName + ", Eid=" + Eid + ", Edept=" + Edept + ", Epno=" + Epno + "]";
	}
	
	
	
	}
	