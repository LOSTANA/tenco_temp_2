package com.tenco.temp2;

public class Person2 {

	private String name;
	private int hp;
	private int ap; // 공격력
	private int sp; // 방어력
	private int speed;

	// 스탯
	public Person2() {
		name = "p2";
		hp = 100;
		ap = 10;
		sp = 30;
		speed = 3;
	}
	

	public String getName() {
		return name;
	}
	
	public void setName(int a) {
		this.name = "p2";
	}

	
	public int getHp() {
		return hp;
	}

	

	public int getAp() {
		return ap;
	}

	
	public int getSp() {
		return sp;
	}

	

	public int getSpeed() {
		return speed;
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

	// 이벤트 발생
	// 공격력 감소(0) 비 
	
	
	// 방어력 감소 벼락-
	
	// 스피드 감소 바람+
	
	
	
	

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
