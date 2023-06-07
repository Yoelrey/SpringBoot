package com.cebem.rickandmorty.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cebem.rickandmorty.models.CommentModel;

@Repository
public interface CommentRepository extends JpaRepository<CommentModel,Long>{
    ArrayList<CommentModel>finByVideogameIdOrderByCreatedAtDesc(Long videogameId);

}
