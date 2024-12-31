package q613;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
		Student student = new Student(name, school, grade);
		student.printInfo();
		
		sc.close();
	}
}

/* import java.util.Scanner;

class Information{
	private String name = new String();
	private String school = new String();
	private int grade;
	
	public void getName(String name) {
		this.name = name;
	}
	public void getSchool(String school) {
		this.school = school;
	}
	public void getGrade(int grade) {
		this.grade = grade;
	}
	public void printInfo() {
		System.out.println("Name : " + name);
		System.out.println("School : " + school);
		System.out.println("Grade : " + grade);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Information info = new Information();
		info.getName(sc.next());
		info.getSchool(sc.next());
		info.getGrade(sc.nextInt());
		sc.close();
		info.printInfo();
	}
}
 */