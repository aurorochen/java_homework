package test02;

import java.util.Scanner;

public class test02_5 {
	public static double sumMajorDiagonal(double[][] m) {//求对角线矩阵
		double sum = 0;
		for(int i = 0;i<m.length;i++) {
			sum += m[i][i];
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("请输入矩阵行列数：");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double[][] array = new double[n][n];
		for(int i = 0;i<n;i++) { //输入矩阵
			System.out.println("请输入第"+i+"行的数据：");
			for(int j =0;j<n;j++) {
				array[i][j] = input.nextDouble();
			}
		}
		System.out.println("矩阵为：");
		for(int i = 0;i<n;i++) { //输出矩阵
			for(int j =0;j<n;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("对角线元素和为："+sumMajorDiagonal(array));
	}
}
