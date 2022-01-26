package Level_2;

import java.util.Scanner;

public class Number3 {

	public static void main(String[] args) {
		int a;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		if(a % 4 == 0 && !(a % 100 == 0) || a % 400 == 0)
		{
			System.out.print("1");
		}
		else
		{
			System.out.print("0");
		}
		
	}
}
