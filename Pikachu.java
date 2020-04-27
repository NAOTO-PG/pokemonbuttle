package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pikachu extends Pokemon {
	private List<String> skillList = new ArrayList<String>(Arrays.asList(
			"たいあたり", "１０まんボルト", "でんこうせっか", "でんきショック"));

	public Pikachu() {
		super("ピカチュウ", "でんき", 100, 70, 80, 100);
	}

	public void tackle() {

	}

	public void thunderBolt() {

	}

	public void lightning() {

	}

	public void electric() {

	}

	public List<String> getSkillList() {
		return this.skillList;
	}
}
