package day6;

import java.util.Scanner;
public class Meun{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("[메뉴] 0. 종료  1. 계산기 2.BMI");
		int select = scanner.nextInt();
		boolean flag = true; 
			
		while(flag) {
			if(select == 1) {
				int num = scanner.nextInt();
				String op = scanner.next();
				int num2 = scanner.nextInt();
				int result = 0;
				       
				switch(op){
			       case "+" :  result = num+num2;break;
			       case "-"  :  result = num+num2;break;
			       case "*"  :  result = num+num2;break;
			       case "/"  :  result = num+num2;break;
			       case "%" :  result = num+num2;break;
				 }
			     System.out.println(result);
			     flag = true;
			     }else{
			    	 System.out.println( "스톱 ");
			    	 flag = false;
			     }
			}
		}
}

