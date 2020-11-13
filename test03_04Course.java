package test03;

public class test03_04Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public test03_04Course(String courseName){
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public String[] getStudents() {
		return students;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public String getCourseName() {
		return courseName;
	}
	public String[] Clone() {
		String[] clone_student = new String[100];
		for(int i=0;i<numberOfStudents;i++) {
			clone_student[i]=students[i];
		}
		return clone_student;
	}
	public void dropStudent(String student) {
		
	}
	public static void main(String[] args) {
		String coursename = "computer";
		test03_04Course course1 = new test03_04Course(coursename);
		course1.addStudent("张明");
		course1.addStudent("李红");
		course1.addStudent("王浩");
		String[] stu1 = course1.getStudents();
		for(int i=0;i<course1.getNumberOfStudents();i++) {
			System.out.println(stu1[i]);
		}
		System.out.println("深度复制的：");
		String[] stu2 = course1.Clone();
		for(int i=0;i<course1.getNumberOfStudents();i++) {
			System.out.println(stu2[i]);
		}
	}
}
