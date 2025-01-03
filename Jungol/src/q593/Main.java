package q593;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("ASCII code =? ");
			int inum = sc.nextInt();
		
			if(inum >= 33 && inum <= 127) {
				char ch = (char) inum;
				System.out.println(ch);
			}
			else {
				sc.close();
				break;
			}
		}
	}
}
