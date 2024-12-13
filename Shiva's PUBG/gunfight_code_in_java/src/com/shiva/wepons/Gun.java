package com.shiva.wepons;


public class Gun implements Wepon{
	String name;
	int magzine_size;
	final int damage=0;
	
	Gun(String name, int magzine_size, int damage){
		name=this.name;
		magzine_size=this.magzine_size;
		damage=this.damage;
	}
	
	
	
	public void fire() {
		System.out.println("Gun is fireing");
		
	}
	
	public void reload() {
		System.out.println("Gun is reloadded");
		
	}
}
