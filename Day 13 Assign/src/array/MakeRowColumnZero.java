package array;

import java.util.Scanner;

public class MakeRowColumnZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows in the matrix : ");
		int r = sc.nextInt();
		System.out.println("Enter number of columns in the matrix : ");
		int c = sc.nextInt();
		int m[][] = new int[r][c];
		int ans[][] = new int[r][c];
		System.out.println("Enter actual matrix : ");
		
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				m[i][j] = sc.nextInt();
			}
		}
		
		// Copying our matrix in another matrix :
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				ans[i][j] = m[i][j];
			}
		}
		
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if(m[i][j] == 0) {
					for(int a=0; a<r; a++) {
						ans[i][a] = 0;
					}
					for(int b=0; b<c; b++) {
						ans[b][j] = 0;
					}
				}
			}
		}
		
		System.out.println("Printing new matrix : ");
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}

}
