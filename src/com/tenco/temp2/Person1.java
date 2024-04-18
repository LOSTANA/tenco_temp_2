package com.tenco.temp2;

public class Person1 {

	private String name;
	private int hp; // 체력
	private int speed; // 속도
	private int sp; // 방어력
	private int ap; // 공격력

	// 스탯
	public void person1() {
		name = "p1";
		hp = 100;
		speed = 1;
		sp = 1;
		ap = 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return sp;
	}

	public void setDefense(int defense) {
		this.sp = defense;
	}

	public int getPower() {
		return ap;
	}

	public void setPower(int power) {
		this.sp = power;
	}

	//////

	// 공격을 하다
	public void attackPerson(Person1 person) {
		System.out.println("공격(" + this.ap + ") 합니다");
		person.beAttackPerson(this.ap); // 호출
	}

	// 공격을 받다.
	public void beAttackPerson(int ap) {
		if (hp <= 0) {
			System.out.println("당신은 죽었습니다");
			hp = 0;
			return;
		}
		hp -= ap;
		
	}
	
	//이벤트 발생
	// rain;
	// wind;
	// thunderbolt;
	// normal;


}//end of class
