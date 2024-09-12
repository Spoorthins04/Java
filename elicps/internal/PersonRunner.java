package com.xworkz.internal;

public class PersonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = new Person("nandana", 24, 98787836876L, "nandana@gmail.com");
		Person person2 = new Person("nithya", 20, 98787836876L, "nitya@gmail.com");
		Person person3 = new Person("abhi", 21, 98787836876L, "abhi@gmail.com");
		Person person4 = new Person("rani", 25, 98787836876L, "rani@gmail.com");
		Person person5 = new Person("rocky", 22, 98787836876L, "rocky@gmail.com");

		Person[] arr = { person1, person2, person3, person4, person5 };

		for (Person ref : arr) {
			System.out.println(ref);
		}

	}

}
