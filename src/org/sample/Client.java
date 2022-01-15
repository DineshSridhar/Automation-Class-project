package org.sample;

public class Client extends Company {
	
	public void clientName() {
		// TODO Auto-generated method stub
		System.out.println("Air Asia");

	}
	
	public static void main(String[] args) {
		Client cl=new Client();
		cl.clientName();
		cl.comId();
		cl.comName();
		cl.empName();
		cl.empid();
		
	}

}
