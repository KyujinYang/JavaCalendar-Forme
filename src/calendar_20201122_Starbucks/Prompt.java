package calendar_20201122_Starbucks;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";
	// �빮�ڴ� ���� ������� ��!! PROMPT(����ȵǴ°� private final)

	public void runPrompt() {
		Scanner scan = new Scanner(System.in);
		Repeatitive_while_if cal = new Repeatitive_while_if();

		int month = 3;

		while (true) {

			System.out.println("���� �Է��ϼ���");
			System.out.print(PROMPT);
			month = scan.nextInt();

			if (month == -1) {
				break;
			}
			// step4. -1�̸� �� ���ѷ����� �������Ͷ�
			if (month > 12) {
				continue;
			}

			System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�. \n", month, cal.getmaxDaysOfMonth(month));
		}

		System.out.printf("�̸� �����ڽ��ϴ�~������");
		scan.close();
	}

	public static void main(String[] args) {

		// �� ����
		Prompt P = new Prompt();
		P.runPrompt();

	}
}
