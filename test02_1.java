package test02;

import java.util.Scanner;

public class test02_1 {
	public static void reserve(int number) {
		String num = Integer.toString(number);
		String[] num1 = num.split("");
		System.out.println("�����ķ�����Ϊ��");
		for(int i = num1.length-1;i>=0;i--) {
		System.out.print(num1[i]);
		}
	}
	public static void main(String[] args) {
		System.out.println("������һ����������");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		reserve(number);
	}
}
