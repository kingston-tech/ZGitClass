package org.test;

import java.nio.charset.MalformedInputException;
import org.openqa.selenium.grid.Main;
public class sample {
	public static void main(String[] args) {
	int[] a= {1,2,3,4};
	for(int x:a) {
		System.out.println(x);
	}
	int[][] b= {{1,2,3,4},{1,4,5,6}};
	System.out.println(b[0][2]);
	System.out.println(b.length);
	for(int[] x:b) {
		System.out.println(x);
	}
	for(int i=1;i<b.length;i++) {
	   System.out.println(b[i]); 
		
	}
	
	
}	
}

