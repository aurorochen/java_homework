package test03;
import java.util.ArrayList;

public class test03_03 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(15);
		list.add(43);
		list.add(10);
		list.add(2);
		list.add(1);
		list.add(89);
		System.out.println(list.toString());
		sort(list);
	}
	public static void sort(ArrayList<Integer> list) {//从小到大排序
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				Integer a = list.get(i);
				Integer b = list.get(j);
				Integer temp;
				if(a.compareTo(b)<=0) {
					list.set(i, a);
				}
				else {
					temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j,temp);
				}
			}
		}
		System.out.println(list.toString());
	}
}
