package day7;

import java.util.Scanner;

public class Fore {
	public void su() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1부터10까지 출력");
		int res = 0;
		String so = ""; 
		for	(int i=1; i<=10;i++) {
			res += i; //리졀트 0값 += 하면 그냥 1이된다는건가 
			so += i+"+"; // string so는 임의값 그리고 ++ 두번더하기
			System.out.println(i+" "+res);
		}
		System.out.println(so+res);

}
}
