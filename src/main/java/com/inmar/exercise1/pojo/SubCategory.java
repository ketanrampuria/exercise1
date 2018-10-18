package com.inmar.exercise1.pojo;


public class SubCategory {
	private Integer subCatId;
	private String subCategoryId;
	private String description;
	private Category category;
	
	public Integer getSubCatId() {
		return subCatId;
	}
	public void setSubCatId(Integer subCatId) {
		this.subCatId = subCatId;
	}
	public String getSubCategoryId() {
		return subCategoryId;
	}
	public void setSubCategoryId(String subCategoryId) {
		this.subCategoryId = subCategoryId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "SubCategory [subCatId=" + subCatId + ", subCategoryId=" + subCategoryId + ", description=" + description
				+ "]";
	}
}
