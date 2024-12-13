package com.shiva.entities;

import java.util.Scanner;

public class GameDriver{
	 static Scanner sc=new Scanner(System.in);
	 static Shop shop=new Shop();

	public static void main(String[] args) {
		ServiceClass service=new ServiceClass();
		System.out.println("Welcome to the game");
		Player p=service.createPlayer();
		shop.showShopMenu(p);
		
	}


}
