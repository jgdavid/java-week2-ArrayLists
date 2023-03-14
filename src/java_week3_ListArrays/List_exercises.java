package java_week3_ListArrays;

import java.util.ArrayList;
import java.util.Collections;

public class List_exercises {

	public static void main(String[] args) {

		enhancedFor(1, false);
		System.out.println(enhancedFor(1, false));

		// creating an ArrayList of names
		ArrayList<String> people = new ArrayList<String>();

		// Adding elements to ArrayList
		people.add("Jimmy");
		people.add("Harry ");
		people.add("Kate");
		people.add("Liz");

		System.out.println(people);

		// Looping through ArrayList
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}

		for (String a : people) {
			System.out.println(a);
		}

		for (int i = 0; i < 0; i++) {
			System.out.println(people.get(3));
		}

		for (String a : people) {
			System.out.println("Jimmy");
		}

		people.size();
		System.out.println(people);
		System.out.println(people.size());

		people.remove(1);
		System.out.println(people);
		System.out.println(people.size());

		people.add("Angie");
		people.add("Dan");
		System.out.println(people);

		Collections.sort(people);
		System.out.println(people);

		Collections.reverse(people);
		System.out.println(people);

		Collections.swap(people, 0, 1);
		System.out.println(people);

		people.clear();
		System.out.println(people);

		// String[] weeks = {"Monday", "Tuesday","Wednesday","Thursday", "Friday",
		// "Saturday", "Sunday"};
		// System.out.println(weeks);

		ArrayList<String> weeks = new ArrayList<String>();

		// Adding elements to ArrayList
		weeks.add("Monday");
		weeks.add("Tuesday");
		weeks.add("Wednesday");
		weeks.add("Thursday");
		weeks.add("Friday");
		weeks.add("Saturday");
		weeks.add("Sunday");

		System.out.println(weeks);

		for (String a : weeks)
			System.out.println(a);

		int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		for (int b : nums)

			System.out.println(b * b);

	}

	public static boolean enhancedFor(int a, boolean bn) {

		if (a % 2 == 0)
			return true;
		else

			return false;

	}
//	public static boolean excercise3(int b, boolean bn) {
//		int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
//		for (int c1 : nums)
//
//		if (c1 % 2 == 0)
//			
//			return true;
//		else
//
//			return false;
		
	}
}
