package com.inmar.exercise1.service;

import java.util.List;
import java.util.Set;

import com.inmar.exercise1.pojo.Category;
import com.inmar.exercise1.pojo.Department;
import com.inmar.exercise1.pojo.Location;
import com.inmar.exercise1.pojo.SubCategory;


public interface LocationServiceInf {
	
	List<Location> getLocations();
	
	Set<Department> getDepartments(String locationId);
	
	Set<Category> getCategories(String locationId, String departmentId);
	
	Set<SubCategory> getSubCategories(String locationId, String departmentId, String categoryId);

}
