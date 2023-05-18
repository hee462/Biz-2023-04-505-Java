package java_020_bank.exec;



import java_020_bank.service.BuyerService;
import java_020_bank.service.impl.BuyerServiceImplV1A;

public class BuyerExecA {
	public static void main(String[] args) {
		
		BuyerService bService = new BuyerServiceImplV1A();
		bService.inputBuyer();
		/*
		 * printBuyerList() 에 전달할 출력 방향을 화면으로 지정하여전달
		 * PrintWriter out = new PrintWriter(System.out); 하는 코드
		 * 
		 * 아래 코드는 파일에 저장하는 코드
		 * OutputStream os = new FileOutputStream("파일");
		 * PrintWriter out = new PrintWriter(os);
		 */
//		PrintWriter out = new PrintWriter(System.out);
//		bService.printBuyerList(out);
//		out.close();
		bService.printBuyerList();
		bService.loadBuyer();
	}
	
}
