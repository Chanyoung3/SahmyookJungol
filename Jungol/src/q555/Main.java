package q555;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        String[] array = new String[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10 ; i++){
            array[i] = sc.next();
        }
       sc.close();
       
       for (int j = 0; j < 10 ; j++) {
    	   System.out.print(array[j]);
       }
    }
}