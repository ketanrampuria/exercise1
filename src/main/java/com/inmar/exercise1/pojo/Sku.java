package com.inmar.exercise1.pojo;

public class Sku {

	private Integer skuId;
	private String skuName;
	private String locationId;
	private String departmentId;
	private String categoryId;
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

	@Override
	public String toString() {
		return "Sku [skuId=" + skuId + ", skuName=" + skuName + ", locationId=" + locationId + ", departmentId="
				+ departmentId + ", categoryId=" + categoryId + ", subCategoryId=" + subCategoryId + "]";
	}
}
