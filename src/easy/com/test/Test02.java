package easy.com.test;
// ���2 - 15 Ҫ�� ������� ż����˻���
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
	 System.out.println("�����ĺ�Ϊ��" + b );
	 System.out.println("ż���Ļ�Ϊ��" + a );
	 
}
}
