package org.example;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {


	public static void main(String[] args) throws IOException {

		List<Record> javaProgrammers = new ArrayList<Record>() {
			{
				add(new Record("Elsdon", "Jaycob", "Java programmer", "male", 43, 20_000));
				add(new Record("Tamsen", "Brittany", "Java programmer", "female", 23, 15_000));

			}
		};
		System.out.println("Show programmers names:");
		javaProgrammers.forEach((p) -> System.out.printf("%s %s; ", p.getFirstName(), p.getLastName()));



	}
}
		// Percentage Decrease = [ (Starting Value - Final Value) / |Starting Value| ] × 100



