package com.inmar.exercise1.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inmar.exercise1.pojo.Sku;
import com.inmar.exercise1.service.SkuServiceInf;

@RestController
@RequestMapping(value = "api/v1/sku")
public class SkuAPI {
	@Autowired
	private SkuServiceInf skuService;
	
	final Logger logger = LoggerFactory.getLogger(SkuAPI.class);
	
	@RequestMapping(method = RequestMethod.GET, value="/{location_id}/{department_id}/{category_id}/{sub_category_id}")
	private List<Sku> getSkus(
			@PathVariable("location_id") String locationId, 
			@PathVariable("department_id") String departmentId,
			@PathVariable("category_id") String categoryId,
			@PathVariable("sub_category_id") String subCategoryId) {
		
		logger.info("Received GET Request for skus. Parameters: location - " + locationId + ", department - " + departmentId + ", category - " + categoryId + ", sub category - " + subCategoryId);

		return skuService.getSkus(locationId, departmentId, categoryId, subCategoryId);
	}
}
