package com.bridge;
import java.util.Scanner;
public class LineComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values if x1 and y1 of 1st point: ");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		System.out.println("Enter the values if x2 and y2 of 2nd point: ");
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		
		double lengthOfLine=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		System.out.println("Length of line is: "+lengthOfLine);
		
		

	}

}
