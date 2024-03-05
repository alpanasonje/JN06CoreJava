package com.tnsif.daytwelve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedExceptions {
	String name;
	int number;

	public void accept() throws IOException // throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name : ");
		try {
			name = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Enter the number : ");
		number =Integer.parseInt(br.readLine());
	}
	void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Number : "+number);
	}
}
