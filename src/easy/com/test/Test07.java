package easy.com.test;
import java.util.Scanner;
//ѭ����������ɼ� ��ӡ��߷�
public class Test07 {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int b = 0 ;
		int j = 1 ;
		int[] a = new int[5];
		for (int i = 0; i < 5; i++) {
			String n = "�������" + j + "���ɼ���" ;
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
		System.out.println("�������߷�Ϊ��" + b );
	}
}
