package com.shrenik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shrenik.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer>{

}
