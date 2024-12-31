package q614;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Student st = new Student();
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int b = sc.nextInt();
		st.setInfo(a, b);
		
		sc.close();
	}

}