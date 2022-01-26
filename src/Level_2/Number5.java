package Level_2;

import java.util.Scanner;

public class Number5 {

	public static void main(String[] args) {
		int a, b, hour, min, c;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		if(b >= 45)
		{
			min = b - 45;
			System.out.print(a + " ");
			System.out.print(min);
			
		}
		else
		{
			if(a == 0)
			{
				hour = 23;
				c = -(b - 45);
				min = 60 - c;
				System.out.print(hour + " ");
				System.out.print(min);
			}
			else
			{
				hour = a - 1;
				c = -(b - 45);
				min = 60 - c;
				System.out.print(hour + " ");
				System.out.print(min);
			}
		}


	}

}
