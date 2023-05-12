package com.hee462.books.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hee462.books.config.Utils;
import com.hee462.books.models.PublisherDto;
import com.hee462.books.service.PublisherService;

public class publisherServiceImplV1 implements PublisherService {

	private List<PublisherDto> pubList;

	public publisherServiceImplV1() {
		pubList = new ArrayList<>();
	}

	@Override
	public void loadPubliser() {

		String pubFile = "src/com/hee462/books/data/출판사정보(2023-05-11).txt";
		Scanner fileScan = null;
		InputStream is = null;

		try {
			is = new FileInputStream(pubFile);
		} catch (FileNotFoundException e) {
			System.out.println(pubFile + "파일이 없습니다.");
			e.printStackTrace();
		}
		fileScan = new Scanner(is);
		while (fileScan.hasNext()) {
			PublisherDto pubDto = new PublisherDto();
			String line = fileScan.nextLine();
			String[] list = line.split(",");
			pubDto.setPubCode(list[0]);
			pubDto.setPubName(list[1]);
			pubDto.setPubCeo(list[2]);
			pubDto.setPubTel(list[3]);
			pubDto.setPubAddress(list[4]);

			pubList.add(pubDto);
		}

	}

	@Override
	public void printPubliser() {

		System.out.println(Utils.dLine(100));
		System.out.println("출판사코드\t출판사명\t대표\t전화번호\t주소");
		System.out.println(Utils.sLine(100));
		for (PublisherDto pDto : pubList) {
			System.out.printf("%s\t", pDto.getPubCode());
			System.out.printf("%-15s\t", pDto.getPubName());
			System.out.printf("%-2s\t", pDto.getPubCeo());
			System.out.printf("%s\t", pDto.getPubTel());
			System.out.println(pDto.getPubAddress());

		}
		System.out.println(Utils.dLine(100));

	}

	@Override
	public PublisherDto getPubliser(String code) {
		for (PublisherDto pDto : pubList) {
			if (pDto.getPubCode().equals(code)) {
				return pDto;
			}
		}
		return null;
	}

	@Override
	public List<PublisherDto> getPublisherList() {
		return pubList;
	}

	@Override
	public List<PublisherDto> getPubliserListByName(String name) {
		List<PublisherDto> pList = new ArrayList<>();

		for (PublisherDto pDto : pubList) {
			if (pDto.getPubName().contains(name)) {
				pList.add(pDto);
			}
		}
		return pList;

	}

}
