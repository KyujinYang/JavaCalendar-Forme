//commit �� ctrl shift f���� �迭�����ϱ�! 

package calendar_20201121_Twosome;

import java.util.Scanner;

public class Calendar {

	// �Լ��� ������ش�! public int maxDaysOfMonth(int month) {
	private static final int[] MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getmaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Calendar cal = new Calendar();
		

		System.out.println("�ݺ�Ƚ���� �Է��ϼ���");
		// step3. �ݺ��������÷���~~!!
		int repeat = scan.nextInt();
		// step3. Ƚ���� �� �˶��� for, Ƚ���� �� ���� ���� ���� while ����.

		for (int i = 0; i < repeat; i++) {
			// step3. n�� �ݺ��ϴ� �ڵ�! ������ for�� �� ���� �̷��� ���־��Ŵ�.
			int month = scan.nextInt();
			System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�. \n", month, cal.getmaxDaysOfMonth(month));
		}

		System.out.printf("Bye~");
		scan.close();
	}

		/*
		 * System.out.println("���� �Է��ϼ���"); // 3. ��ĳ�ʸ� ���� ����ڷκ��� �ֿܼ� �� �Է�
		 * 
		 * System.out.println("�Է¹��� ���� : " + month); scan.close(); int[] MaxDays = { 31,
		 * 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		 * 
		 * // step1.commit �� System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�. \n", month, //
		 * maxDays[month-1]) // step2. maxDays[month-1] ---->
		 * cal.getmaxDaysOfMonth(month))
		 */

		/*
		 * Scanner scanner = new Scanner(System.in); System.out.println("���� �Է��ϼ���"); int
		 * month = Scanner.nextInt(); // =>>>>>>>>>>> ��ĳ�� Ŭ���� �������� ȣ���Ͽ� ��� // Scanner. ��
		 * ���´� �߸� ����� �����̴�. Scanner.close();
		 * 
		 * int[] maxDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		 * 
		 * System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�. \n, month, maxDays[month-1]"); 1) %d�� <=
		 * ���⼭ %d�� ������ ��Ÿ���� ��ȣ�� int month �� �����Ͽ� ����ó�� �Ѱ���. 2) %d�� <= ����������
		 * maxDays[month] �� ����. 3) maxDays[month-1] ���� �����־�� �Ѵ�! month�� ���� 0������ �ִ�
		 * 
		 * ===> "%d���� %d�ϱ��� �ֽ��ϴ�. \n, month, maxDays[month]" �̰Ծƴ϶� -==>
		 * "%d���� %d�ϱ��� �ֽ��ϴ�. \n", month, maxDays[month]
		 * 
		 * commit ���� �ڵ����� ctrl shift F �����ֱ�!!!
		 */

	}

}
