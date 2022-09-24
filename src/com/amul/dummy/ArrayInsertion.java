package com.amul.dummy;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertion {

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter element to be inserted:");
		int element = sc.nextInt();
		System.out.println("enter position to be inserted:");
		int pos = sc.nextInt();
		int[] result = arrayInsertion(a,pos,element);
		System.out.println(Arrays.toString(a));
		
	}
	
	
	public static int[] arrayInsertion(int[] a, int pos, int element)
	{
		System.out.println(Arrays.toString(a));
		for (int i = a.length-1;  i>pos-1;i--) 
		{
		    a[i] = a[i-1];	
		}
		a[pos-1]=element;

		return a;
	}

}
