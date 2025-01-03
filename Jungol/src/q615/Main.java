package q615;

import java.util.Scanner;

class Student{
	private String name;
	private int kor;
	private int eng;
	
	public Student(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	public void print() {
		System.out.println(name + " " + kor + " " + eng);
	}
	
	public int getkor() {
		return kor;	
	}
	
	public int geteng() {
		return eng;	
	}
}

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int korean, english;
		Student[] sarr = new Student[2];
		
		for(int i = 0; i <sarr.length; i++) {
			name = sc.next();
			korean = sc.nextInt();
			english = sc.nextInt();
			
			sarr[i] = new Student(name, korean, english);
		}
		
		for( int i = 0; i < sarr.length; i++) {
			sarr[i].print();
		}
		
		int korAvg = 0, engAvg = 0;
		for( int i = 0; i <sarr.length; i++) {
			korAvg += sarr[i].getkor();
			engAvg += sarr[i].geteng();
		}
		korAvg /= sarr.length;
		engAvg /= sarr.length;
		
		System.out.println("avg " + korAvg + " " + engAvg);
		sc.close();

	}
}
