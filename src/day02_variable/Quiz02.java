package day02_variable;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int kor,eng,mat,sum;
		System.out.println("����� �̸��� �����Դϱ� ?  ");
		name = input.next();
		System.out.println(name+" ���� ���� ���� : ");
		kor = input.nextInt();
		System.out.println(name+" ���� ���� ���� : ");
		eng = input.nextInt();
		System.out.println(name+" ���� ���� ���� : ");
		mat = input.nextInt();
		sum = kor+eng+mat;
		
		System.out.println("�� �� : "+name);
		System.out.println("�� �� : "+kor);
		System.out.println("�� �� : "+eng);
		System.out.println("�� �� : "+mat);
		System.out.println("�� �� : "+sum);
	}

}
