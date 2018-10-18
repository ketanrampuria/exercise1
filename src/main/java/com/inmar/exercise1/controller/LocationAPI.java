package com.inmar.exercise1.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inmar.exercise1.pojo.Category;
import com.inmar.exercise1.pojo.Department;
import com.inmar.exercise1.pojo.Location;
import com.inmar.exercise1.pojo.SubCategory;
import com.inmar.exercise1.service.LocationService;
import com.inmar.exercise1.service.LocationServiceInf;

@RestController
@RequestMapping(value = "api/v1/location")
public class LocationAPI {
	@Autowired
	private LocationServiceInf locationService;
	
	final Logger logger = LoggerFactory.getLogger(LocationAPI.class);
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Location> getLocations() {
		
		logger.info("Received GET Request for locations");
		
		return locationService.getLocations(); 
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{location_id}/department")
	public Set<Department> getDepartments(
			@PathVariable("location_id") String locationId) {
		
		logger.info("Received GET Request for departments. Parameters: location - " + locationId);
		
		return locationService.getDepartments(locationId);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{location_id}/department/{department_id}/category")
	public Set<Category> getCategories(
			@PathVariable("location_id") String locationId, 
			@PathVariable("department_id") String departmentId) {
		
		logger.info("Received GET Request for categories. Parameters: location - " + locationId + ", department - " + departmentId);
		
		return locationService.getCategories(locationId, departmentId);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{location_id}/department/{department_id}/category/{category_id}/subcategory")
	public Set<SubCategory> getSubCategories(
			@PathVariable("location_id") String locationId, 
			@PathVariable("department_id") String departmentId,
			@PathVariable("category_id") String categoryId) {
		
		logger.info("Received GET Request for sub categories. Parameters: location - " + locationId + ", department - " + departmentId + ", category - " + categoryId);
		
		return locationService.getSubCategories(locationId, departmentId, categoryId);
	}
}
