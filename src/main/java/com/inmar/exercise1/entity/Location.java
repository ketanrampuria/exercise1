package com.inmar.exercise1.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "location")
@Table(name = "location")
public class Location {
	@Id
	@Column(name = "loc_id")
	private Integer locId;
	
	@Column(name = "location_id")
	private String locationId;

	@Column(name = "description")
	private String description;
	
	@OneToMany(mappedBy = "location")
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
}
