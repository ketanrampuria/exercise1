package com.inmar.exercise1.pojo;

import java.util.Set;

public class Category {
	private Integer catId;
	private String categoryId;
	private String description;
	private Department department;
	private Set<SubCategory> subCategories;
	
	public Integer getCatId() {
		return catId;
	}
	public void setCatId(Integer catId) {
		this.catId = catId;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Set<SubCategory> getSubCategories() {
		return subCategories;
	}
	public void setSubCategories(Set<SubCategory> subCategories) {
		this.subCategories = subCategories;
	}
	@Override
	public String toString() {
		return "Category [catId=" + catId + ", categoryId=" + categoryId + ", description=" + description + "]";
	}
}
