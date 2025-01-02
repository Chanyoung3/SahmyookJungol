package q571;

import java.util.Scanner;

public class Main {
	public static void print(int inum) {
		for(int i = 0; i < inum; i++) {
			System.out.println("~!@#$^&*()_+|");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inum = sc.nextInt();
		print(inum);
		
		
		sc.close();
	}
}