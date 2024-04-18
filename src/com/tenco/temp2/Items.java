package com.tenco.temp2;

public class Items {

// Person1
	
	public void usePotionP1(Person1 person1) {
		int p1Hp = person1.getHp();
		int setHp1 =(p1Hp += 15);
		person1.setHp(setHp1);
	}
	
	public void equipRevolver1P1(Person1 person1) {
		int p1Ap = person1.getAp();
		int setAp1 =(p1Ap += 3);
		person1.setAp(setAp1);
	}
	
	public void equipRevolver1P1(Person1 person1) {
		int p1Ap = person1.getAp();
		int setAp1 =(p1Ap += 7);
		person1.setAp(setAp1);
	}
	
	public void equipPistol1P1(Person1 person1) {
		int p1Ap = person1.getAp();
		int p1Speed = person1.getSpeed();
		int setAp1 =(p1Ap += 1);
		int setSpeed1 =(p1Speed += 5);
		person1.setAp(setAp1);
		person1.setSp(setSpeed1);
		
	}
	
	public void equipPistol1P1(Person1 person1) {
		int p1Ap = person1.getAp();
		int p1Speed = person1.getSpeed();
		int setAp1 =(p1Ap += 4);
		int setSpeed1 =(p1Speed += 10);
		person1.setAp(setAp1);
		person1.setSp(setSpeed1);
	}
	
	public void equipHolsterP1(Person1 person1) {
		int p1Speed = person1.getSpeed();
		int setSpeed1 =(p1Speed += 15);
		person1.setSp(setSpeed1);
	}
	
	public void equipArmorP1(Person1 person1) {
		int p1Sp = person1.getSp();
		int setSp1 =(p1Sp += 1);
		person1.setSp(setSp1);
	}
	
// Person2
	
	public void usePotionP2(Person2 person2) {
		int p2Hp = person2.getHp();
		int setHp2 =(p2Hp += 15);
		person2.setHp(setHp2);
	}
	
	public void equipRevolver1P2(Person2 person2) {
		int p2Ap = person2.getAp();
		int setAp2 =(p2Ap += 3);
		person2.setAp(setAp2);
	}
	
	public void equipRevolver2P2(Person2 person2) {
		int p2Ap = person2.getAp();
		int setAp2 =(p2Ap += 7);
		person2.setAp(setAp2);
	}
	
	public void equipPistol1P2(Person2 person2) {
		int p2Ap = person2.getAp();
		int p2Speed = person2.getSpeed();
		int setAp2 =(p2Ap += 2);
		int setSpeed2 =(p2Speed += 5);
		person2.setAp(setAp2);
		person2.setSp(setSpeed2);
		
	}
	
	public void equipPistol2P2(Person2 person2) {
		int p2Ap = person2.getAp();
		int p2Speed = person2.getSpeed();
		int setAp2 =(p2Ap += 4);
		int setSpeed2 =(p2Speed += 10);
		person2.setAp(setAp2);
		person2.setSp(setSpeed2);
	}
	
	public void equipHolsterP2(Person2 person2) {
		int p2Speed = person2.getSpeed();
		int setSpeed2 =(p2Speed += 15);
		person2.setSp(setSpeed2);
	}
	
	public void equipArmorP2(Person2 person2) {
		int p2Sp = person2.getSp();
		int setSp2 =(p2Sp += 2);
		person2.setSp(setSp2);
	}

}
