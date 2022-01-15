package org.data;

import java.util.Scanner;

public class ScanSample {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter empid");
		int empid=sc.nextInt();
		System.out.println("enter id is" +empid);
		
		System.out.println("please enterthe name");
		String empName=sc.next();
		System.out.println("enter name is" +empName);
		
		System.out.println("pls enter the sal");
		float empSal=sc.nextFloat();
		
		System.out.println("enter sal for" +empName + "is" +empSal);

	}

}
