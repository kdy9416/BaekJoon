package Level_2;

import java.util.Scanner;

public class Number2 {

	public static void main(String[] args) {
		int a;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		if(a >= 90 && a <= 100)
		{
			System.out.print("A");
		}
		else if(a >= 80)
		{
			System.out.print("B");
		}
		else if(a >= 70)
		{
			System.out.print("C");
		}
		else if(a >= 60)
		{
			System.out.print("D");
		}
		else
		{
			System.out.print("F");
		}


	}

}
