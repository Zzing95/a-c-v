package easy.com.test;

import java.util.Scanner;


public class Test01 {
	static Scanner in= new Scanner(System.in);
  public static void main(String[] args) {
	  

          int a  = 0 ;
	  for (int i = 0; i < 101; i++) {
		 
		  a = a + i ;
		 
		
	}
	 System.out.println(a);
	  a = 0 ;
	 int n = in.nextInt() ;
	 for (int i = 0; i < n; i++) {
		a = a + i ;
	}
	 System.out.println(a);
}
    
}
