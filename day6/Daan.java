package day6;

import java.util.Scanner;

class Daan {
	public static void main(String[] args) {
		
		while(true){
			Scanner scanner = new Scanner(System.in);
			System.out.println("메뉴\n 0.종료\n 1.계산기\n 2.BMI");
			String select = scanner.next();
			
			switch(select) {
			
			case"0": 
				System.out.println("종료");
				return;
			case"1":
				System.out.println("숫자를 입력해 주세요");
				int a = scanner.nextInt();
				String op = scanner.next();
				int b = scanner.nextInt();
				int result = 0;
				
				switch(op) {
				case"+": result = a+b;break;
				case"-": result = a-b;break;
				case"*": result = a*b;break;
				case"/": result = a/b;break;
				case"%": result = a%b;break;
				
				}
				System.out.println(a+op+b+"="+result);
				break;
				
			case"2":
				System.out.println("키를 입력해주세요");
				double t =scanner.nextDouble();
				System.out.println("몸무계를 입력해주세요");
				double w = scanner.nextDouble();
				double bmi =w/(t*t)*10000;
				String bmi2 = "";
				
				if(bmi >= 40) {
					bmi2 ="고도비만";	
				}else if(bmi >= 35) {
					bmi2 ="중등고 비만";
				}else if(bmi >= 30) {
					bmi2 = "경도 비만";
				}else if(bmi>=25) {
					bmi2 = "과체중";
				}else if(bmi>=18.5) {
					bmi2 = "정상";
				}else{
					bmi2 = "저체중";
				}
				System.out.println(bmi+"\n"+bmi2);
				break;
				
			}
			}	
		}
		
	}
