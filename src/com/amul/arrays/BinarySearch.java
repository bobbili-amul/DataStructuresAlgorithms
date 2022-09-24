package com.amul.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int a[] = { 5, 4, 3, 2, 1 };
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("Enter the element you wanna search:");
		Scanner sc = new Scanner(System.in);
		int element = sc.nextInt();

		int lowerIndex = 0, higherIndex = a.length - 1, midIndex;
		midIndex = (lowerIndex + higherIndex) / 2;

		while (lowerIndex <= higherIndex) {
			if (a[midIndex] == element) {
				System.out.println("element " + element + " found at position " + (midIndex + 1));
				break;
			} else if (a[midIndex] < element) {
				lowerIndex = midIndex + 1;
			} else {
				higherIndex = midIndex - 1;

			}

			midIndex = (lowerIndex + higherIndex) / 2;
		}

	}

}
