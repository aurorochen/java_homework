package test04;

import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Scanner;



public class test04_02 {
	public static File[] dfs(String path) {
		File dir = new File(path);
		File[] fs = dir.listFiles();
		File temp;
		for(int i=0;i<fs.length;i++) {
			for(int j=i;j<fs.length;j++) {
				if(fs[i].getName().compareTo(fs[j].getName())>0){
					temp = fs[i];
					fs[i] = fs[j];
					fs[j] = temp;
				}
			}
		}
		for(int i=0;i<fs.length;i++) {
			if(fs[i].isDirectory()) {
				dfs(path+File.separator+fs[i].getName());
			}
		}
		
		return fs;
	}

	public static byte[] SHA1Checksum(File a[]) throws Exception {
		int len = a.length;
		MessageDigest m=MessageDigest.getInstance("SHA-1");
		for(int i=0;i<len;i++) {
			m.update(a[i].toString().getBytes("UTF-8"));
			
		}
		return m.digest();
	}

	public static void main(String[] args) {
		try {
			System.out.println("ÇëÊäÈëµØÖ·£º");
			Scanner input = new Scanner(System.in);
			String path = input.nextLine();
			File[] a = dfs(path);
			byte[] sha1 = SHA1Checksum(a);
			String result = "";
			for(int i =0;i<sha1.length;i++) {
				result += Integer.toString(sha1[i]&0xFF,16);
			}
			System.out.println(result);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}