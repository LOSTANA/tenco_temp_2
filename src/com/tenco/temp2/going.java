package com.tenco.temp2;

import java.util.Random;
import java.util.Scanner;

public class going {
	
	String name;
	int gun;
	Random rd = new Random();
	
	Scanner sc = new Scanner(System.in);
	int choose;

	public void start() {

		System.out.println("캐릭터를 정해주세요");
		choose = sc.nextInt();
		if (choose == 1) {

		} else if (choose == 2) {

		} else {
			System.out.println("잘못된 입력입니다! 시작화면으로 되돌아갑니다");
			return;
		}

	}

	public void ing() {
		System.out.println("=======================================");
		System.out.println("다음 행동을 정해주세요");
		System.out.println("1. 공격한다 2. 회복한다 3. 회피한다");
		System.out.print("선택 : ");
		choose = sc.nextInt();

		if (choose == 1) {

		} else if (choose == 2) {

		} else if (choose == 3) {

		} else {

		}

	}
	
	public void event() {
		System.out.println("현재 다음과 발생하는 이벤트는 다음과 같습니다");
		System.out.println();
		System.out.println("확률성에 의해 다음과 아이템을 장착 중입니다 : " + );
	}
	
	public int event(int gun) {
		
	}

}
