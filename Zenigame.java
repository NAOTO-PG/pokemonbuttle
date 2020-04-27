package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zenigame extends Pokemon {
	private List<String> skillName = new ArrayList<String>(Arrays.asList(
			"たいあたり", "ハイドロポンプ", "かみつく", "からにこもる"));

	public Zenigame() {
		super("ゼニガメ", "みず", 120, 50, 100, 80);
	}

	public void attack(Pokemon enemy,int skillNum) {
		switch (skillNum) {
		case 1: this.tackle(enemy);break;
		case 2: this.hydropump(enemy);break;
		case 3: this.bite(enemy);break;
		case 4: this.withdraw(enemy);break;
		}
	}

	public void tackle(Pokemon enemy) {
		if(this.getAttack()>enemy.getDefense()) {
			if(enemy.getHp()-30>=0) enemy.setHp(enemy.getHp()-30);
			else enemy.setHp(0);
		}
		else {
			if(enemy.getHp()-5>=0) enemy.setHp(enemy.getHp()-5);
			else enemy.setHp(0);
		}
	}

	public void hydropump(Pokemon enemy) {

	}

	public void bite(Pokemon enemy) {

	}

	public void withdraw(Pokemon enemy) {
		defense = defense * 5;
		super.setDefense(defense);
	}

	public List<String> getSkillList() {
		return this.skillName;
	}
}
