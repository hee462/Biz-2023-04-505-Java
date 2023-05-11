package com.hee462.books.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hee462.books.config.Utils;
import com.hee462.books.models.AuthorDto;
import com.hee462.books.service.AuthorService;

public class AuthorServiceImpl implements AuthorService {

	protected List<AuthorDto> auList;

	public AuthorServiceImpl() {
		auList = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loadAuthor() {
		String AuthorFile = "src/com/hee462/books/data/저자정보(2023-05-11).txt";
		Scanner fileScan = null;
		InputStream is = null;

		try {
			is = new FileInputStream(AuthorFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(AuthorFile + "파일이 없습니다.");
			return;
		}

		fileScan = new Scanner(is);
		while (fileScan.hasNext()) {
			AuthorDto aDto = new AuthorDto();
			String line = fileScan.nextLine();
			String[] list = line.split(",");
			aDto.setAuCode(list[0]);
			aDto.setAuName(list[1]);
			aDto.setAuTel(list[2]);
			aDto.setAuAddress(list[3]);

			auList.add(aDto);
		}

	}

	@Override
	public void printAuthor() {

		System.out.println(Utils.dLine(100));
		System.out.println("저자코드\t저자명\t\t전화번호\t주소");
		System.out.println(Utils.sLine(100));

		for (AuthorDto aDto : auList) {
			System.out.printf("%-10s\t", aDto.getAuCode());
			System.out.printf("%-10s\t", aDto.getAuName());
			System.out.printf("%s\t", aDto.getAuTel());
			System.out.printf("%s\n", aDto.getAuAddress());

		}

	}

	@Override
	public AuthorDto getAuthor(String code) {
		for (AuthorDto aDto : auList) {
			if (aDto.getAuCode().equals(code)) {
				return aDto;
			}
		}

		return null;
	}

	@Override
	public List<AuthorDto> getAuthorList() {
		if(auList.isEmpty()) {
			this.loadAuthor();
		}
		return auList;
	}

}
