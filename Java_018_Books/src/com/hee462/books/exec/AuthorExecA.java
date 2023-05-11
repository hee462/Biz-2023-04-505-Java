package com.hee462.books.exec;

import com.hee462.books.service.AuthorService;
import com.hee462.books.service.impl.AuthorServiceImpl;

public class AuthorExecA {
	public static void main(String[] args) {
		
		AuthorService auService = new AuthorServiceImpl();
		auService.loadAuthor();
		auService.printAuthor();
		auService.getAuthor("A0002").toString();
		
		System.out.println(auService.getAuthor("A0002").toString());
		
		
	}
}
