package day02_variable;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age;
		String name;
		System.out.println("�̸� �Է� : ");
		name = input.next();
		System.out.println("���� �Է� : ");
		age = input.nextInt();
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
	}
}
