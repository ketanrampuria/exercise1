package com.inmar.exercise1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inmar.exercise1.entity.Sku;

@Repository
public interface SkuRepository extends JpaRepository<Sku, Integer> {
	List<Sku> findByLocationIdAndDepartmentIdAndCategoryIdAndSubCategoryId(
			String locationId,
			String departmentId,
			String categoryId,
			String subCategoryId);
}
