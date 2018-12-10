package day6;
import java.util.Scanner;

public class Xianzai {
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("메뉴\n0.종료 \n1.계산기 \n2.BMI" );
			String select = scanner.next();
			
			switch (select) {
			case "0":
				System.out.println("종료");
				return;
			
			case "1":
				System.out.println("계산기");
				int num = scanner.nextInt();
				String op = scanner.next();
				int num1 = scanner.nextInt();
				int result = 0;
				
			switch(op) {
			case"+": result = num+num1 ;break;
			case"-" : result = num-num1; break;
			case "*": result = num*num1; break;
			case "/": result = num/num1;break;
			case "%":result = num%num1;break;
			
			}
			
			System.out.println(num+op+num1+"="+result);
			break;
				
			
				
				

			}
		}
		}
}