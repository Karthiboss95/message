package org.tcs;

import java.util.LinkedList;
import java.util.List;

public class ListArray {
	public static void main(String[] args) {

		List li = new LinkedList();

		li.add("str");
		li.add(90);
		li.add(15);
		li.add("ram");
		li.add(50);
		li.add("str");
		li.add("str");
		li.add(10);

		Object object = li.get(3);
		System.out.println(object);
	}
}
