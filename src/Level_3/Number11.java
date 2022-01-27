package Level_3;

import java.util.Scanner;

public class Number11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = scan.nextInt();
		int num = scan.nextInt();
		int i;
		int a;
		int arr[] = new int[max];
		for(i=0; i<max; i++)
		{
			arr[i] = scan.nextInt();
		}
		for(i=0; i<arr.length; i++)
		{
			if(arr[i] < num)
			{
				System.out.println(arr[i]);
			}
			
		}

	}
}
