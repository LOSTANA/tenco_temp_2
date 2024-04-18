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
	


	
	
	
	//공격 당해서 죽음
	/*
	public void beAttacked(int power) {
		if ( hp <= 0 ) {
			System.out.println("당신은 죽었습니다");
			hp = 0;
			return;
		}
	}*/
}
