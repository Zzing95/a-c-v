package easy.com.test;
//Ñ­»·Êä³ö1£¬2£¬3£¬4£¬5
public class Test03 {

	public static void main(String[] args) {
		String b = "" ;
		int n = 1 ;
		for (int i = 1; i < 6; i++) {
			String a = "," ;
			if (i < 5 ) {
				
				b = b + n + a ;
				n++ ;
			}else {
				b = b + n ;
			}
			
		}
		System.out.println(b);
	}
}
