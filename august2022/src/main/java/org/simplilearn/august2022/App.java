package org.simplilearn.august2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// single entity
		int rollnumber = 5;
		String name = "5";
		double salary = 300000.5;
		boolean result = false;
		char nameInitial = 'c';

		System.out.println(rollnumber);

		// convert string to int

		System.out.println(Integer.parseInt(name) * 3);

		// convert int to string

		System.out.println(String.valueOf(rollnumber) + " chandan");

		int salaryInint = (int) salary;

		System.out.println(salaryInint);

		// multi entity demo

		System.out.println("==================Arrays demo====================");

		int[] rollNumberList = { 1, 2, 3, 4, 5, 6 };

		// syso(rollNumberList[0])

		// print only even number

		for (int count = 0; count < rollNumberList.length; count++) {
			if (rollNumberList[count] % 2 == 0) {
				System.out.println(rollNumberList[count]);

			}

		}

		System.out.println("==================Arraylist demo====================");

		ArrayList<Integer> rollNumberList2 = new ArrayList<Integer>();

		rollNumberList2.add(10);
		rollNumberList2.add(2);
		rollNumberList2.add(3);
		rollNumberList2.add(4);
		rollNumberList2.add(5);
		rollNumberList2.add(5);
		rollNumberList2.add(20);
		rollNumberList2.add(19);
		for (int item : rollNumberList2) {
			System.out.println(item);
		}

		for (int item : rollNumberList2) {
			System.out.println(item);
		}

		System.out.println("Third item on list is:" + rollNumberList2.get(2));

		System.out.println("==================Arraylist demo====================");

		System.out.println("==================Collections utility demo====================");

		System.out.println("Maximum value in list:" + Collections.max(rollNumberList2));

		Collections.reverse(rollNumberList2);

		System.out.println("reverse values in list:" + Collections.max(rollNumberList2));

		for (int item : rollNumberList2) {
			System.out.println(item);
		}

		System.out.println("==================Set demo====================");

		HashSet<Integer> hashSetList = new HashSet<Integer>();
		TreeSet<Integer> treeSetList = new TreeSet<Integer>();

		hashSetList.addAll(rollNumberList2);
		treeSetList.addAll(rollNumberList2);

		System.out.println("==================HASHSet demo====================");

		for (int item : hashSetList) {
			System.out.println(item);
		}

		System.out.println("==================Treeset demo====================");

		for (int item : treeSetList) {
			System.out.println(item);
		}

		// remove duplicate character from string

		System.out.println(
				"==================remove duplicate character from string-Interview Program====================");

		LinkedHashSet<Character> charSet = new LinkedHashSet<Character>();

		String name2 = "aaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbb";
		// oupt-chand

		char[] charList = name2.toCharArray(); // {'c','h','a','n','d','a','n'}

		// adding each character from charlist to set
		for (int i = 0; i < charList.length; i++) {

			charSet.add(charList[i]);// charlist[0]

		}

		// print each value in set

		for (Character item : charSet) {
			System.out.println(item);
		}

		System.out.println(
				"==================Map Demo:count of each character in String-Interview Program====================");

		// a=2,c=1,d=1,h=1,n=2,// {'c','h','a','n','d','a','n'}

		TreeMap<Character, Integer> charMap = new TreeMap<Character, Integer>();

		// adding each character from charlist to set
		for (int i = 0; i < charList.length; i++) {

			if (charMap.containsKey(charList[i])) {
				// duplicate character case
				charMap.put(charList[i], charMap.get(charList[i]) + 1);

			} else {

				// unique character case
				charMap.put(charList[i], 1);

			}

		}

		// print each value in set

		for (Character key : charMap.keySet()) {
			System.out.println(key + ":" + charMap.get(key));
		}

	}
}
