package calendar_20201122_Starbucks;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";
	// �빮�ڴ� ���� ������� ��!! PROMPT(����ȵǴ°� private final)

	public void runPrompt() {
		Scanner scan = new Scanner(System.in);
		//Repeatitive_while_if cal = new Repeatitive_while_if();
		Virtual_calendar_output cal = new Virtual_calendar_output();

		int month = 3;

		while (true) {

			System.out.println("���� �Է��ϼ���");
			System.out.print(PROMPT);
			month = scan.nextInt();

			// -1 �̸� ������ ������Ű�� �޽����� ����Ѵ�.
			if (month == -1) {
				System.out.printf("�̸� �����ڽ��ϴ�~������");
				break;
			}
			// step4. -1�̸� �� ���ѷ����� �������Ͷ�
			if (month > 12) {
				continue;
			}

			cal.printCalendar(2020, month); 

			
	
		}
		
		scan.close();
	}
	

	public static void main(String[] args) {

		// �� ����
		Prompt P = new Prompt();
		P.runPrompt();
		
		
	}
}
