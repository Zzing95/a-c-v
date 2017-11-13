package easy.com.test;
import java.util.Scanner;
//循环输入五个成绩 打印最高分
public class Test07 {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int b = 0 ;
		int j = 1 ;
		int[] a = new int[5];
		for (int i = 0; i < 5; i++) {
			String n = "请输入第" + j + "个成绩：" ;
			j++ ;
		System.out.println(n);
			a[i] = in.nextInt();
			if (i ==0 ){
				b = a[0] ;
			}
			if (a[i] > b) {
				b = a[i] ;
			}
			
		}
		System.out.println("结果：最高分为：" + b );
	}
}
