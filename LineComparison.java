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
		
		Double Lengthofline1 = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		System.out.println("Length of line is: "+Lengthofline1);
		
		 System.out.print("Enter x3 & y3 co-ordinates of first point: ");
	     int x3 = sc.nextInt();
	     int y3 = sc.nextInt();
	     System.out.print("Enter x4 & y4 co-ordinate of second point: ");
	     int x4 = sc.nextInt();
	     int y4 = sc.nextInt();
	     //Computation
	     Double Lengthofline2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
	     System.out.println("length of line2 is:" + Lengthofline2);
	        
	     if ( Lengthofline1.equals(Lengthofline2) ) 
	       {
	          System.out.println("line1 and line2 are equal");
	       }
	     else {
	            System.out.println("line1 and line2 are not equal");
	        }
	     
	     int value = Lengthofline1.compareTo(Lengthofline2);
	     if(value<0) {
	    	 System.out.println("length of line1 is greater than line2");
	     }
	     else if (value >0) {
	    	 System.out.println("length of line2 is greater than line1");
	     }
	     else {
	    	 System.out.println("both lines are equal");
	     }
	     sc.close();
	}
		
}
		


