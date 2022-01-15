package org.test.in;

public class NishaBank extends IciciBank {
	
@Override
public void deposit(int id) {
	// TODO Auto-generated method stub
	//super.deposit(6);
	
	System.out.println(id);
}

private void fixed() {
	// TODO Auto-generated method stub
	
	System.out.println("12%");

}

public static void main(String[] args) {
	NishaBank ni=new NishaBank();
	
	ni.saving();
	ni.deposit(7);
	ni.fixed();
}

}
