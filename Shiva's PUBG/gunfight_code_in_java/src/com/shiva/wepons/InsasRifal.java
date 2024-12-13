package com.shiva.wepons;

public class InsasRifal extends Gun{
	
	InsasRifal(){
		super("Insas rifal", 28, 15);
	}
	
	
	@Override
	public void reload() {
		super.magzine_size=28;
	}
	
	@Override
	public void fire() {
		System.out.println(" Insas  is firing ");
		--magzine_size;
	}


}
