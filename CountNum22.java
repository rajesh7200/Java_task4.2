package PrgNote;

import java.util.Scanner;

public class CountNum22 {
	static void count22(int num)
	{
		int count=0;
		while(num!=0)
		{
			int rem=num%100;
			if(rem==22)
			{
				count++;
			}
			num=num/100;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int x=sc.nextInt();
		count22(x);
	}

}
