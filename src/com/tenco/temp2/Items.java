package com.tenco.temp2;

public class Items {

	public void useItem(int pickNum) {
		if (pickNum == 1) {
			usePotion();
			return;
		} else if (pickNum == 2) {
			equipRevolver();
			return;
		} else if (pickNum == 3) {
			equipHolster();
			return;
		} else if (pickNum == 4) {
			equipArmor();
		}

	}

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

	public void equipRevolver() {
		power += 10;
	}

	public void equipHolster() {
		speed += 10;
	}

	public void equipArmor() {
		defense += 10;
	}

}
