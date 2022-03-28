package com.bridge;
import java.util.Scanner;


public class LineComparison {
	 int x1, y1, x2, y2, x3, y3, x4, y4;
	 double line1, line2;
	 Scanner sc = new Scanner(System.in);
	
	public static void welcome() {
        System.out.println("......Line Comparison Computation Program... ");
    }
	
	public double lengthOfLine1() {
		System.out.println("Enter Cartesian Co-ordinates");
		System.out.println("Enter the values if x1 and y1 of 1st point: ");
		x1=sc.nextInt();
		y1=sc.nextInt();
		System.out.println("Enter the values if x2 and y2 of 2nd point: ");
		x2=sc.nextInt();
		y2=sc.nextInt();
        line1 = Math.sqrt(Math.pow((x2 - x1), 2)) + Math.pow((y2 - y1), 2);
        System.out.println("Length of the line1: " + line1);
        return line1;
	}
	
	public double lengthOfLine2(){
		 System.out.print("Enter x3 & y3 co-ordinates of first point: ");
	     x3 = sc.nextInt();
	     y3 = sc.nextInt();
	     System.out.print("Enter x4 & y4 co-ordinate of second point: ");
	     x4 = sc.nextInt();
	     y4 = sc.nextInt();
	     //Computation
	     line2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
	     System.out.println("length of line2 is:" + line2);
	     return line2;
	}
	
	 double line1Length = lengthOfLine1();
	 double line2Length = lengthOfLine2();
	 
	 public void equalsTo() {
	     if (line1Length == line2Length) {
	         System.out.println("Lines are Equal");
	     } else {
	         System.out.println("Calling compareTo method");
	        }
	    }
	 
	 public void compareTo() {
		 if (line1Length > line2Length) {
	          System.out.println("Line1 is grater than Line2 ");
	      } else {
	          System.out.println("lines2 is grater than line1");
	        }
	    }

	public static void main(String[] args) {
		 welcome();
	     LineComparison lineMethods = new LineComparison();
	     lineMethods.equalsTo();
	     lineMethods.compareTo();
	}
		
}
		


