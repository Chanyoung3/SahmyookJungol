package q555;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        char[] array = new char[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10 ; i++){
            array[i] = sc.next().charAt(0);
        }
       sc.close();
       
       for (int j = 0; j < 10 ; j++) {
    	   System.out.print(array[j]);
       }
    }
}