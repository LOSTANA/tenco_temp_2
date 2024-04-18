package com.tenco.temp2;



public class Person1 {
	
	//체력, 속도, 방어력, 공격력
	
	String name;
	private int hp; //체력
	private int speed; //속도
	private int defense; //방어력
	private int power; //공격력
	
	
	//?
	public void person1(String myName) {
		name = myName;
		hp = 100;
		speed = 1;
		defense = 1;
		power = 1;
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
		return defense;
	}


	public void setDefense(int defense) {
		this.defense = defense;
	}


	public int getPower() {
		return power;
	}


	
	public void setPower(int power) {
		this.power = power;
	}
	
	
	
		
	
	
	


	//////


	//공격을 하다
	public void attackPerson(Person1 person) {
		System.out.println("공격(" + this.power + ") 합니다");
		person.beAttackPerson(this.power); // 호출
	}
	
	// 내가 공격을 받다.
	public void beAttackPerson(int power) {
		if ( hp <= 0 ) {
			System.out.println("당신은 죽었습니다");
			hp = 0;
			return;
		}
		hp -= power;

	
	
	}
	
}
