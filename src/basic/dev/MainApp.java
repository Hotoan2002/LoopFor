package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		/**
		 *bai 12.1 viet chuong trinh tinh tong cac so tu 1 den 100
		 */
		int tong = 0;
		for(int i= 0 ; i <= 100; i++) {
			tong += i;
		}
		System.out.println("tong:"+ tong  );
		
		/**
		 * bai 12.2 viet pt nhap vao mot so tu nhien n, tinh tong cac so chai het cho 3 be hon n
		 */
		Scanner sc  = new Scanner(System.in);
		System.out.println("nhap n : ");
			int n = sc.nextInt();
			int tong2 = 0;
			for (int b = 0 ; b <= n; b++) {
				if(b % 3 == 0)
					tong2 +=b;														
		}
			System.out.println("tong cac so chia het cho 3:"+ tong2);
			System.out.println("------------------------");
			
		/**
		 * bai 12.3 viet chuong trinh in ra 100 so Fibonacci dau tien
		 */
			int count = 100, num1 = 0 , num2 = 1;
			System.out.println("chuoi voi "+count+ " so fibonaci dau tien la: ");
			for(int a = 1; a <= count; a++) {
				System.out.print(num1+" ");
				int sum = num1+ num2;
				num1 = num2;				
				num2 = sum;				
		}
			
		/**
		 * bai 12.4 viet phuong trinh kiem tra so n co phai la so polinom
		 */
			int m, rv, temp, mod;
			System.out.println("nhap m = ");
			m = sc.nextInt();
			
			temp = m;
			rv = 0;
			for (;m > 0; ) {
				mod = m % 10;
				m = m / 10;
				rv = rv * 10 + mod;	
			}
			if(rv ==temp)
				System.out.println("so " + temp +" la so polinom");
			else System.out.println("so "+ temp +" khong phai la so polinom");
		/**
		 * bai 12.5 viet chuong trinh liet ke cac so tu 100 den 999 co tong chu so chia het cho 3
		 */
			System.out.println("liet ke cac so tu 100 den 999 co tong chu so chia het cho 3");
			for(int v = 100; v <=999 ; v++) {
				int temp1 = (v/100) + ((v -(v/100)*100) /10) + v % 10;
				if(v % 3 == 0 )
					System.out.print(v + ", ");
				
					
			}
	}
}
