package easy.com.test;
// 输出2 - 15 要求： 奇数求和 偶数求乘积。
public class Test02 {
 public static void main(String[] args) {
	 int a = 1 ;
	 int b = 0 ;
	 for (int i = 2; i < 16; i++) {
		
		 System.out.println(i);
		 if (i % 2 == 0) {
			a = a * i ;
		}else {
			b = b + i ;
		}
	}
	 System.out.println("奇数的和为：" + b );
	 System.out.println("偶数的积为：" + a );
	 
}
}
