package com.shiva.entities;

import lombok.Data;

@Data
public class Player {
	
	private final String name;
	private int hp=100;
	private int coins=500;
	
	
	
	
	Player(String name){
		this.name=name;
	}
	
	
	

}
