package calendar_20201122_Starbucks;

import java.util.Scanner;

public class Repeatitive_while_if {

	// 함수를 만들어준다! public int maxDaysOfMonth(int month) {
	private static final int[] MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getmaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public static void main(String[] args) {

		// 숫자를 입력받아 해당하는 달에 최대 일수를 출력하는 프로그램
		
		
		String PROMPT="cal> ";
		//step4. 1. PROMPT사용1
		Scanner scan = new Scanner(System.in);
		Repeatitive_while_if cal = new Repeatitive_while_if();

		System.out.println("반복횟수를 입력하세요");
		// step3. 반복문설정플러스~~!!

		
		int repeat = scan.nextInt();

		// step3. 횟수를 잘 알때는 for, 횟수를 잘 알지 못할 때는 while 쓴다.
		for (int i = 0; i < repeat; i++) {
			// step3. n번 반복하는 코드! 앞으로 for문 쓸 경우는 이렇게 자주쓸거다.
			System.out.println("달을 입력하세요");
			System.out.print(PROMPT);
			//step4. 2.PROMPT 넣어줌
			int month = scan.nextInt();
			System.out.printf("%d월은 %d일까지 있습니다. \n", month, cal.getmaxDaysOfMonth(month));
		}

		System.out.printf("Bye~");
		scan.close();
	}
}
	