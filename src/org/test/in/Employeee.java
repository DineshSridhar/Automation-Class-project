package org.test.in;

public class Employeee {

	public void empId(String name) {
		// TODO Auto-generated method stub
		
		System.out.println("String method" +name);

	}
	public void empId(long phno, String email) {
		// TODO Auto-generated method stub
		
		System.out.println("Long string method"+phno+"\n"+email);

	}
	
	public void empId(String doj,float sal ) {
		// TODO Auto-generated method stub
		
		System.out.println("Float String method" +sal+"\n"+doj);

	}
	
	public static void main(String[] args) {
		Employeee emp=new Employeee();
		emp.empId("deepak");
		emp.empId(99456123789l, "deepak@gmail.com");
		emp.empId("12/12/12",23455.25f);
		
	}
	
}
