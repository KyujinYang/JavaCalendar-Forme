//commit 전 ctrl shift f눌러 배열정리하기! 

package calendar_20201121_Twosome;

import java.util.Scanner;

public class Calendar {

	// 함수를 만들어준다! public int maxDaysOfMonth(int month) {
	private static final int[] MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getmaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Calendar cal = new Calendar();
		

		System.out.println("반복횟수를 입력하세요");
		// step3. 반복문설정플러스~~!!
		int repeat = scan.nextInt();
		// step3. 횟수를 잘 알때는 for, 횟수를 잘 알지 못할 때는 while 쓴다.

		for (int i = 0; i < repeat; i++) {
			// step3. n번 반복하는 코드! 앞으로 for문 쓸 경우는 이렇게 자주쓸거다.
			int month = scan.nextInt();
			System.out.printf("%d월은 %d일까지 있습니다. \n", month, cal.getmaxDaysOfMonth(month));
		}

		System.out.printf("Bye~");
		scan.close();
	}

		/*
		 * System.out.println("달을 입력하세요"); // 3. 스캐너를 통해 사용자로부터 콘솔에 값 입력
		 * 
		 * System.out.println("입력받은 숫자 : " + month); scan.close(); int[] MaxDays = { 31,
		 * 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		 * 
		 * // step1.commit 시 System.out.printf("%d월은 %d일까지 있습니다. \n", month, //
		 * maxDays[month-1]) // step2. maxDays[month-1] ---->
		 * cal.getmaxDaysOfMonth(month))
		 */

		/*
		 * Scanner scanner = new Scanner(System.in); System.out.println("달을 입력하세요"); int
		 * month = Scanner.nextInt(); // =>>>>>>>>>>> 스캐너 클래스 변수명을 호출하여 사용 // Scanner. 이
		 * 형태는 잘못 선언된 형태이다. Scanner.close();
		 * 
		 * int[] maxDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		 * 
		 * System.out.printf("%d일은 %d일까지 있습니다. \n, month, maxDays[month-1]"); 1) %d월 <=
		 * 여기서 %d는 정수를 나타내는 기호로 int month 를 매핑하여 변수처리 한것임. 2) %d일 <= 마찬가지로
		 * maxDays[month] 를 매핑. 3) maxDays[month-1] 까지 적어주어야 한다! month만 쓰면 0월부터 있다
		 * 
		 * ===> "%d일은 %d일까지 있습니다. \n, month, maxDays[month]" 이게아니라 -==>
		 * "%d월은 %d일까지 있습니다. \n", month, maxDays[month]
		 * 
		 * commit 전에 자동정렬 ctrl shift F 눌러주기!!!
		 */

	}

}
