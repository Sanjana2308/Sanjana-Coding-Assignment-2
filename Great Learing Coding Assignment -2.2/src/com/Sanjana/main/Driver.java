package com.Sanjana.main;
import java.util.*;
import com.Sanjana.service.*;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total number of floors in the building :");
		int n= sc.nextInt();
		int x[] = new int[n+1];
		for(int i=1;i<n+1;i++) {
			System.out.println("Enter the floor size given on day: "+i);
			int m = sc.nextInt();
			x[m] = i;
		}
		Sorting s=new Sorting();
		s.assembalFloor(x, n);
	}
}