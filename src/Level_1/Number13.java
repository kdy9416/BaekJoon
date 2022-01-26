package Level_1;

import java.util.Scanner;

public class Number13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a= scan.nextInt();
		int b= scan.nextInt();
		char[] arr = (b + "").toCharArray();
		for(int i = 2; i >= 0; i--)
		{
			System.out.println(a*Integer.parseInt(arr[i] + ""));
		}
		System.out.println(a * b);
			
	}

}
