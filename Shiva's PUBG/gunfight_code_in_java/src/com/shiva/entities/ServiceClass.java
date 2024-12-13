package com.shiva.entities;

import java.util.Scanner;

public class ServiceClass {
	static Scanner sc=new Scanner(System.in);
	
	public static Player createPlayer() {
		System.out.println("Enter the name");
		String name=sc.nextLine();
		return new Player(name);
	}

}
