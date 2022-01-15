package org.cts.in;

public class LocationDetails {

	public void oracleCourse() {
		// TODO Auto-generated method stub

		System.out.println("Adyar Branch");
	}
	
	public void javaCourse() {
		// TODO Auto-generated method stub
		System.out.println("OMR Branch");

	}
	
	public static void main(String[] args) {
		
		LocationDetails loc=new LocationDetails();
		
		loc.javaCourse();
		loc.oracleCourse();
		
		CourseDetails co=new CourseDetails();
		
		co.adyarBranch();
		co.omrBranch();
	}
	
}
