package com.tenco.temp2;

public class Person2 {

	// 체력 속도 방어력 공격력
	private String name;
	private int hp;
	private int speed;
	private int ap; // 공격력
	private int sp; // 방어력

	// 스탯
	public Person2(String name) {
		this.name = name;
		hp = 100;
		ap = 20;
		sp = 3;
		speed = 30;
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

	public int getAp() {
		return ap;
	}

	public void setAp(int ap) {
		this.ap = ap;
	}

	public int getSp() {
		return sp;
	}

	public void setSp(int sp) {
		this.sp = sp;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// 공격
	public void attackPerson1(Person1 p1) {
		System.out.println(this.name + " 이 " + p1.getName() + " 을 공격합니다.");
		p1.beAttacked(int ap);
	}

	// 공격 당하기
	public void beAttacked(int ap) {
		// 방어적 코드
		if (hp <= 0) {
			System.out.println("[" + this.name + "] 이미 사망하였습니다. ");
			hp = 0;
			return;
		}
		hp = hp + sp - ap;
	}

	public void showInfo() {
		System.out.println("====== 상태창 =======");
		System.out.println("이름 : " + this.name);
		System.out.println("체력 : " + this.hp);
		System.out.println("공격력 : " + this.ap); 
		System.out.println("방어력 : " + this.sp);
		System.out.println("스피드 : " + this.speed);
		System.out.println("===================");
	}

}
