package com.inmar.exercise1.service;

import java.util.List;

import com.inmar.exercise1.pojo.Sku;

public interface SkuServiceInf {
	List<Sku> getSkus(
			String locationId,
			String departmentId,
			String categoryId,
			String subCategoryId);
}
