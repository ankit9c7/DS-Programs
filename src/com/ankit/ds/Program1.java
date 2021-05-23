package com.ankit.ds;


/**
 * @author ANKIVARS
 * Program1 :: This program is to reverse the Array
 * Date:23-5-2021
 */

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX = 10;
		int arr[] = new int[MAX];
		
		//Initializing Array
		for (int i=0; i<MAX; i++) {		
			arr[i]=i;
		}
		
		for(int element : arr) {
			System.out.println("element "+ element);
		}
		
		
	}

}
