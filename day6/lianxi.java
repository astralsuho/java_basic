package day6;
import java.util.Scanner;
public class lianxi {
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("메뉴\n 0.종료 \n 1.계산기");
			String select = scanner.next();
			switch(select) {
			case "0": 
				System.out.println("종료");
				return;
			case "1":
				System.out.println("계산기");
				int num1 =scanner.nextInt();
				String op = scanner.next();
				int num2 =scanner.nextInt();
				int result = 0;
				
				switch(op) {
				case"+" : result = num1 + num2; break;
				case"-" : result = num1  - num2; break;
				case"*" : result = num1  * num2; break;
				case"/" : result = num1  / num2; break;
				case"%" : result = num1 % num2; break;
				}
				System.out.println(num1+op+num2+"="+result);
				break;
			}
		}
		
}
}
