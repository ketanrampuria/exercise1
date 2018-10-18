package com.inmar.exercise1.pojo;

import java.util.Set;

import com.inmar.exercise1.pojo.Department;

public class Location {
	private Integer locId;
	private String locationId;
	private String description;
	private Set<Department> departments;

	public String getLocationId() {
		return locationId;
	}
	
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Set<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(Set<Department> departments) {
		this.departments = departments;
	}

	public Integer getLocId() {
		return locId;
	}

	public void setLocId(Integer locId) {
		this.locId = locId;
	}

	@Override
	public String toString() {
		return "Location [locId=" + locId + ", locationId=" + locationId + ", description=" + description + "]";
	}
}
