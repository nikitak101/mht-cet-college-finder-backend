package com.example.java.project.service;

import com.example.java.project.entity.College;
import com.example.java.project.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CollegeService {

    @Autowired
    private CollegeRepository collegeRepository;

    public List<College> getCollegesByCetPercentage(double cetPercentage) {
        return collegeRepository.findByCutoffPercentageLessThanEqual(cetPercentage);
    }
}
