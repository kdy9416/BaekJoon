package Level_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Number1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int cnt = 0;
		int i;
		while(true) {
			int a,b;
			a= scan.nextInt();
			b= scan.nextInt();
			if(a == 0 && b == 0)
			{
				scan.close();
				break;
			}
			list.add(a+b);
			cnt++;
			
		}
		
		for(i=0; i<cnt; i++)
		{
			System.out.println(list.get(i));
		}
	}
	
	
}
