package easy.com.test;

public class Test04 {
 
	public static void main(String[] args) {
		String a = ",";
	       int b = 1 ;
		String n = "" ;
		for (int i = 0; i < 4; i++) {
			if (i < 3) {
			
				b = b * 2 ;   
				n =  n + b + a ;
			}else {
				b = b * 2 ;  
				 n = n + b ;
			}
		}
		System.out.println("1," + n);
	}
}
