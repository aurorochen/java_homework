package test02;

import java.util.Scanner;

public class test02_4 {
	public static int indexOfSmallestElement(double[] array) {
		double num = array[0];
		int c = 0;
		for(int i = 0;i<array.length;i++) {//�������飬��Сֵ������num�У���Сֵ�±걣����c��
			if(array[i]<num) {
				num = array[i];
				c=i;
			}
		}
		return c;//������Сֵ�±�
	}
	public static void main(String[] args) {
		System.out.println("���������鳤��");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double[] arr = new double[n];
		System.out.println("�������������ݣ�");//�������Ԫ��
		for(int i = 0;i<n;i++) {
			arr[i] = input.nextDouble();
		}
		System.out.println("��СԪ���±�Ϊ��"+indexOfSmallestElement(arr));
	}

}
