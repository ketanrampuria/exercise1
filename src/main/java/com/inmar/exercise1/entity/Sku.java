package com.inmar.exercise1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sku_info")
public class Sku {
	
	@Id
	@Column(name = "sku_id")
	private Integer skuId;
	
	@Column(name = "sku_name")
	private String skuName;
	
	@Column(name = "location_id")
	private String locationId;
	
	@Column(name = "department_id")
	private String departmentId;
	
	@Column(name = "category_id")
	private String categoryId;
	
	@Column(name = "sub_category_id")
	private String subCategoryId;

	public Integer getSkuId() {
		return skuId;
	}

	public void setSkuId(Integer skuId) {
		this.skuId = skuId;
	}

	public String getSkuName() {
		return skuName;
	}

	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(String subCategoryId) {
		this.subCategoryId = subCategoryId;
	}
}
