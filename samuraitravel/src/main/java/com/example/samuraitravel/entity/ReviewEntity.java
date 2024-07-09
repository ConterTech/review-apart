package com.example.samuraitravel.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "review")
@Data
@IdClass(value=Reviewpk.class)
public class ReviewEntity {
	@Id
	@Column(name = "house_id")
	private Integer houseId;
	
	@Id
	@JoinColumn(name = "user_id")
	@OneToOne
	private User userId;
	
	@Column(name = "review_star")
	private int reviewStar;
	
	@Column(name = "review_text")
	private String reviewText;
	
	@Column(name = "created_at")
	private LocalDate createdAt;
	
	@Column(name = "updated_at")
	private LocalDate updatedAt;
	
	@Column(name = "delete_flag")
	private boolean deleteFlag;
}
