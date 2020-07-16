package javaProgram;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("enter no of rows");
		int row = input.nextInt();
		int a[][] = new int[row][];
		for(int i=0;i<row;i++) {
			System.out.println("enter no of cols");
			int col = input.nextInt();
			a[i] = new int[col];
			for(int j= 0;j<col;j++) {
				a[i][j] = input.nextInt();
			}
		}
		for(int k=0;k<row;k++) {
			for(int l=0;l<a[k].length;l++) {
				System.out.print(a[k][l]+"  ");
			}
			System.out.println();			
		}		
		
		input.close();
	}

}
