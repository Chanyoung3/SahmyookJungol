package q508;

public class Main {

	public static void main(String[] args) {
		String[] ar = { "item", "count", "price", "pen", "20", "100", "note", "5", "95", "eraser", "110", "97" };
		int cnt = 0;
		for(int i = 0; i < ar.length; i++) {
			if(cnt % 3 == 0) {
				System.out.println();
			}
			
			if(ar[i].length() <= 10) {
				int k = 10 - ar[i].length();
				while(k > 0) {
					System.out.print(" ");
					k--;
				}
				System.out.print(ar[i]);
			}
			cnt++;
		}
	}
}