package day9;

import java.util.Scanner;

public class Cao {

	public void test() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름과 점수 입력");
		String[] name = new String[3];
		int[] arr = new int[3];
		String name1 = scanner.next();
		int arr1 = scanner.nextInt();
		String name2 = scanner.next();
		int arr2 = scanner.nextInt();
		String name3 =scanner.next();
		int arr3 = scanner.nextInt();
		
		String[] arc = {name1,name2,name3};
		for(int a = 0;a<arr.length;a++)  {
			System.out.println(arr[a]+arc[a]);
		}
		/**System.out.println(arr[0]+arc[0]);
		System.out.println(arr[1]+arc[1]);
		System.out.println(arr[2]+arc[2]);*/
	}
	public static void main(String[] args) {
		Cao cao = new Cao();
		cao.test();
	}

}
