package com.kodnest.training.arrays;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float arr[][]=new float[scan.nextInt()][scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("The game  "+i+" has "+j+" number of players ");
				arr[i][j]=scan.nextFloat();
			}
		}
			for(int i=0;i<=arr.length-1;i++)
			{
				for(int j=0;j<=arr[i].length-1;j++)
				{
					System.out.println(arr[i][j]);
					
				}
		
		
	}
		

	}

	}

