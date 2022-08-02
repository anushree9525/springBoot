package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class employee1

{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	@Column
	private String EmpName;
	
	@Column
	private String EmpAddress;
	
	
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpAddress() {
		return EmpAddress;
	}
	public void setEmpAddress(String empAddress) {
		EmpAddress = empAddress;
	}
	
	
	/*public employee1 (int EmpNo,String EmpName,String EmpAddress)
	{
		super();
		this.EmpNo=EmpNo;
		this.EmpName=EmpName;
		this.EmpAddress=EmpAddress;
	}
	
	
	
	public int getEmpNo()
	{
		return EmpNo;
	}
	public void setEmpNo(int EmpNo)
	{
		this.EmpNo=EmpNo;
	}
	
	
	public String getEmpName()
	{
		return EmpName;
	}
	public void setEmpName(String EmpName)
	{
		this.EmpName=EmpName;
	}
	
	
	public String getEmpAddress()
	{
		return EmpAddress;
	}
	public void setEmpAddress(String EmpAddress)
	{
		this.EmpAddress=EmpAddress;
	}
	*/
	
	
}