package com.shrenik.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shrenik.entity.Author;
import com.shrenik.repository.AuthorRepository;


@RestController
@RequestMapping("/author")
@CrossOrigin(origins="http://localhost:4400")
public class AuthorController {
	
	@Autowired
	private AuthorRepository authorRepository;
	
	@GetMapping("/find")
	public List<Author> getAllAuthors(){
		return authorRepository.findAll(); 
	}
	
	
	@PostMapping("/create")
	public Author createAuthor(@RequestBody Author author)
	{
		return this.authorRepository.save(author);
	}
	
}
