package com.example.java.project.controller;

import com.example.java.project.entity.College;
import com.example.java.project.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3001") // Allow frontend
@RestController
@RequestMapping("/api/colleges")
public class CollegeController {

    @Autowired
    private CollegeService collegeService;

    // Fetch colleges based on CET percentage
    @GetMapping("/search")
    public List<College> getColleges(@RequestParam double cetPercentage) {
        return collegeService.getCollegesByCetPercentage(cetPercentage);
    }
}
