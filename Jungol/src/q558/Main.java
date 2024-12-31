package q558;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] ar = new int[100];
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
			cnt++;
			if(ar[i] == 0) {
				cnt--;
				break;
			}
		}
		sc.close();
		
		for (int i = cnt - 1; i >= 0; i--) {
			System.out.print(ar[i] + " ");
		}
	}
}
