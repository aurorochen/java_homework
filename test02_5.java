package test02;

import java.util.Scanner;

public class test02_5 {
	public static double sumMajorDiagonal(double[][] m) {//��Խ��߾���
		double sum = 0;
		for(int i = 0;i<m.length;i++) {
			sum += m[i][i];
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("�����������������");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double[][] array = new double[n][n];
		for(int i = 0;i<n;i++) { //�������
			System.out.println("�������"+i+"�е����ݣ�");
			for(int j =0;j<n;j++) {
				array[i][j] = input.nextDouble();
			}
		}
		System.out.println("����Ϊ��");
		for(int i = 0;i<n;i++) { //�������
			for(int j =0;j<n;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("�Խ���Ԫ�غ�Ϊ��"+sumMajorDiagonal(array));
	}
}
