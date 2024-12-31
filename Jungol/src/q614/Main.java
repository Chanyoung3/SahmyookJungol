package q614;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Student student = new Student();
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int b = sc.nextInt();
		sc.close();
		
		student.setInfo(a, b);
		student.print();
	}
}