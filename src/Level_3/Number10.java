package Level_3;

import java.util.Scanner;

public class Number10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int i;int j;
		for(i=1; i<=a; i++)
		{
			for(j=a; j>0; j--)
			{

				if(j > i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
					
			}
			System.out.println();
		}

	}
}
