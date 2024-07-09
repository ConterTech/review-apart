package com.example.samuraitravel.controller;

import org.springframework.stereotype.Controller;

import com.example.samuraitravel.repository.ReviewRepository;

@Controller
//@RequestMapping("/houses")
public class ReviewController {
	private final ReviewRepository reviewRepository;
	
	public ReviewController(ReviewRepository reviewRepository) {
		this.reviewRepository = reviewRepository;
	}
	
//	@GetMapping("/review")
//	public String index() {
//		return "index";
//	}
	
	
}
