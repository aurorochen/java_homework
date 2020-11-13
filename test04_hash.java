package test04;


import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Scanner;

public class test04_03 {
	static ArrayList<File> fstotol = new ArrayList<File>();
	public static ArrayList<File> dfs(String path) {
		File dir = new File(path);
		File[] fs = dir.listFiles();
		for(int i=0;i<fs.length;i++) {
			if(fs[i].isFile()) {
				fstotol.add(fs[i]);
			}
			if(fs[i].isDirectory()) {
				fstotol.add(fs[i]);
				dfs(path+File.separator+fs[i].getName());
			}
		}
		return fstotol;
	}
	public static byte[] SHA1Checksum(ArrayList<File> a) throws Exception {
		int len = a.size();
		MessageDigest m=MessageDigest.getInstance("SHA-1");
		for(int i=0;i<len;i++) {
			if(a.get(i).isFile()) {
				FileInputStream is = new FileInputStream(a.get(i));
				byte[] buffer = new byte[1024];
				int num = 0;
				do {
					num = is.read(buffer);
					if(num>0) {
						m.update(buffer ,0 ,num);
					}
				}while(num!=-1);
					is.close();
			}
		}
			//m.update(String.valueOf(a[i]) .getBytes("UTF-8"));//将文件名或文件夹名hash
		return m.digest();
	}
	public static void main(String args[]) {
		try {
			System.out.println("请输入路径：");
			Scanner input = new Scanner(System.in);
			String path = input.next();
			ArrayList<File> f = dfs(path);
			for(int i =0;i<f.size();i++) {
				System.out.println(f.get(i).getName());
			}
			byte[] sha1 = SHA1Checksum(f);
			String result = "";
			for(int i=0;i<sha1.length;i++) {
				result += Integer.toString(sha1[i]&0xFF,16);
			}
			System.out.println(result);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
