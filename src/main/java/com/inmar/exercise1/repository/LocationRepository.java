package com.inmar.exercise1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inmar.exercise1.entity.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {
	
	// Function to fetch records based on a column other than primary key
	// Keep the parameter name similar to ref variable for that column
	List<Location> findByLocationId(String locationId);
}
