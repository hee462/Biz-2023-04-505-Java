package java_800_Exam.models;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class GuideService implements java_800_Exam.Service.GuideService {

	List<GuideDto> guideList;

	public void GuideServiceImplV1() {
	
		this.guideList = new ArrayList<>();
	}

	@Override
	public void loadService() {
		String Gufile = "src/java_Test/guide.txt";
		Scanner fileScan = null;
		InputStream is = null;
		try {
			is = new FileInputStream(Gufile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fileScan = new Scanner(is);
		while (fileScan.hasNext()) {
			
			GuideDto guDto = new GuideDto();
			String line = fileScan.nextLine();
		    String[] list =  line.split(",");
		    guDto.setId(list[0]);
		    guDto.setItem(list[1]);
		    guDto.setSeq(0);
		    guDto.setGuide(list[3]);
		    guideList.add(guDto);
			
			
		}

	}

	@Override
	public void printService() {
		
		
		System.out.println("=".repeat(150));
		System.out.println("ID\t 종목명\t 순서\t 가이드");
		System.out.println("-".repeat(150));
		String id = null;
		for(GuideDto dto : guideList) {
			
			if(id != null &&!id.equals(dto.id)) {
				System.out.println("-".repeat(150));
			}
			id = dto.id;
			
			System.out.printf("%s\t" , dto.id);
			System.out.printf("%s\t" , dto.item);
			System.out.printf("%s\t" , dto.seq);
			System.out.printf("%s\n" , dto.guide);
		}
		System.out.println("=".repeat(150));
		
		
		
		// TODO Auto-generated method stub

	}

}
