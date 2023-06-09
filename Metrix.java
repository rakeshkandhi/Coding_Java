package dsa;

import java.io.*;
import java.util.*;

class Metrix {
	static int[][] createMatrix(int rows, int columns) {
		Scanner sc = new Scanner(System.in);
		int matrix[][] = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		sc.close();
		return matrix;
	}
	static boolean search(int matrix[][],int rows,int columns,int target) {
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				if(matrix[i][j]==target)
					return true;
			}
		}
		return false;
	}
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t = 1;
		t = sc.nextInt();

		while (t > 0) {
			System.out.println("Enter the number of rows:");
			System.out.println("Enter the number of columns:");
			int rows = sc.nextInt();
			int columns = sc.nextInt();
			int matrix[][] = createMatrix(rows, columns);
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
			}
			int target = sc.nextInt();
			if (search(matrix, rows, columns, target))
				System.out.println(1);
			else
				System.out.println(0);
			t--;
		}
		sc.close();
	}
}
