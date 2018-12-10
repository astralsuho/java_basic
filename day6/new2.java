package day6;
import java.util.Scanner	;
public class new2 {
			public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			while(true){
				System.out.println("메뉴\n0.정지\n1.계산기\n2.bmi");
				String select = scanner.next();
				
				switch(select) {
				
				case "0":
					System.out.println("정지");
					return;
					
				case "1":
					System.out.println("계산기");
					int a = scanner.nextInt();
					String op = scanner.next();
					int b = scanner.nextInt();
					int result = 0;
					
					switch (op) {
					case "+" : result = a + b;break;
					case "- " : result = a - b;break;
					case "*" : result = a * b;break;
					case "/" : result = a / b;break;
					case "%" : result =a % b;break;
					
					}
				 System.out.println(a+op+b+"="+result);
				}
					
					
				}
			
			}
}

