package Level_3;

import java.util.Scanner;

public class Number9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int i;int j;
		for(i = 1;i <= a; i++)
		{
			for(j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	 	
	}
}
