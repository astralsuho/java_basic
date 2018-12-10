package day7;

import java.util.Scanner;
public class Bmi2 {
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
					
			while (true) {
				System.out.println("0.정지\n"
										+ "1.계산기\n"
										+"2.BMI\n"
										+ "10까지");
				String select =scanner.next();
			switch(select) {
			
				case "0" :
					System.out.println("정지");
					return;
			}	
				
				
			}
		}
}
