//Write a program to find sum of digit.

import java.util.Scanner;
class FindSumOfDigits{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0;
		while(num>0){  //12>0
			int rem=num%10; //2

			sum+=rem;    //0+2


			num/=10;
	}
	System.out.println(sum);
}
}


































/*
import java.util.*;
class FindSumOfDigits{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num");
		int num=sc.nextInt();  //12       //1
		int sum=0;
		while(num>0){        //12>0        //1>0
			int rem=num%10;   //12%10=2    //1%10=1
			sum+=rem;         //0+2        //2+1=3
			num/=10;           //12/10=1   //
		}
		System.out.println(sum);
	}
}

*/