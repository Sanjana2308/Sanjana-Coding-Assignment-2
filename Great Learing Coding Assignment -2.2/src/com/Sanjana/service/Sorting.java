package com.Sanjana.service;
import java.util.*;

public class Sorting {
	public void assembalFloor(int []x,int n) {
		int j=n;
		boolean flag;
		System.out.println("The order of construction is as follows ");
		for(int i=1 ; i<=n;i++) {
			flag = false;
			System.out.println("Day "+i+" :");
			while(j>=1 && x[j]<=i) {
				flag = true;
				System.out.print(j + " ");
				j--;
			}
			if(flag == true) {
				System.out.println();
			}
		}
	}

}
	 													//Day:1
														// 3
														//Day:2
														// 1
														//Day:3
														//2