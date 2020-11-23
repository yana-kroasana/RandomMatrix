package info;

import java.util.Scanner;

public class RandomMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Number of rows: ");
		int x = in.nextInt();
		System.out.println("Number of columns: ");
		int y = in.nextInt();
		char[][] matrix = new char[x][y];
		for(int i = 0; i<x; i++) {
			for(int j=0; j<y; j++) {
				System.out.println("Enter a character for row: " + (i+1) + " and column: "+(j+1));
				matrix[i][j]=in.next().charAt(0);
			}
		}
		for(int i = 0; i<x; i++) {
			for(int j=0; j<y; j++) {
				System.out.print(matrix[j][i]+" ");
			}
			System.out.println();
		}
		in.close();
	}

}
