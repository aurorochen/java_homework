package test02;

import java.util.Scanner;

public class test02_4 {
	public static int indexOfSmallestElement(double[] array) {
		double num = array[0];
		int c = 0;
		for(int i = 0;i<array.length;i++) {//遍历数组，最小值保存在num中，最小值下标保存在c中
			if(array[i]<num) {
				num = array[i];
				c=i;
			}
		}
		return c;//返回最小值下标
	}
	public static void main(String[] args) {
		System.out.println("请输入数组长度");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double[] arr = new double[n];
		System.out.println("请输入数组数据：");//填充数组元素
		for(int i = 0;i<n;i++) {
			arr[i] = input.nextDouble();
		}
		System.out.println("最小元素下标为："+indexOfSmallestElement(arr));
	}

}
