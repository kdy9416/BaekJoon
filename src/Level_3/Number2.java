package Level_3;

import java.util.Scanner;

public class Number2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a,b;
		int i,sum;
		int t = scan.nextInt();
		
		int arr[] = new int[t];
		for(i=0; i<t; i++)
		{
			
			a = scan.nextInt();
			b = scan.nextInt();
			arr[i] = a + b;
		}
		for(i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
