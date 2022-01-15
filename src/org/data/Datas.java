package org.data;

public class Datas implements RbiBank {

	@Override
	public void saving() {
		
		System.out.println("7%");
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("6%");
		
	}

	@Override
	public void fixed() {
		// TODO Auto-generated method stub
		System.out.println("10%");
		
	}

	public static void main(String[] args) {
		Datas da=new Datas();
		
		da.saving();
		da.deposit();
		da.fixed();
	}
	

}
