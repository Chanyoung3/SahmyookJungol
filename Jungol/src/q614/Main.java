package q614;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Student student1 = new Student();
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int b = sc.nextInt();
		sc.close();
		
		student1.setInfo(a, b);
		student1.print();
	}
}