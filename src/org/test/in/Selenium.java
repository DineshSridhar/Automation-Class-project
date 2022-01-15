package org.test.in;

import org.cts.in.CourseDetails;
import org.cts.in.LocationDetails;

public class Selenium {
	
	public void framework() {
		// TODO Auto-generated method stub
		
		System.out.println("Testng");

	}
	
	public static void main(String[] args) {
		Selenium se=new Selenium();
		se.framework();
		
		CourseDetails ce=new CourseDetails();
		ce.adyarBranch();
		ce.omrBranch();
		
		LocationDetails lc=new LocationDetails();
		lc.oracleCourse();
		lc.javaCourse();
	}

}
