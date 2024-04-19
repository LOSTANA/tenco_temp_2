package com.tenco.temp2;

public class Items {

// Person1
	
	public void usePotionP1(Person1 person) {
		int p1Hp = person.getHp();
		int setHp1 =(p1Hp += 15);
		person.setHp(setHp1);
	}
	
	public void equipRevolver1P1(Person1 person) {
		int p1Ap = person.getAttack();
		int setAp1 =(p1Ap += 3);
		person.setAttack(setAp1);
	}
	
	public void equipRevolver2P1(Person1 person) {
		int p1Ap = person.getAttack();
		int setAp1 =(p1Ap += 7);
		person.setAttack(setAp1);
	}
	
	/*public void equipPistol1P1() {
		int p1Ap = person1.getAttack();
		int p1Speed = person1.getSpeed();
		int setAp1 =(p1Ap += 1);
		int setSpeed1 =(p1Speed += 5);
		person1.setAttack(setAp1);
		person1.setSpeed(setSpeed1);
		
	}
	
	public void equipPistol2P1() {
		int p1Ap = person1.getAttack();
		int p1Speed = person1.getSpeed();
		int setAp1 =(p1Ap += 4);
		int setSpeed1 =(p1Speed += 10);
		person1.setAttack(setAp1);
		person1.setAttack(setSpeed1);
	}
	
	public void equipHolsterP1() {
		int p1Speed = person1.getSpeed();
		int setSpeed1 =(p1Speed += 15);
		person1.setAttack(setSpeed1);
	}
	
	public void equipArmorP1() {
		int p1Sp = person1.getDefense();
		int setSp1 =(p1Sp += 1);
		person1.setDefense(setSp1);
	}*/
	
// Person2
	
	
	public void usePotionP2(Person2 person2) {
		int p2Hp = person2.getHp();
		int setHp2 =(p2Hp += 15);
		person2.setHp(setHp2);
	}
	
	public void equipRevolver1P2(Person2 person2) {
		int p2Ap = person2.getAttack();
		int setAp2 =(p2Ap += 3);
		person2.setAttack(setAp2);
	}
	
	public void equipRevolver2P2(Person2 person2) {
		int p2Ap = person2.getAttack();
		int setAp2 =(p2Ap += 7);
		person2.setAttack(setAp2);
	}
	
	/*public void equipPistol1P2() {
		int p2Ap = person2.getAttack();
		int p2Speed = person2.getSpeed();
		int setAp2 =(p2Ap += 2);
		int setSpeed2 =(p2Speed += 5);
		person2.setAttack(setAp2);
		person2.setAttack(setSpeed2);
		
	}
	
	public void equipPistol2P2() {
		int p2Ap = person2.getAttack();
		int p2Speed = person2.getSpeed();
		int setAp2 =(p2Ap += 4);
		int setSpeed2 =(p2Speed += 10);
		person2.setAttack(setAp2);
		person2.setSpeed(setSpeed2);
	}
	
	public void equipHolsterP2() {
		int p2Speed = person2.getSpeed();
		int setSpeed2 =(p2Speed += 15);
		person2.setSpeed(setSpeed2);
	}*/
	
	public void equipArmorP2(Person2 person2) {
		int p2Sp = person2.getDefense();
		int setSp2 =(p2Sp += 2);
		person2.setDefense(setSp2);
	}


}
