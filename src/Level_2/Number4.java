package Level_2;

import java.util.Scanner;

public class Number4 {
	public static void main(String[] args) {
		int a,b;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		if(a > 0 && b > 0)
		{
			System.out.print("1");
		}
		else if(a < 0 && b > 0)
		{
			System.out.print("2");
		}
		else if(a < 0 && b < 0)
		{
			System.out.print("3");
		}
		else if(a > 0 && b < 0)
		{
			System.out.print("4");
		}
		else
		{
			System.out.print("잘못입력하였습니다");
		}
		
	}
}
