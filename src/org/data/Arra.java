package org.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Arra {

	public static void main(String[] args) {
		System.out.println("0");
		System.out.println("2");
		System.out.println("3");
		System.out.println("1");
		
		try {
			System.out.println(4/0);
			
		} catch (ArithmeticException e) {
			System.out.println("not divided by zero");
		}
		
		finally {
			System.out.println("terminate");
		}
		
		System.out.println("5");
		System.out.println("6");
	}
}