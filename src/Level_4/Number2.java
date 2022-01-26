package Level_4;

import java.util.Scanner;

public class Number2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int cnt=0;
		int i=0;
		int t=5;
		int arr[] = new int[t];
		while(i<t)
		{
			int a,b;
			a= scan.nextInt();
			b= scan.nextInt();
			arr[i]=a+b;
			i++;
			
			
		}
	
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
