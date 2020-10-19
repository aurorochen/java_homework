package test02;

import java.util.Scanner;
import java.math.*;
public class test02_2 {
	public static void printMatrix(int n) {		
		int[][] arr=new int[n][n];
		for(int i=0;i<n;i++) { //生成并输出数组
			for(int j=0;j<n;j++) {
				float t = (float)(Math.random());//生成随机数，判断随机数大小来确定输入0还是1
				if(t<0.5) {
					arr[i][j] = 0;
				}
				else {
					arr[i][j] = 1;
				}
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Enter n:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		printMatrix(n);
	}
}
