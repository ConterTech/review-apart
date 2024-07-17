package com.example.samuraitravel.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.samuraitravel.entity.ReviewEntity;
import com.example.samuraitravel.repository.ReviewRepository;

@Controller
@RequestMapping("/houses")
public class ReviewController {
	private final ReviewRepository reviewRepository;
	
	public ReviewController(ReviewRepository reviewRepository) {
		this.reviewRepository = reviewRepository;
	}
	
	
    @GetMapping("/{id}/review")
    public String index(@PathVariable(name = "id") Integer id, @PageableDefault(page=0, size=10, sort="id", direction=Direction.ASC) Pageable pageable, Model model) {
        Page<ReviewEntity> reviews = reviewRepository.findByIdOrderByCreatedAtDesc(id, pageable);
        
        model.addAttribute("reviews", reviews);
        
        return "review/index";
    }
}
