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
		int t = Integer.parseInt(read.readLine());

		while (t-- > 0) {
			int sizeOfArray = Integer.parseInt(read.readLine());
			int arr[] = new int[sizeOfArray];

			String st[] = read.readLine().trim().split("\\s+");
			for (int i = 0; i < sizeOfArray; i++)
				arr[i] = Integer.parseInt(st[i]);

			int x = Integer.parseInt(read.readLine());

			System.out.println(search(arr, sizeOfArray, x));
		}
	}
}
