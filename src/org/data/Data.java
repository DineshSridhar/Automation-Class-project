package org.data;


import java.util.ArrayList;
import java.util.List;

public class Data {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 3; j++) {
				
				System.out.println(j);
				
			}
			System.out.println(i);
			
		}

		List<Character> li=new ArrayList<>();
		li.add('R');
		li.add('V');
		//li.add(1);
		
		System.out.println(li);

	}

}
