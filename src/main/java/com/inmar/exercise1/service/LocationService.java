package com.inmar.exercise1.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inmar.exercise1.pojo.Location;
import com.inmar.exercise1.pojo.SubCategory;
import com.inmar.exercise1.pojo.Category;
import com.inmar.exercise1.pojo.Department;
import com.inmar.exercise1.repository.LocationRepository;


@Service
public class LocationService implements LocationServiceInf {
	@Autowired
	private LocationRepository locationRepository;
		
	final Logger logger = LoggerFactory.getLogger(LocationService.class);

	public List<Location> getLocations() {
				
		List<Location> responseList = convertToLocationPOJO(locationRepository.findAll());
		
		logger.info("results list: " + responseList.toString());
		return responseList;
	}

	public Set<Department> getDepartments(String locationId) {
		Set<Department> responseList = new HashSet<Department>();
		try {
			com.inmar.exercise1.entity.Location location = findByLocationId(locationId);
 			//System.out.println("Result: " + findByLocationId(locationId));
			if(location != null) {
				Set<com.inmar.exercise1.entity.Department> departments = location.getDepartments();
				//System.out.println("depts: "+ departments);
				responseList = convertToDepartmentPOJO(departments);
			}
		}
		catch(IndexOutOfBoundsException e) {
			logger.error("no entity found with the location ID provided");
			e.printStackTrace();
		}
		
		logger.info("results list: " + responseList.toString());

		return responseList;
	}
	
	public Set<Category> getCategories(String locationId, String departmentId) {
		Set<Category> responseList = new HashSet<Category>();
		com.inmar.exercise1.entity.Department department = findByDepartmentId(locationId, departmentId);
		if(department != null && !department.getCategories().isEmpty()) {
			responseList = convertToCategoryPOJO(department.getCategories());
		}
		
		logger.info("results list: " + responseList.toString());

		return responseList;
	}
	
	public Set<SubCategory> getSubCategories(String locationId, String departmentId, String categoryId) {
		Set<SubCategory> responseList = new HashSet<SubCategory>();
		com.inmar.exercise1.entity.Category category = findByCategoryId(locationId, departmentId, categoryId);
		if(category != null && !category.getSubCategories().isEmpty()) {
			responseList = convertToSubCategoryPOJO(category.getSubCategories());
		}
		
		logger.info("results list: " + responseList.toString());

		return responseList;
	}
	
	private com.inmar.exercise1.entity.Location findByLocationId(String locationId) {
		return locationRepository.findByLocationId(locationId).get(0);
	}
	
	private com.inmar.exercise1.entity.Department findByDepartmentId(String locationId, String departmentId) {
		com.inmar.exercise1.entity.Location location = findByLocationId(locationId);
		if(location != null && !location.getDepartments().isEmpty()) {
			for(com.inmar.exercise1.entity.Department department: location.getDepartments()) {
				if(department.getDepartmentId().equals(departmentId)) {
					return department;
				}
			}
		}
		return null;
	}
	
	private com.inmar.exercise1.entity.Category findByCategoryId(String locationId, String departmentId, String categoryId) {
		com.inmar.exercise1.entity.Department department = findByDepartmentId(locationId, departmentId);
		if(department != null && !department.getCategories().isEmpty()) {
			for(com.inmar.exercise1.entity.Category category: department.getCategories()) {
				if(category.getCategoryId().equals(categoryId)) {
					return category;
				}
			}
		}
		return null;
	}

	private List<Location> convertToLocationPOJO(List<com.inmar.exercise1.entity.Location> locations) {
		List<Location> locationsPOJO = new ArrayList<Location>();
		for (com.inmar.exercise1.entity.Location location : locations) {
			Location loc = new Location();
			loc.setLocId(location.getLocId());
			loc.setLocationId(location.getLocationId());
			loc.setDescription(location.getDescription());
			
			//not required as of now
			//loc.setDepartments(convertToDepartmentPOJO(location.getDepartments()));
			locationsPOJO.add(loc);
		}
		return locationsPOJO;
	}
	
	private Set<Department> convertToDepartmentPOJO(Set<com.inmar.exercise1.entity.Department> departments) {
		Set<Department> departmentsPOJO = new HashSet<Department>();
		for (com.inmar.exercise1.entity.Department department : departments) {
			Department dep = new Department();
			dep.setDepId(department.getDepId());
			dep.setDepartmentId(department.getDepartmentId());
			dep.setDescription(department.getDescription());
			
			//not required as of now
			//dep.setCategories(convertToCategoryPOJO(department.getCategories()));
			departmentsPOJO.add(dep);
		}
		return departmentsPOJO;
	}
	
	private Set<Category> convertToCategoryPOJO(Set<com.inmar.exercise1.entity.Category> categories) {
		Set<Category> categoriesPOJO = new HashSet<Category>();
		for(com.inmar.exercise1.entity.Category category: categories) {
			Category cat = new Category();
			cat.setCategoryId(category.getCategoryId());
			cat.setCatId(category.getCatId());
			cat.setDescription(category.getDescription());
			
			//cat.setSubCategories(convertToSubCategoryPOJO(category.getSubCategories));
			categoriesPOJO.add(cat);
		}
		return categoriesPOJO;
	}
	
	private Set<SubCategory> convertToSubCategoryPOJO(Set<com.inmar.exercise1.entity.SubCategory> subCategories) {
		Set<SubCategory> subCategoriesPOJO = new HashSet<SubCategory>();
		for(com.inmar.exercise1.entity.SubCategory subCategory: subCategories) {
			SubCategory sub = new SubCategory();
			sub.setSubCatId(subCategory.getSubCatId());
			sub.setSubCategoryId(subCategory.getSubCategoryId());
			sub.setDescription(subCategory.getDescription());
			
			subCategoriesPOJO.add(sub);
		}
		return subCategoriesPOJO;
	}
}
