package Level_2;

import java.util.Scanner;

public class Number1 {

	public static void main(String[] args) {
		int a,b;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		if(a > b)
		{
			System.out.print(">");
		}
		else if(a < b)
		{
			System.out.print("<");
		}
		else
		{
			System.out.print("==");
		}

	}

}
