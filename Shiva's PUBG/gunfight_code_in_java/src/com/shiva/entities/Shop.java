package com.shiva.entities;

import java.util.Scanner;

public class Shop {
	static Scanner sc=new Scanner(System.in);	
	
	public void showShopMenu(Player p) {
		String s="You need to but some equepments to proceed in game you have "+p.getCoins()+" coins";
		System.out.println(s);
		do {
			System.out.println("Press 1 for buy wepon \n2 for armour protection\n3 for medikits");
			int c1=sc.nextInt();
			if(c1==1) {
				weponShop();
			}else if(c1==2) {
				armourShop();
			}else if(c1==3) {
			}
			
		}while(11<2);
		
		
	}
	
	public void weponShop() {
		System.out.println("You enterd in wepon shop");
		System.out.println("1 for gun, 2 for knife ");
		int c1=sc.nextInt();
	}
	public void armourShop() {
		
	}
	public void mediKitShop() {
		
	}
	
	
}
