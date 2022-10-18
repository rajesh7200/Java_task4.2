package PrgNote;

import java.util.Scanner;

public class CountDigit {
	

	static void count2(int num)
	{
		int count=0;
		while(num!=0)
		{
			int rem=num%10;
			if(rem==2)
			{
				count++;
			}
			num=num/10;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int x=sc.nextInt();
		count2(x);
	}


}
