package test03;
import java.util.Date;
import java.util.Scanner;

public class test03_01 {
	public static void main(String[] args) {
		System.out.println("����������ʱ�䣺");
		Scanner input=new Scanner(System.in);
		long d = input.nextLong();
		Getdate(d);
	}
	public static void Getdate(long last) {
		Date current_time = new Date();
		System.out.println("��ǰʱ��Ϊ:"+current_time.toString());
		current_time.setTime(current_time.getTime()+last);
		System.out.println("����"+last+"�����ʱ��Ϊ��"+current_time.toString());
	}
}

