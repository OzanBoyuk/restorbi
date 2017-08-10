package restorbi.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import restorbi.core.BasicModel;

@Entity
public class Personel extends BasicModel{

	@Column(name="p_name")
	private String name="";
	
	@Column(name="p_job")
	private String job="";
	
	@Column(name="p_birthday")
	private Date birthDay;
	
	@Column(name="p_enterDate")
	private Date enterDate;
	
	@Column(name="p_salary")
	private float salary;
	
	@Column(name="p_department")
	private String department="";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	public Date getEnterDate() {
		return enterDate;
	}
	public void setEnterDate(Date enterDate) {
		this.enterDate = enterDate;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
}
