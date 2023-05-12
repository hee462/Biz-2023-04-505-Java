package java_Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GuideServiceImplV1 implements GuideService {
	List<GuideDto> guList;

	public GuideServiceImplV1() {
		guList = new ArrayList<>();
	}

	@Override
	public void loadGuide() {

		String Gufile = "src/java_Test/guide.txt";
		Scanner fileScan = null;
		InputStream is = null;

		try {
			is = new FileInputStream(Gufile);
		} catch (FileNotFoundException e) {
			System.out.println(Gufile + "파일이 없습니다");
		}
		
		fileScan = new Scanner(is);
		while (fileScan.hasNext()) {
			GuideDto guDto = new GuideDto();
			String line = fileScan.nextLine();
		    String[] list =  line.split(",");
		    guDto.setExId(list[0]);
		    guDto.setExList(list[1]);
		    guDto.setExCount(list[2]);
		    guDto.setExGuide(list[3]);
		    guList.add(guDto);
		}

	}

	@Override
	public void printGuide() {
		
		
		System.out.println("=".repeat(100));
		System.out.println("id\t종목명\t 순서\t방법");
		System.out.println("-".repeat(100));
		
		
		
		for(GuideDto guDto : guList) {
			System.out.println(guDto.getExId());
			System.out.println(guDto.getExList());
			System.out.println(guDto.getExCount());
			System.out.println(guDto.getExGuide());
		}
		
	}

}
