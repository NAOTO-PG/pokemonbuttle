package com.example.demo.controller;

public class Pokemon {
	private String name;
	private String type;
	private double hp;
	private double attack;
	private double speed;
	protected double defense;

	public Pokemon(
			String name, String type, double hp, double attack,
			double defense, double speed
			) {
		this.name = name;
		this.type = type;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.speed = speed;
	}

	public void showStatus() {
		System.out.println("■□ >>>>>>>>>>>>★☆★️");
		System.out.println("いけ!" + name);
		System.out.println("タイプ : " + type);
		System.out.println("HP : " + hp);
		System.out.println("攻撃力 : " + attack);
		System.out.println("防御力 : " + defense);
		System.out.println("素早さ : " + speed);
		System.out.println("★☆★ >>>>>>>>>>> □■");
	}
	public String showStatus2() {
		return String.format(name + "\n" + type);
	}

	public void attack(Pokemon enemy) {
		double damage;
		// 防御が高ければノーダメージ
		if(enemy.defense > this.attack) {
			damage = 0;
		} else {
			// 自分の攻撃力ー敵の防御力
			damage = this.attack - enemy.defense;
		}
		double restHp = enemy.getHp() - damage;
		enemy.setHp(restHp);
	}

	public String getName(){
		return this.name;
	}

	public void setName(String type){
		this.type = type;
	}

	public String getType(){
		return this.type;
	}

	public void setType(String type){
		this.type = type;
	}

	public double getHp() {
		return hp;
	}

	public void setHp(double hp) {
		this.hp = hp;
	}

	public double getAttack() {
		return attack;
	}

	public void setAttack(double attack) {
		this.attack = attack;
	}

	public double getDefense() {
		return defense;
	}

	public void setDefense(double defense) {
		this.defense = defense;
	}

	public double getSpeed() {
		return this.speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void attack(Pokemon getusePoke, Integer skill2) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
}
