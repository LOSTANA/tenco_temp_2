package com.tenco.temp2;

import java.util.Random;

public class Person1 {

	private String name;
	private int hp; // 체력
	private int speed; // 속도
	private int defense; // 방어력
	private int attack; // 공격력
	private int chance = 2;
	private int result = 0;
<<<<<<< HEAD
	
	
=======

>>>>>>> 581efb33ba9e5da951183dc172c2d65c0125de46
	Random rd = new Random();

	// 스탯
	public Person1() {
		name = "";
		hp = 100;
		speed = 3;
		defense = 10;
		attack = 20;
	}
	
	public Person1(String name) {
		this.name = name;
		hp = 100;
<<<<<<< HEAD
		speed = rd.nextInt(3);
=======
		speed = 3;
>>>>>>> 581efb33ba9e5da951183dc172c2d65c0125de46
		defense = 10;
		attack = 20;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = "p1";
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int power) {
		this.attack = power;
	}

	//////

	// 공격을 하다
	public void attackPerson(Person2 person) {

		result = defense - rd.nextInt(10);
		System.out.println(" 공격(" + (this.attack - result) + ") 합니다");
		person.beAttackPerson(this.attack - result); // 호출
	}

	// 공격을 받다.
	public void beAttackPerson(int ap) {
<<<<<<< HEAD
		if (this.hp <= 0) {
=======
		if (hp <= 0) {
>>>>>>> 581efb33ba9e5da951183dc172c2d65c0125de46
			System.err.println("P1이 사망하였습니다");
			hp = 0;
			return;
		}
		hp -= ap;

	}

	public void healingPerson(Items item) {
		if (chance <= 0) {
			System.out.println("포션이 없어 회복이 불가합니다");
			return;
		} else {
			System.out.println("포션을 마시고 15hp를 회복합니다");
			item.usePotionP1(null);
			chance -= 1;
		}
	}
	// 이벤트 발생
	// rain;
	// wind;
	// thunderbolt;
	// normal;

}// end of class
