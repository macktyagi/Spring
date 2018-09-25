package com.qc.los.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="sales")
public class Executive extends EmpData{
	
	@Column(name="workinghours")
	private String workingHour;

	public String getWorkingHour() {
		return workingHour;
	}

	public void setWorkingHour(String workingHour) {
		this.workingHour = workingHour;
	}
	

}
