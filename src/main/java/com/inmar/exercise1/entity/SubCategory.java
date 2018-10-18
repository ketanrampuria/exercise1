package com.inmar.exercise1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SubCategory {
	
	@Id
	@Column(name = "sub_cat_id")
	private Integer subCatId;
	
	@Column(name = "sub_category_id")
	private String subCategoryId;
	
	@Column(name = "description")
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "cat_id")
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
}
