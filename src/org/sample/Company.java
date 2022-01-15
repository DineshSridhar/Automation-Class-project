package org.sample;

public class Company extends Employee {
	
	public void comId() {
		// TODO Auto-generated method stub
		System.out.println("123");
	}
public void comName() {
	// TODO Auto-generated method stub
	
	System.out.println("HCL");

}

public static void main(String[] args) {
	Company ci=new Company();
	
	ci.comId();
	ci.comName();
	ci.empid();
	ci.empName();
	
}
}
