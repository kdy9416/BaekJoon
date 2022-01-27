package Level_3;

import java.util.Scanner;

public class Number1 {

	public static void main(String[] args) {
		int a;
		int i,sum;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		for(i = 1; i < 10; i++)
		{
			sum = a * i;
			System.out.println(a + " " + "*" + " " + i +" " + "=" + " " + sum);
		}


	}

}
