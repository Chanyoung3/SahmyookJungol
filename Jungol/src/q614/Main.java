package q614;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int b = sc.nextInt();
		sc.close();
		
		Student student1 = new Student();
		student1.print();
		Student student2 = new Student();
		student2.setInfo(a, b);
		student2.print();
	}
}