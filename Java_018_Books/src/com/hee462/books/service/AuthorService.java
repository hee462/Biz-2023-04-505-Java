package com.hee462.books.service;

import java.util.List;

import com.hee462.books.models.AuthorDto;

public interface AuthorService {
	
	public void loadAuthor();
	public void printAuthor();
	
	public AuthorDto getAuthor(String code);
	public List<AuthorDto> getAuthorList();
	
	
	
}
