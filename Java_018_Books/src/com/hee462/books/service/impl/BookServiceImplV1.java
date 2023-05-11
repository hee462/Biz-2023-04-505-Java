package com.hee462.books.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hee462.books.models.BookDto;
import com.hee462.books.service.BookService;

public class BookServiceImplV1 implements BookService {
	   List<BookDto> bkList;

	public BookServiceImplV1() {
		bkList = new ArrayList<>();

		// TODO Auto-generated constructor stub
	}

	@Override
	public void loadBook() {

		String bookFile = "src/com/hee462/books/data/도서정보(2023-05-11).txt";
		Scanner fileScan = null;
		InputStream is = null;

		try {
			is = new FileInputStream(bookFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(bookFile + "파일이 없습니다.");
			return;
		}

		fileScan = new Scanner(is);
		BookDto bkDto = new BookDto();
		while (fileScan.hasNext()) {
			
			String line = fileScan.nextLine();
			String[] book = line.split(",");
			bkDto.setbIsbn(book[0]);
			bkDto.setbTitle(book[1]);
			bkDto.setbPublisher(book[2]);
			bkDto.setbAuthor(book[3]);
			bkDto.setbPublishDate(book[4]);
			bkDto.setbPages(Integer.valueOf(book[5]));
			bkDto.setbPrice(Integer.valueOf(book[6]));
		    
		} 
			bkList.add(bkDto);
		

		// TODO Auto-generated method stub

	}

	@Override
	public void printBook() {

		System.out.println("=".repeat(100));
		System.out.println("ISBN\t도서명\t출판사\t저자\t발행일\t페이지\t가격");
		System.out.println("-".repeat(100));
		for(int i = 0 ; i < bkList.size() ; i++) {
			System.out.println(bkList.get(i).getbIsbn() +"\t");
			System.out.println(bkList.get(i).getbTitle() +"\t");
			System.out.println(bkList.get(i).getbPublisher() +"\t");
			System.out.println(bkList.get(i).getbAuthor() +"\t");
			System.out.println(bkList.get(i).getbPublishDate() +"\t");
			System.out.println(bkList.get(i).getbPages() +"\t");
			System.out.println(bkList.get(i).getbPrice() +"\t");
			
			
		}
		System.out.println("=".repeat(100));
	
		// TODO Auto-generated method stub

	}

	@Override
	public BookDto getBook(String isbn) {
		for(BookDto dto : bkList) {
		
			
		}
		
		return null;
	}

	@Override
	public List<BookDto> getBookList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBook(BookDto bookDto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBook(String isbn) {
		// TODO Auto-generated method stub

	}

}
