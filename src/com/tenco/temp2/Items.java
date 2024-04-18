package com.tenco.temp2;

public class Items {


	public void showInfo() {
		System.out.println("======== 아이템 목록 ========");
		System.out.println("포션");
		System.out.println("리볼버");
		System.out.println("총집");
		System.out.println("방탄복");
		System.out.println("=============================");
	}

	public void usePotion() {
		hp += 15;
	}

	public void equipRevolver1() {
		power += 5;
	}
	
	public void equipRevolver2() {
		power += 10;
	}
	
	public void equipPistol1() {
		power += 3;
		speed += 5;
	}
	
	public void equipPistol2() {
		power += 7;
		speed += 10;
	}

	public void equipHolster() {
		speed += 10;
	}

	public void equipArmor() {
		defense += 10;
	}

}
