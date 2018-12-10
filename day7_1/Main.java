package day7_1;
import day7_1.Calc1;

import java.util.Scanner;

import day7_1.Bmi;
import day7_1.ForDemo;
public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(" 0.종료\n 1.계산기\n 2.BMI\n 3.폴");
		String select = scanner.next(); 		

		switch(select) {
        case "0":
                System.out.println("종료");
                return;
        case "1":
        		Calc1 ads =new Calc1();
        		ads.test();
        			
        case "2":
        		Bmi bbb = new Bmi();
        		bbb.test1();
        case "3":
        		ForDemo ccc = new ForDemo();
        		ccc.test();
        		
        	break;	
		}
	}
}