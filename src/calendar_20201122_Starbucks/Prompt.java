//step6. PROMPT 이용 예뿌게 변경~ 행바꿈\n, 윤달

package calendar_20201122_Starbucks;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";
	// 대문자는 보통 변경없다 뜻!! PROMPT(변경안되는것 private final)

	public void runPrompt() {
		Scanner scan = new Scanner(System.in);
		// Repeatitive_while_if cal = new Repeatitive_while_if();
		Virtual_calendar_output cal = new Virtual_calendar_output();

		int year = 5;
		int month = 3;

		// step6. 년도도 입력되게 출력!
		while (true) {
			System.out.println("\n년도을 입력하세요");
			System.out.print("YEAR>  ");
			
			year = scan.nextInt();
			System.out.println("달을 입력하세요");
			System.out.print("MONTH>  ");
			month = scan.nextInt() ;

			
			// -1 이면 루프를 중지시키고 메시지를 출력한다.
			if (month == -1) {
				System.out.printf("이만 가보겠습니다~총총총");
				
				break;
			}
			// step4. -1이면 이 무한루프를 빠져나와라
			if (month > 12) {
				continue;
			}

			cal.printCalendar(year, month);

		}

		scan.close();
	}

	public static void main(String[] args) {

		// 셀 실행
		Prompt P = new Prompt();
		P.runPrompt();

	}
}
