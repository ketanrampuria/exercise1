package com.inmar.exercise1.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inmar.exercise1.controller.LocationAPI;
import com.inmar.exercise1.pojo.Sku;
import com.inmar.exercise1.repository.SkuRepository;

@Service
public class SkuService implements SkuServiceInf {
	@Autowired
	private SkuRepository skuRepository;
	
	final Logger logger = LoggerFactory.getLogger(SkuService.class);

	public List<Sku> getSkus(
			String locationId,
			String departmentId,
			String categoryId,
			String subCategoryId) {
		List<com.inmar.exercise1.entity.Sku> skus = skuRepository
				.findByLocationIdAndDepartmentIdAndCategoryIdAndSubCategoryId
				(locationId, departmentId, categoryId, subCategoryId);
		
		List<Sku> responseList = convertToSkuPOJO(skus);
		
		logger.info("results list: " + responseList.toString());

		return responseList;
	}
	
	private List<Sku> convertToSkuPOJO(List<com.inmar.exercise1.entity.Sku> skus) {
		List<Sku> skusPOJO = new ArrayList<Sku>();
		for(com.inmar.exercise1.entity.Sku sku: skus) {
			Sku skuPOJO = new Sku();
			skuPOJO.setSkuId(sku.getSkuId());
			skuPOJO.setSkuName(sku.getSkuName());
			skuPOJO.setLocationId(sku.getLocationId());
			skuPOJO.setDepartmentId(sku.getDepartmentId());
			skuPOJO.setCategoryId(sku.getCategoryId());
			skuPOJO.setSubCategoryId(sku.getSubCategoryId());
			
			skusPOJO.add(skuPOJO);
		}
		return skusPOJO;
	}
}
