package com.example.java.project.repository;

import com.example.java.project.entity.College;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CollegeRepository extends JpaRepository<College, Long> {
    // Custom query to find colleges where cutoff <= given percentage
    List<College> findByCutoffPercentageLessThanEqual(double cetPercentage);
}
