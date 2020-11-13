package test03;
import java.util.Date;
import java.util.Scanner;

public class test03_01 {
	public static void main(String[] args) {
		System.out.println("请输入流逝时间：");
		Scanner input=new Scanner(System.in);
		long d = input.nextLong();
		Getdate(d);
	}
	public static void Getdate(long last) {
		Date current_time = new Date();
		System.out.println("当前时间为:"+current_time.toString());
		current_time.setTime(current_time.getTime()+last);
		System.out.println("经过"+last+"毫秒后，时间为："+current_time.toString());
	}
}

