package com.hee462.books.exec;

import java.util.ArrayList;
import java.util.List;

import com.hee462.books.models.PublisherDto;
import com.hee462.books.service.PublisherService;
import com.hee462.books.service.impl.publisherServiceImplV1;

public class PublisherExecA {
	public static void main(String[] args) {
		
		List<PublisherDto> getList = new ArrayList<>();
		PublisherService pubService = new publisherServiceImplV1();
		
		pubService.loadPubliser();
		pubService.printPubliser();
		
		PublisherDto pDto = pubService.getPubliser("C0088");
		System.out.println(pDto.toString());
		
		getList = pubService.getPublisherList();
		System.out.println(getList.toString());
		
		
		getList = pubService.getPubliserListByName("a");
		System.out.println(getList);
		
		
		
	}
}
