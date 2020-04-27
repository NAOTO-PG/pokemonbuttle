package com.example.demo.controller;

public class Player {
	private final String name;
	private final Pokemon usePoke;
	private final String imagePath;

	public Player(String name, Pokemon usePoke,String imagePath) {
		this.name = name;
		this.usePoke = usePoke;
		this.imagePath = imagePath;
	}

	public String getName() {
		return this.name;
	}

	public Pokemon getusePoke() {
		return this.usePoke;
	}

	public String getimagePath() {
		return this.imagePath;
	}
}
