package com.inmar.exercise1.pojo;

import java.util.Set;

import com.inmar.exercise1.entity.Location;

public class Department {
	private Integer depId;
	private String departmentId;
	private String description;
	private Location location;
	private Set<Category> categories;
	
	public String getDepartmentId() {
		return departmentId;
	}
	
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}

	public Integer getDepId() {
		return depId;
	}

	public void setDepId(Integer depId) {
		this.depId = depId;
	}

	public Set<Category> getCategories() {
		return categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}

	@Override
	public String toString() {
		return "Department [depId=" + depId + ", departmentId=" + departmentId + ", description=" + description + "]";
	}
}
