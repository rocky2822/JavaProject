package org.arr;

public class Array {
public static void main(String[] args) {
	int a[][][]=new int[1][2][3];
	a[0][0][0]= 10;
	a[0][0][1]= 20;
	a[0][0][2]= 30;
	a[0][1][0]= 40;
	a[0][1][1]= 50;
	a[0][1][2]= 60;
	
	
  System.out.println("nested for loop");
	for (int i = 0; i < 1; i++) {
		for (int j = 0; j <2; j++) {
			for (int k = 0; k < 3; k++) {
				System.out.println(a[i][j][k]);
				
			}	
		}
	}
	
	System.out.println("nested for each loop");
	
	for (int[][] x : a) {
		for (int[] y : x) {
			for (int z : y) {
				System.out.println(z);
				
			}
			
		}
	}		
}
}





