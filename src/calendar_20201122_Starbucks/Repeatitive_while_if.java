package calendar_20201122_Starbucks;

import java.util.Scanner;

public class Repeatitive_while_if {

	// �Լ��� ������ش�! public int maxDaysOfMonth(int month) {
	private static final int[] MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getmaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public static void main(String[] args) {

		// ���ڸ� �Է¹޾� �ش��ϴ� �޿� �ִ� �ϼ��� ����ϴ� ���α׷�
		
		
		String PROMPT="cal> ";
		//step4. 1. PROMPT���1
		Scanner scan = new Scanner(System.in);
		Repeatitive_while_if cal = new Repeatitive_while_if();

		System.out.println("�ݺ�Ƚ���� �Է��ϼ���");
		// step3. �ݺ��������÷���~~!!

		
		int repeat = scan.nextInt();

		// step3. Ƚ���� �� �˶��� for, Ƚ���� �� ���� ���� ���� while ����.
		for (int i = 0; i < repeat; i++) {
			// step3. n�� �ݺ��ϴ� �ڵ�! ������ for�� �� ���� �̷��� ���־��Ŵ�.
			System.out.println("���� �Է��ϼ���");
			System.out.print(PROMPT);
			//step4. 2.PROMPT �־���
			int month = scan.nextInt();
			System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�. \n", month, cal.getmaxDaysOfMonth(month));
		}

		System.out.printf("Bye~");
		scan.close();
	}
}
	