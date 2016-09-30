package test1;

import static org.junit.Assert.*;

import java.util.LinkedList;
//import java.util.Scanner;

import org.junit.Test;

public class D1 {

	//private Scanner s;

	@Test
	public void test() {
		Testing t = new Testing();
	String input = "ajay";
		String input1 = "tingari";
		String input2 = "jaya";
		String input3 = "xyz";
		String input4 = "a";
		String input5 = "z";

		
		LinkedList <String> List = t.doctors(input);
assertFalse(List.isEmpty());
LinkedList <String> List1 = t.doctors(input1);
assertFalse(List1.isEmpty());
LinkedList <String> List2 = t.doctors(input2);
assertFalse(List2.isEmpty());


LinkedList <String> List3 = t.doctors(input3);
assertTrue(List3.isEmpty());
		//fail("Not yet implemented");

LinkedList <String> result = t.doctors(input4);
assertFalse(result.isEmpty());

LinkedList <String> result1 = t.doctors(input5);
assertTrue(result1.isEmpty());

	}

}
