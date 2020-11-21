package calendar_20201121_Twosome;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		System.out.println("Hello,Calendar");
		
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		//scanner 자동으로 갖고오는 명령어 Ctrl+shift+m => import java.util.scanner
		// 스캐너 클래스를 이용하여 사용자에게 입력받는다.

		// import java.util.Scanner; 위에처럼 클래스를 임폴트 하여 사용한다.
		// 1. 스캐너 클래스 선언
		Scanner scan = new Scanner(System.in);
		// 2. 달 입력 메시지 출력
		System.out.println("달을 입력하세요");
		// 3. 스캐너를 통해 사용자로부터 콘솔에 값 입력
		int month = scan.nextInt();
		System.out.println("입력받은 숫자 : " + month);
		scan.close();
		int[] maxDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		System.out.printf("%d월은 %d일까지 있습니다. \n", month, maxDays[month]);
		
		
		
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("달을 입력하세요");
		int month = Scanner.nextInt();				// =>>>>>>>>>>> 스캐너 클래스 변수명을 호출하여 사용
													// Scanner. 이 형태는 잘못 선언된 형태이다.
		Scanner.close();
		
		int[] maxDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.printf("%d일은 %d일까지 있습니다. \n, month, maxDays[month]");
		1) %d월   <= 여기서 %d는 정수를 나타내는 기호로 int month 를 매핑하여 변수처리 한것임.
		2) %d일   <= 마찬가지로 maxDays[month] 를 매핑.
	 
	===> "%d일은 %d일까지 있습니다. \n, month, maxDays[month]" 이게아니라
	-==> "%d월은 %d일까지 있습니다. \n", month, maxDays[month]

		
		*/
		

	}

}
