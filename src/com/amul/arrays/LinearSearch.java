package com.amul.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) 
	{
		int a[] = {5,4,3,2,1};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter element to be searched:");
		int element = sc.nextInt();
		boolean flag =false;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==element)
			{
				System.out.println("element "+element+" found at "+(i+1));
				flag = true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("number not found:");
		}

	}

}
