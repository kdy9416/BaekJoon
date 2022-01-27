package Level_3;

import java.util.Scanner;

public class Number3 {
	public static void main(String[] args) {
		int a;
		int i;
		int sum=0;
		Scanner scan = new Scanner(System.in);
		a=scan.nextInt();
		for(i=1;i<=a;i++)
		{
			sum+=i;
		}
		System.out.println(sum);

	}
}
