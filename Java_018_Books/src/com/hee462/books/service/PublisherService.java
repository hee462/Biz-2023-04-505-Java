package com.hee462.books.service;

import java.util.List;

import com.hee462.books.models.PublisherDto;

public  interface PublisherService {
	
	public void loadPubliser();
	public void printPubliser();
	public PublisherDto getPubliser(String code);
	public List<PublisherDto> getPublisherList();
	public List<PublisherDto> getPubliserListByName(String name);
	
}
