package test02;

import java.util.Scanner;
import java.math.*;

public class test02_3 {
	public static void main(String[] args) {
		int[] counts = new int[] {0,0,0,0,0,0,0,0,0,0};
		for(int i=0;i<100;i++) {
			int num = (int)(Math.random()*10);
			counts[num]++;
		}
		for(int i=0;i<10;i++) {
			System.out.println("数字"+i+"出现了"+counts[i]+"次");
		}
	}
}
