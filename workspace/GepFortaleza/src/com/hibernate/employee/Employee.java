package com.hibernate.employee;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Employee {
	
	private int id;
	
	private String name;
	private Calendar empJoinDate;
	private Date empLoginTime;
	

	@Id	
	@TableGenerator(name = "empId", table = "emppktb", pkColumnName = "empkey"
					, pkColumnValue = "empvalue",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.TABLE, generator="empId")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Temporal(TemporalType.DATE)
	public Calendar getEmpJoinDate() {
		return empJoinDate;
	}

	public void setEmpJoinDate(Calendar empJoinDate) {
		this.empJoinDate = empJoinDate;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	public Date getEmpLoginTime() {
		return empLoginTime;
	}

	public void setEmpLoginTime(Date empLoginTime) {
		this.empLoginTime = empLoginTime;
	}
	
	
	

}
