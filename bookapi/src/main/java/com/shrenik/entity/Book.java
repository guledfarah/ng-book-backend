package com.shrenik.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Book2")
public class Book {

	@Id
	private int bookId;
	
	
}
