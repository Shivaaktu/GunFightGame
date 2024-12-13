package com.shiva.wepons;

public class Ak47 extends Gun{
	
	Ak47(){
		super("Ak47", 35, 20);
	}
	
	
	@Override
	public void reload() {
		super.magzine_size=35;
	}
	
	@Override
	public void fire() {
		System.out.println(" k47 firing ");
		magzine_size-=2;
	}

}
