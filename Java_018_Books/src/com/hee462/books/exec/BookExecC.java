package com.hee462.books.exec;

import com.hee462.books.service.BookService;
import com.hee462.books.service.impl.BookServiceImplV2;

public class BookExecC {
	public static void main(String[] args) {
		
		BookService bookService = new BookServiceImplV2();
		bookService.loadBook();
		bookService.printBook();
		
		
	}
}	
