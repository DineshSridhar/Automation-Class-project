package org.data;

public class Common implements L1,L2 {

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("test2");
		
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
		System.out.println("test1");
	}
	
	public static void main(String[] args) {
		
		Common co=new Common();
		co.test1();
		co.test2();
	}

}
