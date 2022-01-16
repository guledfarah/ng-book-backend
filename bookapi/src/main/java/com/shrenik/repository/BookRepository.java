package com.shrenik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shrenik.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
