package calendar_20201121_Twosome;

import java.util.Scanner;

public class sum_of_two_numbers {

	public static void main(String[] args) {
		
		
		int a,b;
		//�Է�: Ű����� �� ���� �Է��� �޴´�.
		Scanner scanner = new Scanner(System.in);
		//scnner�� ������!
		//scanner �ڵ����� ������� ��ɾ� Ctrl+shift+m => improt java.util.scanner
		String s1, s2;
		System.out.println("�� ���� �Է��ϼ���");
	
		s1 = scanner.next();
		s2 = scanner.next();

		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		//����2) System.out.println(a + ", +" + b);
		//����2)System.out.println("�� ���� ���� " + (a + b) + "�Դϴ�.");
		
		//���: ȭ�鿡 �� ���� ���� ����Ѵ�.
		System.out.printf("%d�� %d�� ���� %d�Դϴ�.",a,b, a + b);
		scanner.close();
		//scanner�� �ݾҴ�! console ����� Ctrl+F11
	}

}
