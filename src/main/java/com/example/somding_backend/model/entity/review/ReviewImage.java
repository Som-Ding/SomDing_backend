package com.example.somding_backend.model.entity.review;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "review_img")
public class ReviewImage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //photo


    @ManyToOne
    @JoinColumn(name = "review_id")
    private Review review;
}
