package calendar_20201122_Starbucks;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";
	// 대문자는 보통 변경없다 뜻!! PROMPT(변경안되는것 private final)

	public void runPrompt() {
		Scanner scan = new Scanner(System.in);
		Repeatitive_while_if cal = new Repeatitive_while_if();

		int month = 3;

		while (true) {

			System.out.println("달을 입력하세요");
			System.out.print(PROMPT);
			month = scan.nextInt();

			if (month == -1) {
				break;
			}
			// step4. -1이면 이 무한루프를 빠져나와라
			if (month > 12) {
				continue;
			}

			System.out.printf("%d월은 %d일까지 있습니다. \n", month, cal.getmaxDaysOfMonth(month));
		}

		System.out.printf("이만 가보겠습니다~총총총");
		scan.close();
	}

	public static void main(String[] args) {

		// 셀 실행
		Prompt P = new Prompt();
		P.runPrompt();

	}
}
