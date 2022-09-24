package com.amul.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeletion {

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6};
		//delete 5 
		Scanner sc = new Scanner(System.in);
		System.out.println(Arrays.toString(a));
		for (int i = a.length-1; i > 4; i--) {
			a[i-1] = a[i];
		}
		System.out.println(Arrays.toString(a));

	}

}
