package dsa;

import java.io.*;

class Arrays {
	public static int search(int arr[], int N, int X) {
//		Function for searching the element in the array

		for (int i = 0; i < N; i++) {
			if (arr[i] == X)
				return i;
		}
		return -1;

	}

	public static void main(String args[]) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of test cases:");
		int t = 1;
		
//		If you have more than 1 test cases uncomment the below line
		t = Integer.parseInt(read.readLine());

		while (t-- > 0) {

			System.out.println("Enter the size of array:");
			int sizeOfArray = Integer.parseInt(read.readLine());

			int arr[] = new int[sizeOfArray];

			System.out.println("Enter the array elements seperated by spaces:");
			String st[] = read.readLine().trim().split("\\s+");

			for (int i = 0; i < sizeOfArray; i++)
				arr[i] = Integer.parseInt(st[i]);

			System.out.println("Enter the search element:");
			int x = Integer.parseInt(read.readLine());

			System.out.println(search(arr, sizeOfArray, x));
		}
	}
}
