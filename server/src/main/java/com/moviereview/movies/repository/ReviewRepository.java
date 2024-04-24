package com.moviereview.movies.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.moviereview.movies.dto.Review;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
    
}